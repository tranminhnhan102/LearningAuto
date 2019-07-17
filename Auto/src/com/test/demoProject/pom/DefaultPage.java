package com.test.demoProject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DefaultPage extends GeneralPOM{
	private By _btnLogin = new By.ByXPath("//a[span[text()='Đăng nhập']]");
	//Element
	protected WebElement btnLogin = waitForClickable(_btnLogin);
	
	//Methods
	public LoginPage gotoLoginPage() {
		btnLogin.click();
		return new LoginPage();
	}
}
