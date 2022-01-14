package com.uibot.tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.servicenow.hooks.ProjectHooks;
import com.uibot.data.Leads;
import com.uibot.element.LocatorType;

public class UpdateScenario extends ProjectHooks {
	@BeforeClass
	public void setData() {
		Leads.setCaller("Abel");
		Leads.setDescription("This is Babu");
	}
	@Test
	public void createNewIncident() {
		type(LocatorType.ID, "filter", "Incident");
		
		
		
	}

}
