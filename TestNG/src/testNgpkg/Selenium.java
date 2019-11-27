package testNgpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Selenium {
	public WebDriver driver;
		

  @BeforeSuite
  public void calldriver() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\SeleniumWebDriverThree\\Driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	  
  }
  
  @Test
	public void username(){
	  
		WebElement el = driver.findElement(By.name("name"));
		el.sendKeys("Pavan");
		
		driver.findElement(By.name("password")).sendKeys("Bharaskar");
		driver.findElement(By.name("confirmpassword")).sendKeys("Bharaskar");
		driver.findElement(By.name("insert")).click();
	
}}
