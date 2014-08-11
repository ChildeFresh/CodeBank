package com.childefresh.utils;


public class StringUtils {

	private StringUtils() {
		super();
	}
	
	public static boolean isString() {
		return true;
	}
	
	public static String trimBoth(final String str){
		return str==null?null:str.trim();
	}
	
}
