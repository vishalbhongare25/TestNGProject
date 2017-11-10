package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReqestTab {
 WebDriver driver;
 
 public void ClikRequestTab ( WebDriver driver) throws InterruptedException {
     System.out.println("calling consumer tab");
	  WebElement  sidebar = driver.findElement(By.className("sidebar-requests"));
     sidebar.click(); 
     //driver.findElement(By.className("sidebar-consumers")).click();
     Thread.sleep(2000);
     // WebElement SomthingWEnterong = driver.findElement(By.className("sidebar-requests"));
	  AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://360.servify.in/servicerequests");
   //   WebElement Viewbutton = driver.findElement(By.xpath("html/body/consumer/div[1]/div/div/div[4]/div[1]/table/tbody/tr[2]/td[7]/a/button"));
    // Assert.assertNotEquals(Viewbutton, null);
     
}
	
}
