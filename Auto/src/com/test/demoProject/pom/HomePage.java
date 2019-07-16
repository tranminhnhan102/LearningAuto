package com.test.demoProject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testfw.element.BaseElement;

public class HomePage {
	protected By _btnLogin = new By.ByXPath("//a[span[text()='Đăng nhập']]");
	BaseElement element = new BaseElement(_btnLogin);
	
	public HomePage() {
		
	}
	
	public LoginPage gotoLoginPage() {
		return new LoginPage();
	}

}
