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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testfw.common.Constants;

public class Element {
	private WebDriver driver;
	public WebElement element = new WebElement() {

		@Override
		public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void submit() {
			// TODO Auto-generated method stub

		}

		@Override
		public void sendKeys(CharSequence... keysToSend) {
			// TODO Auto-generated method stub
		}

		@Override
		public boolean isSelected() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isDisplayed() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getTagName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Dimension getSize() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Rectangle getRect() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Point getLocation() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getCssValue(String propertyName) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getAttribute(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<WebElement> findElements(By by) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebElement findElement(By by) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void click() {
			// TODO Auto-generated method stub

		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub

		}

		public WebElement waitForDisplay(int timeOutInSeconds) {
			WebElement element = null;
			try {
				WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
				element = wait.until(ExpectedConditions.visibilityOf(element));
			} catch (Exception error) {
				error.printStackTrace();
				throw error;
			}
			return element;
		}

		public WebElement waitForDisplay() {
			return waitForDisplay(Constants.ELEMENT_TIMEOUT);
		}
	};
}
