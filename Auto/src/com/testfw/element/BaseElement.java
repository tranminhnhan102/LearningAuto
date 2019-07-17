package com.testfw.element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.testfw.common.Constants;
import com.testfw.driver.BaseDriver;

public class BaseElement{
	private By _byLocator;
	private WebDriver driver = Constants.DRIVER;
	public BaseElement(By locator) {
		this._byLocator = locator;
	}

	public BaseElement(String xpath) {
		this._byLocator = By.xpath(xpath);
	}
	
//	public WebElement getElement()
//	{
////		return Constants.DRIVER.waitForDisplay(_byLocator, Constants.ELEMENT_TIMEOUT);
//	}
	public void click() {
		// TODO Auto-generated method stub
		
	}

	
	public void submit() {
		// TODO Auto-generated method stub
		
	}

	
	public void sendKeys(CharSequence... keysToSend) {
		// TODO Auto-generated method stub

	}

	
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getCssValue(String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}
}