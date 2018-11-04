package com.reckon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reckon.qa.base.TestBase;

public class LeadsPage extends TestBase {

	@FindBy (xpath ="//div[1]/div[3]/div[1]/i[@class='icon-plus new-lead right']")
	WebElement addLeads;
	
	
	
	public LeadsPage () throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	public CreateLeadPage clickOnAddLeads () throws IOException {
		 addLeads.click();
		 return new  CreateLeadPage();
	}
}
