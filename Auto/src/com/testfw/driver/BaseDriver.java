package com.testfw.driver;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import com.testfw.common.Constants;

public class BaseDriver {

	protected WebDriver _driver;

	protected WebDriver getWebDriver() {
		return this._driver;
	}

	public void get(String url) {
		_driver.get(url);
	}

	public String getCurrentUrl() {
		return _driver.getCurrentUrl();
	}

	public String getTitle() {
		return _driver.getTitle();
	}

	public String getPageSource() {
		return null;
	}

	public void close() {
		if (_driver != null)
			_driver.close();
	}

	public void quit() {
		if (_driver != null)
			_driver.quit();
	}

	public Set<String> getWindowHandles() {
		return null;
	}

	public TargetLocator switchTo() {
		if (_driver != null)
			return _driver.switchTo();
		return null;
	}

	public Navigation navigate() {
		return _driver.navigate();
	}

	public Options manage() {
		if (_driver != null)
			return _driver.manage();
		return null;
	}

	public Actions action() {
		return new Actions(getWebDriver());
	}

	public void alertSendKeys(String keysToSend) {
		_driver.switchTo().alert().sendKeys(keysToSend);
	}

	public String alertGetText() {
		return _driver.switchTo().alert().getText();
	}

	public void alertDismiss() {
		_driver.switchTo().alert().dismiss();
	}

	public void alertAccept() {
		_driver.switchTo().alert().accept();
	}
	
	public Alert isExistAlert(int timeOutInSeconds) {
		Alert alert = null;
		try {
			WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
			alert = wait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception error) {
			error.printStackTrace();
			throw error;
		}
		return alert;
	}

	public Alert isExistAlert() {
		return isExistAlert(Constants.ELEMENT_TIMEOUT);
	}
	
	public WebElement waitForDisplay(By locator, int timeOutInSeconds) {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception error) {
			error.printStackTrace();
			throw error;
		}
		return element;
	}
}
