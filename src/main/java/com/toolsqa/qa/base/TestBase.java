package com.toolsqa.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	

	public TestBase()
	{
		 
		
		try {
			prop=new Properties();
			 
			 FileInputStream fis = new FileInputStream("src\\main\\java\\com\\toolsqa\\qa\\config\\config.properties");
		     try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}

	}
	
	
	public static void initialization() 
	{
	
		
		
 		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if (browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		
	}
	
	
	
}
