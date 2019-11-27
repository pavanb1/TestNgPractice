package Kushal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnnaUniversity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\SeleniumWebDriverThree\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*//launch anna university
		driver.get("https://www.annauniv.edu/");
		//maximize window
		driver.manage().window().maximize();
		//click on department
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td[5]/div/a")).click();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='link3']/strong"))).build().perform();
		*/
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
	
		String beforexpath = "//*[@id='customers']/tbody/tr[";
		String afterxpath = "]/td[1]";
		
		for(int i=2; i<=7; i++){
			String actualxpath = beforexpath+i+afterxpath;
			String companyname = driver.findElement(By.xpath(actualxpath)).getText();
			System.out.println(companyname);
			
			}

     	}
	}

