package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ATA {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"ID_nameField1\"]") 
	WebElement weField1 ;
	@FindBy(xpath = "//*[@id=\"ID_nameField2\"]") 
	WebElement weField2 ;
	@FindBy(xpath = "//*[@id=\"gwt-uid-1\"]") 
	WebElement weAdd ;
	@FindBy(xpath = "//*[@id=\"gwt-uid-2\"]") 
	WebElement weMul ;
	@FindBy(xpath = "//*[@id=\"gwt-uid-4\"]") 
	WebElement weComp ;
	@FindBy(xpath = "//*[@id=\"ID_calculator\"]") 
	WebElement weCalc;
	@FindBy(xpath = "//*[@id=\"ID_nameField3\"]") 
	WebElement weResult;

	public ATA (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	String multiply(String input1, String input2) {

		String returnValue = null;
		weField1.clear();
		weField1.sendKeys(input1);
		weField2.clear();
		weField2.sendKeys(input2);
		weMul.click();
		weCalc.click();
		returnValue = weResult.getAttribute("value");
		return returnValue;

	}

	String Add(String input1, String input2) {

		String returnValueAdd = null;
		weField1.clear();
		weField1.sendKeys(input1);
		weField2.clear();
		weField2.sendKeys(input2);
		weAdd.click();
		weCalc.click();
		returnValueAdd = weResult.getAttribute("value");
		return returnValueAdd;

	}

	String Comp(String input1, String input2) {

		String returnValueComp = null;
		weField1.clear();
		weField1.sendKeys(input1);
		weField2.clear();
		weField2.sendKeys(input2);
		weComp.click();
		weCalc.click();
		returnValueComp = weResult.getAttribute("value");
		return returnValueComp;

	}


}
