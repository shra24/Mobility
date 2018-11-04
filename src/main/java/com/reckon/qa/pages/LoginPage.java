package com.reckon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reckon.qa.base.TestBase;

public class LoginPage extends TestBase {


	// define page factory 

	@FindBy (id="UsrNm")
	WebElement username;

	@FindBy (id = "UsrPwd")
	WebElement password ;

	@FindBy (xpath ="//input[@type = 'button' and @value ='Login']")
	WebElement LoginButton ;
	
	@FindBy (className ="logo-div")
	WebElement LoginLogo;


// initialised page factoy

	public  LoginPage()throws IOException{
		PageFactory.initElements(driver, this);
	}

// methods 
	
	public String loginPageTitle() {
		return driver.getTitle();
		 
	}
	
	public boolean loginPageLogo () {
		return LoginLogo.isDisplayed();
		
	}
	
	
	
    public LeadsPage login(String un, String pwd) throws Exception{
        username.sendKeys(un);
        password.sendKeys(pwd);
        LoginButton.click();
        
       
			return new LeadsPage();

    }


















}





