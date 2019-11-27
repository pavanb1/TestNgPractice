package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader1;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\SeleniumWebDriverThree\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         
         
         //Get Test Data From Excel
         Xls_Reader1 reader = new Xls_Reader1("E:/Automation Lab/Selenium pro/TestNG/src/com/testData/HalfEbayTestData.xlsx");
        String firstname = reader.getCellData("RegTestData", "firstname", 3);
        String lastname = reader.getCellData("RegTestData", "lastname", 3);
        String address1 = reader.getCellData("RegTestData", "address1", 3);
        String address2 = reader.getCellData("RegTestData", "address2", 3);
        String city = reader.getCellData("RegTestData", "city", 3);
        String state = reader.getCellData("RegTestData", "state", 3);
        String zipcode = reader.getCellData("RegTestData", "zipcode", 3);
        String emailaddress = reader.getCellData("RegTestData", "emailaddress", 3);
        
        //WebDriver Code Enter Data 
        
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        
        driver.findElement(By.id("address1")).sendKeys(address1);
        
        driver.findElement(By.id("address2")).sendKeys(address2);
        
        driver.findElement(By.id("city")).sendKeys(city);
        
        Select select=new Select(driver.findElement(By.id("state")));
        
        select.selectByVisibleText(state);
        
        driver.findElement(By.id("zip")).sendKeys(zipcode);
        
		driver.findElement(By.id("email")).sendKeys(emailaddress);
		
		driver.findElement(By.id("retype_email")).sendKeys(emailaddress);
		
		
		
		
	}

}
