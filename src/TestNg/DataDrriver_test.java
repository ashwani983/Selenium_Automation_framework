package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataDrriver_test {
	@Test(dataProvider = "dp")
	public void test1(String fname, String lname) {
		System.out.println("Test 1 is executng");
		System.out.println(fname);
		System.out.println(lname);
		// System.out.println(phoneno);
	}

	@Test(dataProvider = "newdp")
	public void test2(String fname, String lname) {
		System.out.println("Test 1 is executng");
		System.out.println(fname);
		System.out.println(lname);

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before method is executng");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method is executng");
	}

	@DataProvider
	public Object[][] dp() {
		Object[][] data = new Object[3][2];

		data[0][0] = "SignUpForFree@InvalidEmail.com";
		data[0][1] = "Password_ABC";
		
		data[1][0] = "Rex.Jones@Test4Success.org";
		data[1][1] = "UseMyValidPassword";
		
		data[2][0] = "InvalidLogIn@Test.com";
		data[2][1] = "InvalidPassword";

		return data;
	}

	@DataProvider
	public Object[][] newdp() {
		Object[][] data = new Object[2][2];
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[1][0] = "username2";
		data[1][1] = "password2";

		return data;

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class is executng");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class is executng");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test is executng");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test is executng");
	}

}
