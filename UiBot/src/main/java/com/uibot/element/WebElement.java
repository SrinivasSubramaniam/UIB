package com.uibot.element;

import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;

public interface WebElement {
	
	/**
	 * Return the text of the webelement
	 * @return the content of the element text 
	 * @author babu
	 * @exception StaleElementReferenceException
	 * @see 
	 */
	public String getText();
	
	/**
	 * Return the attribute of the webelement
	 * @return the content of the element text 
	 * @author babu
	 * @exception StaleElementReferenceException
	 * @see 
	 */
	public String getAttribute(String attribute);

	/**
	 * Find the webelement based on the locator
	 * @return the webelement of Selenium Webdriver 
	 * @author babu
	 * @exception NoSuchElementException
	 * @see 
	 */
	public void locateElement(LocatorType locatorType, String locator);
	
	
	/**
	 * Click on the given element
	 * @author babu
	 * @exception NoSuchElementException
	 * @see 
	 */
	public void click();
	
	
	
	
	
	
	
}
