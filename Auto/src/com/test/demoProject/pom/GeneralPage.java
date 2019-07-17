package com.test.demoProject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage extends GeneralPOM{
	//locator
	private By _imgAvata = new By.ByCssSelector(".avatar-user");
	//Element
	protected WebElement imgAvata = waitForClickable(_imgAvata);
	
	//Methods

	public boolean isLoginSuccessful()
	{
		try {
			return imgAvata.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
