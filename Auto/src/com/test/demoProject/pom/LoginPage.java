package com.test.demoProject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.demoProject.dataObject.User;
import com.testfw.common.Constants;
import com.testfw.element.Element;

public class LoginPage extends GeneralPOM{
	//locator
//	private By _txtUserName = new By.ByCssSelector("input[name='Email']");
	private By _txtUserName = new By.ByCssSelector(".form-group #Email");
	private By _txtPassWord = new By.ByCssSelector("input[type='password']");
	private By _btnLogin = new By.ByCssSelector("#bt_submit");
	
	//Element
	protected WebElement txtUserName = waitForDisplay(_txtUserName);
	protected WebElement txtPassWord = waitForDisplay(_txtPassWord);
	protected WebElement btnLogin = waitForDisplay(_btnLogin);
	
	public LoginPage() {
		
	}
	
	public HomePage login(User user)
	{
		txtUserName.sendKeys(user.getUserName());
		txtPassWord.sendKeys(user.getPassWord());
		btnLogin.click();
		return new HomePage();
	}

}
