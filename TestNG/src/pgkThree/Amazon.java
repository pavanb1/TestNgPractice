package pgkThree;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Amazon {
   WebDriver driver;
  @BeforeSuite
  public void callDriver() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\SeleniumWebDriverThree\\Driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_nav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=C6X3S1A3ZTYSYN68P32R&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
      driver.manage().window().maximize();
      }
  @Test
  public void signup(){
	  driver.findElement(By.name("customerName")).sendKeys("Chandrashekhar");
	  driver.findElement(By.name("email")).sendKeys("7020507537");
	  driver.findElement(By.name("password")).sendKeys("chandu123");
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.name("field-keywords")).sendKeys("Mi mobile");
	  driver.findElement(By.className("nav-input")).click();
	  
  }

}
