package com.testfw.common;

import com.testfw.driver.BaseDriver;

public class TestExecutor {
	private static TestExecutor _instance = null;
	public static TestExecutor getInstance()
	{
		if(_instance == null)
			_instance = new TestExecutor();
		return _instance;
	}
	
}
