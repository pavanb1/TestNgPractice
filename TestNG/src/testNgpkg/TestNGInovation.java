package testNgpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGInovation {
  @Test
  public void TC1() {
	  System.out.println("we are in TC1");
  }
  @Test
  public void TC2() {
	  System.out.println("we are in TC2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("We are in Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("We are in after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("We are in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("We are in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("We are in before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("We are in after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("We are in before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("We are in after Suite");
  }

}
