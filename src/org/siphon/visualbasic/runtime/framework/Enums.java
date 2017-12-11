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
package org.siphon.visualbasic.runtime.framework;

public class Enums {

	public class VbMsgBoxStyle {
		public static final int vbOKOnly = 0;
		public static final int vbOKCancel = 1;
		public static final int vbAbortRetryIgnore = 2;
		public static final int vbYesNoCancel = 3;
		public static final int vbYesNo = 4;
		public static final int vbRetryCancel = 5;
		public static final int vbCritical = 16;
		public static final int vbQuestion = 32;
		public static final int vbExclamation = 48;
		public static final int vbInformation = 64;
		public static final int vbDefaultButton1 = 0;
		public static final int vbDefaultButton2 = 256;
		public static final int vbDefaultButton3 = 512;
		public static final int vbDefaultButton4 = 768;
		public static final int vbApplicationModal = 0;
		public static final int vbSystemModal = 4096;
		public static final int vbMsgBoxHelpButton = 16384;
		public static final int vbMsgBoxRight = 524288;
		public static final int vbMsgBoxRtlReading = 1048576;
		public static final int vbMsgBoxSetForeground = 65536;
	}

	public class VbMsgBoxResult {
		public static final int vbOK = 1;
		public static final int vbCancel = 2;
		public static final int vbAbort = 3;
		public static final int vbRetry = 4;
		public static final int vbIgnore = 5;
		public static final int vbYes = 6;
		public static final int vbNo = 7;
	}

	public class VbFileAttribute {
		public static final int vbNormal = 0;
		public static final int vbReadOnly = 1;
		public static final int vbHidden = 2;
		public static final int vbSystem = 4;
		public static final int vbVolume = 8;
		public static final int vbDirectory = 16;
		public static final int vbArchive = 32;
		public static final int vbAlias = 64;
	}

	public class VbStrConv {
		public static final int vbUpperCase = 1;
		public static final int vbLowerCase = 2;
		public static final int vbProperCase = 3;
		public static final int vbWide = 4;
		public static final int vbNarrow = 8;
		public static final int vbKatakana = 16;
		public static final int vbHiragana = 32;
		public static final int vbUnicode = 64;
		public static final int vbFromUnicode = 128;
	}

	public class VbDayOfWeek {
		public static final int vbUseSystemDayOfWeek = 0;
		public static final int vbSunday = 1;
		public static final int vbMonday = 2;
		public static final int vbTuesday = 3;
		public static final int vbWednesday = 4;
		public static final int vbThursday = 5;
		public static final int vbFriday = 6;
		public static final int vbSaturday = 7;
	}

	public class VbFirstWeekOfYear {
		public static final int vbUseSystem = 0;
		public static final int vbFirstJan1 = 1;
		public static final int vbFirstFourDays = 2;
		public static final int vbFirstFullWeek = 3;
	}

	public class VbIMEStatus {
		public static final int vbIMENoOp = 0;
		public static final int vbIMEModeNoControl = 0;
		public static final int vbIMEOn = 1;
		public static final int vbIMEModeOn = 1;
		public static final int vbIMEOff = 2;
		public static final int vbIMEModeOff = 2;
		public static final int vbIMEDisable = 3;
		public static final int vbIMEModeDisable = 3;
		public static final int vbIMEHiragana = 4;
		public static final int vbIMEModeHiragana = 4;
		public static final int vbIMEKatakanaDbl = 5;
		public static final int vbIMEModeKatakana = 5;
		public static final int vbIMEKatakanaSng = 6;
		public static final int vbIMEModeKatakanaHalf = 6;
		public static final int vbIMEAlphaDbl = 7;
		public static final int vbIMEModeAlphaFull = 7;
		public static final int vbIMEAlphaSng = 8;
		public static final int vbIMEModeAlpha = 8;
		public static final int vbIMEModeHangulFull = 9;
		public static final int vbIMEModeHangul = 10;
	}

	public class VbAppWinStyle {
		public static final int vbHide = 0;
		public static final int vbNormalFocus = 1;
		public static final int vbMinimizedFocus = 2;
		public static final int vbMaximizedFocus = 3;
		public static final int vbNormalNoFocus = 4;
		public static final int vbMinimizedNoFocus = 6;
	}

	public class VbCompareMethod {
		public static final int vbBinaryCompare = 0;
		public static final int vbTextCompare = 1;
		public static final int vbDatabaseCompare = 2;
	}

	public class VbCalendar {
		public static final int vbCalGreg = 0;
		public static final int vbCalHijri = 1;
	}

	public class VbDateTimeFormat {
		public static final int vbGeneralDate = 0;
		public static final int vbLongDate = 1;
		public static final int vbShortDate = 2;
		public static final int vbLongTime = 3;
		public static final int vbShortTime = 4;
	}

	public class VbTriState {
		public static final int vbUseDefault = -2;
		public static final int vbTrue = -1;
		public static final int vbFalse = 0;
	}

	public class VbCallType {
		public static final int VbMethod = 1;
		public static final int VbGet = 2;
		public static final int VbLet = 4;
		public static final int VbSet = 8;
	}

}
