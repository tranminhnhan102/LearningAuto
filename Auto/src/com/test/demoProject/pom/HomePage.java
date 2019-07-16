package com.test.demoProject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testfw.element.BaseElement;

public class HomePage {
	protected By _btnLogin = new By.ByXPath("//a[span[text()='Đăng nhập']]");
	
	WebElement btnLogin = new BaseElement(_btnLogin).getElement();
	
	public HomePage() {
		
	}
	
	public LoginPage gotoLoginPage() {
		btnLogin.click();
		return new LoginPage();
	}

}
