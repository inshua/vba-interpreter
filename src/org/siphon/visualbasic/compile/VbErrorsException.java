package org.siphon.visualbasic.compile;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class VbErrorsException extends Exception {

	public VbErrorsException(List<Exception> errors) {
		super("errors exists: \r\n " + StringUtils.join(errors, "\r\n"));
	}

}
