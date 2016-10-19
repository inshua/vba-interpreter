package org.siphon.visualbasic.runtime;

import java.util.HashSet;

import vba.VbaParser.CveMultContext;

public class StringExpr {

	public static VbValue like(VbValue string, VbValue wildCardPattern) {
		String s = (String) VbValue.CStr(string).value;
		String pattern = (String) VbValue.CStr(wildCardPattern).value;
		return new VbValue(VbVarType.VbBoolean, IsLike(s, pattern) ? -1 : 0);
	}

	/// <summary>
	/// Implement's VB's Like operator logic.
	/// FROM 
	/// Implementing VB's Like Operator in C#
	/// 	http://www.blackbeltcoder.com/Articles/net/implementing-vbs-like-operator-in-c
	/// </summary>
	public static boolean IsLike(String s, String pattern) {
		// Characters matched so far
		int matched = 0;

		// Loop through pattern string
		for (int i = 0; i < pattern.length();) {
			// Check for end of string
			if (matched > s.length())
				return false;

			// Get next pattern character
			char c = pattern.charAt(i++);
			if (c == '[') // Character list
			{
				// Test for exclude character
				boolean exclude = (i < pattern.length() && pattern.charAt(i) == '!');
				if (exclude)
					i++;
				// Build character list
				int j = pattern.indexOf(']', i);
				if (j < 0)
					j = s.length();
				HashSet<Character> charList = CharListToSet(pattern.substring(i, j));
				i = j + 1;

				if (charList.contains(s.charAt(matched)) == exclude)
					return false;
				matched++;
			} else if (c == '?') // Any single character
			{
				matched++;
			} else if (c == '#') // Any single digit
			{
				if (!Character.isDigit(s.charAt(matched)))
					return false;
				matched++;
			} else if (c == '*') // Zero or more characters
			{
				if (i < pattern.length()) {
					// Matches all characters until
					// next character in pattern
					char next = pattern.charAt(i);
					int j = s.indexOf(next, matched);
					if (j < 0)
						return false;
					matched = j;
				} else {
					// Matches all remaining characters
					matched = s.length();
					break;
				}
			} else // Exact character
			{
				if (matched >= s.length() || c != s.charAt(matched))
					return false;
				matched++;
			}
		}
		// Return true if all characters matched
		return (matched == s.length());
	}

	/// <summary>
	/// Converts a string of characters to a HashSet of characters. If the string
	/// contains character ranges, such as A-Z, all characters in the range are
	/// also added to the returned set of characters.
	/// </summary>
	/// <param name="charList">Character list string</param>
	private static HashSet<Character> CharListToSet(String charList) {
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < charList.length(); i++) {
			if ((i + 1) < charList.length() && charList.charAt(i + 1) == '-') {
				// Character range
				char startChar = charList.charAt(i++);
				i++; // Hyphen
				char endChar = (char) 0;
				if (i < charList.length())
					endChar = charList.charAt(i++);
				for (int j = startChar; j <= endChar; j++)
					set.add((char) j);
			} else
				set.add(charList.charAt(i));
		}
		return set;
	}

}
