package com.uibot.data;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Leads {

	private static String number;
	private static String caller;
	private static String description;
	private static String status;
	
	public static String getStatus() {
		return status;
	}
	public static void setStatus(String status) {
		Leads.status = status;
	}
	public static String getNumber() {
		return number;
	}
	public static void setNumber(String number) {
		Leads.number = number;
	}
	public static String getCaller() {
		return caller;
	}
	public static void setCaller(String caller) {
		Leads.caller = caller;
	}
	public static String getDescription() {
		return description;
	}
	public static void setDescription(String description) {
		Leads.description = description;
	}

	
	
	
	
}
