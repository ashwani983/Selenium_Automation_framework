package object_modeling_byPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prog1_testcase_using_pom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		Homepage home=new Homepage(driver);
		home.clickRegisterLink();
		
		RegistrationPage register=new RegistrationPage(driver);
		register.enterFirstName("Ashwani");
		register.enterLastName("Kumar");
		

	}

}
