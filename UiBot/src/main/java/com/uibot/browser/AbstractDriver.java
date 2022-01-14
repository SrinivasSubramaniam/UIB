package com.uibot.browser;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.uibot.utilities.LibMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractDriver implements Browser, TargetLocators {

	protected static RemoteWebDriver driver = null;
	
	@Override
	public RemoteWebDriver launchBrowser() {
		
		// Get the properties and find out what is the default browser
		String browser = LibMethods.loadProp().getProperty("browser");
		switch (browser) {
		case "firefox":
			return launchBrowser(BrowserType.FIREFOX);
		default:
			return launchBrowser(BrowserType.CHROME);
		}
			
	}

	@Override
	public RemoteWebDriver launchBrowser(BrowserType type) {
		try {
			
			// Based on browser, you create object and launch
			switch (type.toString().toLowerCase()) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;		
			default:
				break;
			}
			
			// Get the properties and find out what is the url
			String url = LibMethods.loadProp().getProperty("url");
			driver.get(url);
			
			// Specify the implicit timeout
			String implicit = LibMethods.loadProp().getProperty("implicit");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(implicit)));
			
			// Maximise the window
			driver.manage().window().maximize();
			
		} catch (WebDriverException e) {
			System.err.println("The default could not be launched properly");
			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.err.println("The seconds in the config file is not properly numbered");
			e.printStackTrace();
		}
		
		return driver;	
	}
	
	@Override
	public void closeBrowser() {
		driver.close();
	}
	
	@Override
	public String switchToNewTab() {
		Set<String> allTabs = driver.getWindowHandles();
		String newWindow = new ArrayList<>(allTabs).get(allTabs.size()-1);
		driver.switchTo().window(newWindow);
		return newWindow;
	}

	@Override
	public void switchBackToParentTab() {
		driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(0));
	}

	@Override
	public void switchToFrame(WebElement frame) {
		driver.switchTo().frame(frame);
	}
	
	public void switchToFrame(String frame) {
		driver.switchTo().frame(frame);
	}

	
	
	@Override
	public RemoteWebDriver launchBrowser(DesiredCapabilities capabilities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RemoteWebDriver launchBrowser(BrowserType type, DesiredCapabilities capabilities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pause(long seconds) {
		
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
		};
		
	}
	
	
	
	
}
