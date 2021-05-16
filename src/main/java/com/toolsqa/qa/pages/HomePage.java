package com.toolsqa.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.openhtmltopdf.css.style.derived.StringValue;
import com.toolsqa.qa.base.TestBase;

public class HomePage extends TestBase
{
	
   //Home Page Objects
	@FindBy(xpath ="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")
	 WebElement Elements;
    
	
	
	
    @FindBy(xpath ="(//*[@id=\"app\"]//div[2])[4]")
    WebElement Forms;
    
    
    
    //Initialize objects
    public HomePage()
    {
    	PageFactory.initElements(driver, this);
    }
    
   //Methods
    public void clickElementButton()
    
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Elements);
    	Elements.click();
    }
    
    
    public String ValidateLoginPage()
    {
		return driver.getTitle();
    	
    }
    
}
