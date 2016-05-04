package com.learnCoreJava.properties;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertyFileRead {
	
	
	public static void main(String[] args) {
		
		PropertiesConfiguration config;
		try {
			//config = new PropertiesConfiguration("com/learnCoreJava/properties/corejava.properties");
			config = new PropertiesConfiguration("corejava.properties");
			config.setProperty("text", "DilipNew");
			config.setProperty("company2", "Google");
			config.setProperty("Crunchify_Address", "NYC, US");
			config.setProperty("Google_Address", "Mountain View, CA, US");
			config.save();
			
			System.out.println("new Value is : "+ config.getProperty("text"));
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
