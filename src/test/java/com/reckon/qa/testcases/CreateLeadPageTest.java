package com.reckon.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reckon.qa.base.TestBase;
import com.reckon.qa.pages.CreateLeadPage;
import com.reckon.qa.pages.LeadsPage;
import com.reckon.qa.pages.LoginPage;

public class CreateLeadPageTest extends TestBase {

	public LoginPage loginPage;
	public LeadsPage leadsPage;
	public CreateLeadPage createLeadPage;


	public CreateLeadPageTest ()throws IOException{
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
		leadsPage.clickOnAddLeads();
		Thread.sleep(3000);

	}

	@Test
	public void creteLeadTest () throws Exception {

		createLeadPage.createLead();
		WebElement pincode = driver.findElement(By.id("Lead_Pin"));
		createLeadPage.multipleWindows(pincode, 40001);
		
	}










}
