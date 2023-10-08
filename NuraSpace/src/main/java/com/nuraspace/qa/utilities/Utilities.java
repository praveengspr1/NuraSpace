package com.nuraspace.qa.utilities;

import java.util.Date;

public class Utilities {


	public static String generateMaildByGetTimeStamp() {

		Date date = new Date();
		String string = date.toString();
		String replace = string.replace(" ","_").replace(":", "_");

		return "praveen"+replace+"@gmail.com";	

	}

	public static final int IMPLICITY_WAIT =10;
	public static final int PAGE_OUT_TIME_OUT =5;
}
