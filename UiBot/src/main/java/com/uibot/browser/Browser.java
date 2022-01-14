package com.uibot.browser;

import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public interface Browser {
	
	/**
	 * Launches the default browser with no additional capabilities
	 * @author babu
	 * @return The driver object of the browser opened 
	 * @see 
	 */
	public RemoteWebDriver launchBrowser();
	
	
	/**
	 * Close the current active browser
	 * @author babu
	 * @see launchBrowser
	 */
	public void closeBrowser();
	
	
	/**
	 * Launches any browser of choice with no additional capabilities
	 * @author babu
	 * @return The driver object of the browser opened 
	 * @see 
	 */
	public RemoteWebDriver launchBrowser(BrowserType type);
	
	/**
	 * Launches the default browser with set of desired capabilities
	 * @author babu
	 * @return The driver object of the browser opened 
	 * @see 
	 */
	public RemoteWebDriver launchBrowser(DesiredCapabilities capabilities);
	
	/**
	 * Launches the any browser with set of desired capabilities
	 * @author babu
	 * @return The driver object of the browser opened 
	 * @see 
	 */
	public RemoteWebDriver launchBrowser(BrowserType type, DesiredCapabilities capabilities);

	/**
	 * Pause the action for a while (given seconds)
	 * @author babu
	 * @see 
	 */
	public void pause(long seconds);

}
