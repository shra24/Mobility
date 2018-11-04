package com.reckon.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reckon.qa.base.TestBase;
import com.reckon.qa.pages.CreateLeadPage;
import com.reckon.qa.pages.LeadsPage;
import com.reckon.qa.pages.LoginPage;

public class LeadPageTest extends TestBase {


	public LoginPage loginPage;
	public LeadsPage leadsPage;
	public CreateLeadPage createLeadPage;


	public LeadPageTest ()throws IOException{
		super ();
	}

	@BeforeMethod
	public void setUp () throws Exception {
		initialization();
		loginPage = new LoginPage();
		leadsPage = new LeadsPage();
		createLeadPage = new CreateLeadPage () ;
		leadsPage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
	}




	@Test
	public void addLeadsTest() throws Exception {
		
		createLeadPage = leadsPage.clickOnAddLeads();
      
	}

	
	/*
	@AfterMethod
	public void tearDown (){
		driver.quit();
	}*/
}


