package com.cucumber.automation.utils;

public class config {

	public static String workspace = System.getProperty("user.dir");	
	public static String src = workspace + "\\src\\";
	public static String driver = workspace + "\\driver\\";
	public static String firefoxDriver = driver + "geckodriver.exe";
	public static String chromeDriver = driver + "chromedriver.exe";
	public static String IEDriver = driver + "IEDriverServer.exe";
}
