package pgkThree;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;


public class Project03 {
	
public WebDriver driver;

@BeforeSuite
	
public void calldriver(){
		
System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\SeleniumWebDriverThree\\Driver\\chromedriver.exe");
		
driver=new ChromeDriver();
		
driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
		
driver.manage().window().maximize();
		
	
}
	
@Test
	public void Login()
{
	  
driver.findElement(By.name("name")).sendKeys("Pavan");
	  
driver.findElement(By.name("password")).sendKeys("pavan@123");
	  
driver.findElement(By.name("confirmpassword")).sendKeys("pavan@123");
	  
driver.findElement(By.name("insert")).click();
	  
driver.findElement(By.name("First_Name")).sendKeys("Pavan");
	  
driver.findElement(By.name("Last_Name")).sendKeys("Bharaskar");
	  
Select d1 = new Select(driver.findElement(By.id("Birthday_Day")));
	  
d1.selectByValue("12");
	  
Select d2 = new Select(driver.findElement(By.id("Birthday_Month")));
	  
d2.selectByValue("July");
	  
Select d3 = new Select(driver.findElement(By.id("Birthday_Year")));
	  
d3.selectByValue("1994");
	  
driver.findElement(By.name("Email_Id")).sendKeys("pavanbharaskar777@gmail.com");
	  
driver.findElement(By.name("Mobile_Number")).sendKeys("9623234322");
	  
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input[1]")).click();
	  
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[7]/td/input")).click();
	  
driver.findElement(By.name("Address")).sendKeys("karve nagar,pune");
	  
driver.findElement(By.name("City")).sendKeys("Pune");
	  
driver.findElement(By.name("Pin_Code")).sendKeys("411052");
	  
driver.findElement(By.name("State")).sendKeys("Maharastra");
	  
Select d4 = new Select(driver.findElement(By.name("Country")));
	  
d4.selectByValue("IN");
	  
driver.findElement(By.name("insert")).click();
	  
driver.findElement(By.name("Hobby_Drawing")).click();
	  
driver.findElement(By.name("Hobby_Singing")).click();
	  
driver.findElement(By.name("insert")).click();
	  
	  
	  
	
}
	
	

}