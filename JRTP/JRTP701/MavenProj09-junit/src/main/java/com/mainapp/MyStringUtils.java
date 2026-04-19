package com.mainapp;

public class MyStringUtils {
	
	public boolean isPalindrome(String str) {
		int length=str.length();
		StringBuilder reverse=new StringBuilder();
		for(int i=length-1; i>=0; i--) {
			reverse.append(str.charAt(i));
		}
		System.out.println(str+" "+reverse);
		if(str.equals(reverse.toString()))
			return true;
		else
			return false;
	}
	
	public Integer convertStringToInt(String str) {
		if(str==null || str.length()==0 || str.equals(""))
			throw new IllegalArgumentException("Given input must not be null or empty");
		else
			return Integer.parseInt(str);
	}

}
