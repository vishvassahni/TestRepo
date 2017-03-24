package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestAlphaNumericChar {

	public static void main(String[] args) {
		
		//System.out.println(Regex.ALPHA_NUM_SPECIAL_CHAR_PATTERN.getPattern());
		// TODO Auto-generated method stub
		if(true) {
		if(!alphaNumericSpcialCharChecker("456d-960w-2200-199d-we2d")) {
			System.out.println("alpha num only......");
			return;
		}
		System.out.println(alphaNumericSpcialCharChecker("LOkesh123_@"));
		
		System.out.println(alphaNumericSpcialCharChecker("LOkesh123_@"));
		}
		
		System.out.println("finished........");
	}

	
	public static boolean alphaNumericSpcialCharChecker(String checker) {
		String regex = "^[a-zA-Z0-9]{4}(-)[a-zA-Z0-9]{4}(-)[a-zA-Z0-9]{4}(-)[a-zA-Z0-9]{4}(-)[a-zA-Z0-9]{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(checker);
		return matcher.matches();
	}
	
	
	public enum Regex {
		
		PATTERNS("^[a-zA-Z0-9-_]+$","^[a-zA-Z0-9]{4}(-)[a-zA-Z0-9]{4}(-)[a-zA-Z0-9]{4}(-)[a-zA-Z0-9]{4}(-)[a-zA-Z0-9]{4}$");
		
		private String alphaNumSpecialCharPattern;
		private String alphaNumWithDashPattern;

		private Regex(String alphaNumSpecialCharPattern, String alphaNumWithDashPattern) {
			this.alphaNumSpecialCharPattern = alphaNumSpecialCharPattern;
			this.alphaNumWithDashPattern = alphaNumWithDashPattern;
		}

		public String getAlphaNumSpecialCharPattern() {
			return alphaNumSpecialCharPattern;
		}
		
		public String getAlphaNumWithDashPattern() {
			return alphaNumWithDashPattern;
		}

	}
	
}


