package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader1;

public class ParameterizeTest {

	public static void main(String[] args) {
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\SeleniumWebDriverThree\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
        driver.manage().window().maximize();
		
		
		//get data from excel
        Xls_Reader1 reader = new Xls_Reader1("E:/Automation Lab/Selenium pro/TestNG/src/com/testData/HalfEbayTestData.xlsx");
       int rowCount =  reader.getRowCount("RegTestData");
       
       //Parameterization
       for(int rowNum=2; rowNum<=rowCount; rowNum++){
    	   
    	   String firstname = reader.getCellData("RegTestData", "firstname", rowNum);
    	   System.out.println(firstname);
    	   
           String lastname = reader.getCellData("RegTestData", "lastname", rowNum);
           System.out.println(lastname); 
           
           String address1 = reader.getCellData("RegTestData", "address1", rowNum);
           System.out.println(address1);
           
           String address2 = reader.getCellData("RegTestData", "address2", rowNum);
           System.out.println(address2);
           
           String city = reader.getCellData("RegTestData", "city", rowNum);
           System.out.println(city);
           
           String state = reader.getCellData("RegTestData", "state", rowNum);
           System.out.println(state);
           
           String zipcode = reader.getCellData("RegTestData", "zipcode", rowNum);
           System.out.println(zipcode);
           
           String emailaddress = reader.getCellData("RegTestData", "emailaddress", rowNum);
           System.out.println(emailaddress);
           
           //Enter Data
           driver.findElement(By.id("firstname")).clear();
           driver.findElement(By.id("firstname")).sendKeys(firstname);
           
           driver.findElement(By.id("lastname")).clear();
           driver.findElement(By.id("lastname")).sendKeys(lastname);
           
           driver.findElement(By.id("address1")).clear();
           driver.findElement(By.id("address1")).sendKeys(address1);
           
           driver.findElement(By.id("address2")).clear();
           driver.findElement(By.id("address2")).sendKeys(address2);
           
           driver.findElement(By.id("city")).clear();
           driver.findElement(By.id("city")).sendKeys(city);
           
           Select select=new Select(driver.findElement(By.id("state")));
           
           select.selectByVisibleText(state);
           
           driver.findElement(By.id("zip")).clear();
           driver.findElement(By.id("zip")).sendKeys(zipcode);
           
           driver.findElement(By.id("email")).clear();
   	       driver.findElement(By.id("email")).sendKeys(emailaddress);
   	       
   	       driver.findElement(By.id("retype_email")).clear();
   		   driver.findElement(By.id("retype_email")).sendKeys(emailaddress);
       }

	}

}
