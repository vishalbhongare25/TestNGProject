package org.testng;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	LoginLogic logintest ;
	ConsumerTab consumertest;
	ReqestTab request;
	
	@Test (priority =1)
	public void loginPass () throws InterruptedException{
	logintest.Login(driver);
	Thread.sleep(2000);
	}
	
	/*@Test(priority =2)
	 public void  Loginfail () throws InterruptedException{
		driver =new ChromeDriver();
	    logintest.Loginfail(driver);
	    }*/
	   
	
	
	@Test(priority =2) 
	public void  OpenConsumerCategory() throws InterruptedException{
	
	consumertest.ClikConsumerTab(driver);
	Thread.sleep(3000);

	}
	/*@Test(priority=3)
	public void clickOnfilters() throws InterruptedException{
		consumertest.ConsumerFilters(); 
		Thread.sleep(3000);
		
	}
	
	@Test (priority=4 )
	public void ViewConsumerDetails() throws InterruptedException{
		consumertest.ConsumerViewDetilsButtons();
		Thread.sleep(3000);
		
	}*/
	
	@Test (priority=3 )
	public void ClickRuqestCategory() throws InterruptedException{
		request.ClikRequestTab(driver);
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	/*@BeforeMethod
	public void beforeMethod (){
		driver =new ChromeDriver();
		logintest =new LoginLogic();

	}*/ // Run before evert tets case.
	
	@BeforeClass
	public void beforeClass() throws InterruptedException{

		 System.out.println("beforeClass");
		 driver =new ChromeDriver();
		 logintest =new LoginLogic();
		 consumertest =new ConsumerTab();
		 request = new ReqestTab();
		
	}
	
	
}
