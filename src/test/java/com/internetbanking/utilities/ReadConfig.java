package com.internetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File file = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			pro= new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String getBaseUrl()
	{
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUserName()
	{
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword()
	{
		String username = pro.getProperty("password");
		return username;
	}
}
