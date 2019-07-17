package com.test.demoProject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testfw.common.Constants;

public class GeneralPOM {
	private WebDriver driver = Constants.DRIVER;
	
	public WebElement waitForDisplay(By locator, int timeOutInSeconds) {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception error) {
			error.printStackTrace();
			throw error;
		}
		return element;
	}

	public WebElement waitForDisplay(By locator) {
		return waitForDisplay(locator, Constants.ELEMENT_TIMEOUT);
	}
	
	public WebElement waitForClickable(By locator, int timeOutInSeconds)
	{
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception error) {
			error.printStackTrace();
			throw error;
		}
		return element;
	}
	
	public WebElement waitForClickable(By locator) {
		return waitForClickable(locator, Constants.ELEMENT_TIMEOUT);
	}
}
