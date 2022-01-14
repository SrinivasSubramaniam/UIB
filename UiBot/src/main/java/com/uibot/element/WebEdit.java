package com.uibot.element;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;

public interface WebEdit extends WebElement{
	
	/**
	 * Clear the existing text
	 * @author babu
	 * @exception ElementNotInteractableException
	 * @see 
	 */
	public void clear();
	
	/**
	 * Type the text upon clearing
	 * @author babu
	 * @exception ElementNotInteractableException
	 * @see 
	 */
	public void type(String text);
	
	/**
	 * Type and Keyboard Action
	 * @author babu
	 * @exception ElementNotInteractableException
	 * @see 
	 */
	public void typeAndKeyAction(String text, Keys keys);

}
