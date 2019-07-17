package com.testfw.common;

public class Utilities {
	public static String getProjectPath() {
		String workingDir = System.getProperty("user.dir");
		System.out.println("Current working directory : " + workingDir);
		return workingDir;
	}
}
