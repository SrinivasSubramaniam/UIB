package com.uibot.tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.servicenow.hooks.ProjectHooks;
import com.uibot.data.Leads;
import com.uibot.element.LocatorType;

public class CreateIncident extends ProjectHooks{

	@BeforeClass
	public void setData() {
		Leads.setCaller("Abel");
		Leads.setDescription("This is Babu");
	}
	
	@Test
	public void createNewIncident() {
		
		//Type CreateIncident on the left menu
		type(LocatorType.ID, "filter", "Incident");

		//Click on Create New Link on left menu
		click(LocatorType.XPATH, "//div[text()='Create New']");
		
		//Store the number available in the Incident Number field
		switchToFrame("gsft_main");
		locateElement(LocatorType.ID, "incident.number");
		Leads.setNumber(getAttribute("value"));
		
		//Type and Tab on the Caller field (Test data: Abel)
		locateElement(LocatorType.ID, "sys_display.incident.caller_id");
		typeAndKeyAction(Leads.getCaller(), Keys.TAB);
		pause(5);
		
		//Type on the short description field (Test data: This is <Your name>)
		type(LocatorType.ID, "incident.short_description", Leads.getDescription());
		
		//Click Submit
		click(LocatorType.ID, "sysverb_insert");
		
		//Type the stored incident number from step 4 on the Search field and type Enter
		locateElement(LocatorType.XPATH, "//input[@placeholder='Search']");
		typeAndKeyAction(Leads.getNumber(), Keys.ENTER);
		
		
	}
	
}
