package com.tmb.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants() {
		
	}
	
	private static final String CHROMEDRIVERPATH= System.getProperty("user.dir")+"/src/test/resources/Executables/chrome.exe";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

}
