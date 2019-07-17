package com.testfw.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", Utilities.getProjectPath()+"\\resource\\drivers\\chromedriver.exe");
		Constants.DRIVER= new ChromeDriver();
		Constants.DRIVER.manage().window().maximize();
		Constants.DRIVER.get(Constants.URL);
	}
}
