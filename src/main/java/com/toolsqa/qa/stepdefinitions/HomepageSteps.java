package com.toolsqa.qa.stepdefinitions;

import com.toolsqa.qa.base.TestBase;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;




public class HomepageSteps extends TestBase
{

	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable
	{
	   TestBase.initialization();
	}

	@Then("^validate home page url$")
	public void validate_home_page_url() throws Throwable {
	   
	}

	@Then("^Click on element link$")
	public void click_on_element_link() throws Throwable {
	    
	}


	
	
}
