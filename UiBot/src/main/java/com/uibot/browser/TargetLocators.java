package com.uibot.browser;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;

public interface TargetLocators {
	
	/**
	 * Switch from existing tab to the newly opened tab
	 * @return the window handle of the new tab or null
	 * @author babu
	 * @exception NoSuchWindowException
	 * @see switchBackToParentTab
	 */
	public String switchToNewTab();
	
	
	/**
	 * Switch from new tab to parent tab
	 * @return the window handle of the parent tab or null
	 * @author babu
	 * @exception NoSuchWindowException
	 * @see switchToNewTab
	 */
	public void switchBackToParentTab();
	
	/**
	 * Switch to the named tab
	 * @author babu
	 * @exception NoSuchFrameException
	 * @see 
	 */
	public void switchToFrame(WebElement frame);

}
