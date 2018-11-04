package com.reckon.qa.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.reckon.qa.base.TestBase;

public class CreateLeadPage extends TestBase {
	
	
	@FindBy (id ="Lead_CusName")
	WebElement customerName;
	
	
	@FindBy (id ="Lead_MobNo")
	WebElement mobileNumber;
	
	@FindBy (id ="Lead_Gender")
	WebElement gender;
	
	@FindBy (id ="Product")
	WebElement product;
	
	@FindBy (id ="Lead_Ent")
	WebElement customerEntity;
	
	@FindBy (id ="Lead_DOB")
	WebElement dob;
	
	
	@FindBy (id ="Lead_PAN")
	WebElement pan;
	
	
	@FindBy (id ="Lead_Aadhar")
	WebElement adhar;
	
	@FindBy (id ="Lead_LoanAmt")
	WebElement loanamount;
	
	@FindBy (id ="Lead_Pin")
	WebElement pincode;
	
	@FindBy (id ="Lead_Loc")
	WebElement branch;
	
	@FindBy (id ="SrcChannel")
	WebElement sourceChannel;
	
	@FindBy (id ="txtBldNm")
	WebElement builder;
	
	@FindBy (id ="txtProjNm")
	WebElement project;
	
	@FindBy (id ="CIBIL_ID")
	WebElement cibil;
	
	@FindBy (id ="Lead_CLS")
	WebElement cLs;
	
	@FindBy (id ="Lead_Rmks")
	WebElement comments;
	
	
	
	
	public CreateLeadPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void calenderValue(WebDriver driver , WebElement element,String datevalue){
		String dateVal = "30/10/1980";
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
				
	}
	public void createLead () throws InterruptedException {
		
		customerName.sendKeys("QATest");
		mobileNumber.sendKeys("9082836101");
		pan.sendKeys("CKLPR1866C");
		adhar.sendKeys("679575325188");
		loanamount.sendKeys("5000000");
		comments.sendKeys("test");
		

		Select selectobj = new Select(gender);
        selectobj.selectByVisibleText("Female");
		
        Select selectobj1 = new Select(product);
        selectobj1.selectByVisibleText("Home Loan");
        
        Select selectobj2 = new Select(customerEntity);
        selectobj2.selectByVisibleText("Non Individual");
        
        
        dob.sendKeys("30/12/001");
        Thread.sleep(2000);
        
        Select selectobj3 = new Select(branch);
        selectobj3.selectByVisibleText("THANE");
        
        
        Select selectobj4 = new Select(sourceChannel);
        selectobj4.selectByVisibleText("Direct");
              
        
		
        Select selectobj5= new Select(cLs);
        selectobj5.selectByVisibleText("Yes");
        
        
        
		
		pincode.sendKeys("40001");
		Thread.sleep(2000);
		
		driver.findElement(By.className("icon-close right")).click();
		/* Alert alert = driver.switchTo().alert();
		 Thread.sleep(2000);
		 alert.dismiss();*/
		
		
		/*String Parent_Window = driver.getWindowHandle();
	     for (String Child_Window : driver.getWindowHandles())
	     {
	     driver.switchTo().window(Child_Window);
	     WebElement area = driver.findElement(By.xpath("//td[contains(text(),'Bazargate, Fort')]"));
 		area.click();
 		
 		driver.close();
 		
 		driver.switchTo().window(Parent_Window);
	     
	    }
	     */
	    builder.sendKeys("Ashar");
		Thread.sleep(2000);
	    Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
	    alert2.dismiss();
		project.sendKeys("Maple Heights");
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.dismiss();
	     
	     
	}

		public void multipleWindows(WebElement pincode2, int a) throws InterruptedException {
			// TODO Auto-generated method stub
        	
        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);
        
        Set<String> windowsId = driver.getWindowHandles();
        int count = windowsId.size();
        System.out.println("total window id" +count);
        for(String pincodeId : windowsId ) {
        	if (!pincodeId.equalsIgnoreCase(parentWindowId)) {
        		driver.switchTo().window(pincodeId);
        		Thread.sleep(2000);
        		
        		WebElement area = driver.findElement(By.xpath("//td[contains(text(),'Bazargate, Fort')]"));
        		area.click();
        		
        		driver.close();
        		
        		driver.switchTo().window(parentWindowId);
        		System.out.println("parent winodw" +parentWindowId);
        		
        		
        		
        		
        		
        	}
        	
       
        }
     
			
		}
	
	
	
	
	

}
