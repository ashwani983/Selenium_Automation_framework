package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Demo1 {
  @Test
  public void f_test1() {
	  System.out.println("Test 1 is running");
  }
  @Test
  public void f_test2() {
	  System.out.println("Test 2 is running");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method is running");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method is running");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class is running");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class is running");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test is running");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test is running");
  }

}
