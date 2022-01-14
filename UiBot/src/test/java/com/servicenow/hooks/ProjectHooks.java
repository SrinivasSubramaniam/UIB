package com.servicenow.hooks;
import org.testng.annotations.BeforeMethod;

import com.uibot.element.LocatorType;
import com.uibot.hooks.RunnerHooks;

public class ProjectHooks extends RunnerHooks{
	
	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod();
		switchToFrame("gsft_main");
		type(LocatorType.ID, "user_name","admin");
		type(LocatorType.ID, "user_password","gEOeSBSay2z5");
		click(LocatorType.ID, "sysverb_login");
	}

}

/*

Method Overloading - locateElement, type ... 
Method Overriding - beforeMethod (framework vs project)
Inheritance - test case -> hooks -> hooks -> abstract element -> abs driver
Abstraction - Browser, TargetLocators -> Interface, Abstract 
Encapsulation - private with getter and setter for data 
super, this ..


*/