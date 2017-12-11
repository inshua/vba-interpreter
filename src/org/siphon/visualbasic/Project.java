/*******************************************************************************
 * Copyright (C) 2017 Inshua<inshua@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package org.siphon.visualbasic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.siphon.visualbasic.compile.Compiler;

public class Project {

	public enum ProjectType{
		Exe,
		OleDll,
		Control,
		OleExe
	}

	private ProjectType type = ProjectType.Exe;
	private List<ProjectReference> references = new ArrayList<>();
	private List<File> moduleFiles = new ArrayList<>();
	private String startup;
	private String commandArgs;
	private String name;
	private Map<String, String> attributes = new HashMap<>();
	private final String charset;
	
	public Project(String vbpPath, String charset) throws IOException, UnspportedActiveXReferenceException {
		this.charset = charset;
		File prj = new File(vbpPath);
		List<String> lines = FileUtils.readLines(prj, charset);
		for(String line : lines){
			if(StringUtils.isNotBlank(line)){
				String[] arr = line.split("=");
				String key = arr[0];
				String value = arr[1];
				
				if(key.equalsIgnoreCase("Type")){
					switch(value.toUpperCase()){
					case "EXE": this.type = ProjectType.Exe; break;
					case "OLEDLL": this.type = ProjectType.OleDll; break;
					case "Control": this.type = ProjectType.OleExe; break;
					case "OleExe": this.type = ProjectType.Control; break;
					}
				}
				
				else if(key.equalsIgnoreCase("Reference")){
					value = value.toUpperCase().substring(2);	// *\G{guid} *\XXX.vbp
					String guidPattern = "^G\\{[0-9A-F]{8}[-]?([0-9A-F]{4}[-]?){3}[0-9A-F]{12}\\}.*";
					if(value.matches(guidPattern)){
						if(value.contains("00020430-0000-0000-C000-000000000046")){
							// OLE Automation
						} else {
							throw new UnspportedActiveXReferenceException(value);
						}
					} else {
						assert value.endsWith(".VBP");
						String filename = value;
						File refVbp = new File(prj.getParentFile(), filename);
						if(!refVbp.exists()) throw new IOException(String.format("%s not found", filename));
						this.references.add(new ProjectReference(refVbp));
					}
				}
				
				else if(key.equalsIgnoreCase("Module") || key.equalsIgnoreCase("Class")){
					arr = value.split(";");
					String moduleName = arr[0];		// 实际上在 .bas,.cls 等都有 VB_Name，这里是重复的
					String moduleFile = arr[1].trim();
					File file = new File(prj.getParentFile(), moduleFile);
					if(!file.exists()) throw new IOException(String.format("%s not found", moduleFile));
					this.moduleFiles.add(file);
				}

				else if(key.equalsIgnoreCase("UserControl")){
					
				}
				
				else if(key.equalsIgnoreCase("Form")){
					File file = new File(prj.getParentFile(), value);
					if(!file.exists()) throw new IOException(String.format("%s not found", value));
					this.moduleFiles.add(file);
				}
				
				else if(key.equalsIgnoreCase("Startup")){		// "Sub Main" or "Form1" or "(None)"
					this.startup = Compiler.unescapeVbString(value);
				}
				
				else if(key.equalsIgnoreCase("Command32")){
					this.commandArgs = value;
				}
				
				else if(key.equalsIgnoreCase("Name")){
					this.name = Compiler.unescapeVbString(value);
				}
				
				else {
					this.attributes.put(key, value);
				}
			}
		}
	}

	public ProjectType getType() {
		return type;
	}

	public List<ProjectReference> getReferences() {
		return references;
	}

	public List<File> getModuleFiles() {
		return moduleFiles;
	}

	public String getStartup() {
		return startup;
	}

	public String getCommandArgs() {
		return commandArgs;
	}

	public String getName() {
		return name;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public String getCharset() {
		return charset;
	}

}
