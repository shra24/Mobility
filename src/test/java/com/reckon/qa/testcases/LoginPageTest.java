package com.reckon.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reckon.qa.base.TestBase;
import com.reckon.qa.pages.LeadsPage;
import com.reckon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	public LoginPage loginPage;
	public LeadsPage leadsPage;


	public LoginPageTest() throws IOException {
		super();
	}


	@BeforeMethod
	public void setUp () throws IOException {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginPageTitleTest () {
		String Title = loginPage.loginPageTitle();
		Assert.assertEquals(Title, "PHFL");
		}
	
	@Test
	public void loginPageLogoTest () {
		Boolean flag = loginPage.loginPageLogo();
        Assert.assertTrue(flag);
	}

	@Test
	public void lgnPageTest() throws Exception{
		leadsPage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown (){
		driver.quit();
}
	
}
