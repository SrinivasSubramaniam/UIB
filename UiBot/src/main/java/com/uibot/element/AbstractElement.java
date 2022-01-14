package com.uibot.element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.uibot.browser.AbstractDriver;

public abstract class AbstractElement extends AbstractDriver implements WebEdit, WebButton, WebSelect{

	private WebElement ele;
	
	@Override
	public String getText() {
		return ele.getText();
	}

	@Override
	public String getAttribute(String attribute) {
		return ele.getAttribute(attribute);
	}

	@Override
	public void locateElement(LocatorType locatorType, String locator) {
		switch (locatorType.toString()) {
		case "ID":
			ele = driver.findElement(By.id(locator));
			break;
		case "XPATH":
			ele = driver.findElement(By.xpath(locator));
			break;
		case "CLASSNAME":
			ele = driver.findElement(By.className(locator));
			break;
		case "LINKTEXT":
			ele = driver.findElement(By.linkText(locator));
			break;
		default:
			break;
		}
	}

	@Override
	public void clear() {
		ele.clear();
	}

	@Override
	public void type(String text) {
		ele.sendKeys(text);
	}
	
	public void type(LocatorType locatorType, String locator, String text) {
		locateElement(locatorType, locator);
		ele.sendKeys(text);
	}

	@Override
	public void typeAndKeyAction(String text, Keys keys) {
		ele.sendKeys(text, keys);
	}

	@Override
	public void click() {
		ele.click();
	}
	
	public void click(LocatorType locatorType, String locator) {
		locateElement(locatorType, locator);
		ele.click();
	}
}
