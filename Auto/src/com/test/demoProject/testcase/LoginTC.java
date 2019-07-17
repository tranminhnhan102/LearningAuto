package com.test.demoProject.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.demoProject.dataObject.User;
import com.test.demoProject.pom.DefaultPage;
import com.test.demoProject.pom.HomePage;
import com.test.demoProject.pom.LoginPage;
import com.testfw.common.BaseTest;

public class LoginTC extends BaseTest{
	@Test
	public void TC_Login()
	{
		User user = new User("nhantm91@gmail.com", "abc12345");
		
//		Navigate to Foody page
		
//		Click "Đăng Nhập" button
		LoginPage login = new DefaultPage().gotoLoginPage();
		
//		Enter Username/Password and click "Đăng Nhập" button
		HomePage homePage = login.login(user); 
//		VP: Verify login is successful, redirect to Home page.	
		boolean actual = homePage.isLoginSuccessful();
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

}
