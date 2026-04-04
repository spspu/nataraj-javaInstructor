package com.mainapp;

import java.util.StringTokenizer;

public class StringUtil {
	
	public static int countWords(String text) {
		StringTokenizer tokenizer = new StringTokenizer(text," ");
		int countTokens = tokenizer.countTokens();
		return countTokens;
	}
}
