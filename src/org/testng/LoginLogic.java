package org.testng;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;

public class LoginLogic {
	
	 public void Login (WebDriver driver) throws InterruptedException {
	    	
   	  System.out.println("Open360Dashbordboard URL");
   	      driver.get("https://360.servify.in/");
   	      //driver.get("http://staging.servify.in:3000/");  
   	      //driver.get ("http://staging.servify.in:3002/");
   	     // driver.findElement(By.name("username")).sendKeys("karan.b@servify.in"); 
   	      //String homePageUrl = driver.getCurrentUrl();
   	      AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://360.servify.in/");
   	      Thread.sleep(2000); 
   	      System.out.println("Opened Successfully 360Dashbordboard URL");
     	  
   	  
     System.out.println("Start User login on 360Dashbordboard ");
	  driver.findElement(By.name("username")).sendKeys("vishal.b@servify.in");
     driver.findElement(By.name("next")).click();	
     Thread.sleep(2000);
     //driver.findElement(By.name("password")).sendKeys("|$JBRmed+K#im");
     driver.findElement(By.name("password")).sendKeys("vishal09");
     driver.findElement(By.name("submit")).click();
     Thread.sleep(6000); 
     String HomepageURl = driver.getCurrentUrl();
     AssertJUnit.assertEquals(HomepageURl, "https://360.servify.in/dashboard");
     Thread.sleep(6000);
     WebElement element =driver.findElement(By.id("filterDashboard"));
     Assert.assertNotEquals(element, null);  
     System.out.println(" User logined Successfully 360Dashbordboard ");
     Thread.sleep(2000);
    
   // driver.quit();
    
    }

	 public void Loginfail (WebDriver driver) throws InterruptedException {
	    	
	   	  System.out.println("Open360Dashbordboard URL");
	   	       driver.get("https://360.servify.in/");
	   	      //driver.get("http://staging.servify.in:3000/");  
	   	      //driver.get ("http://staging.servify.in:3002/");
	   	     // driver.findElement(By.name("username")).sendKeys("karan.b@servify.in"); 
	   	      //String homePageUrl = driver.getCurrentUrl();
	   	      AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://360.servify.in/");
	   	      Thread.sleep(2000); 
	   	      System.out.println("Opened Successfully 360Dashbordboard URL");
	     	  
	   	  
	       System.out.println("Start User login on 360Dashbordboard ");
		   driver.findElement(By.name("username")).sendKeys("vishal.b@servify.in");
	       driver.findElement(By.name("next")).click();	
	       Thread.sleep(2000);
	      //driver.findElement(By.name("password")).sendKeys("|$JBRmed+K#im");
	       driver.findElement(By.name("password")).sendKeys("vishal0");
	       driver.findElement(By.name("submit")).click();
	       Thread.sleep(6000); 
	       String HomepageURl = driver.getCurrentUrl();
	       AssertJUnit.assertEquals(HomepageURl, "https://360.servify.in/dashboard");
	       Thread.sleep(6000);
	       WebElement element =driver.findElement(By.id("filterDashboard"));
	       Assert.assertNotEquals(element, null);  
	       System.out.println(" User logined Successfully 360Dashbordboard ");
	       Thread.sleep(2000);
	    
	    driver.quit();
	    
	    } 
	 
	 
}
