package object_modeling_byPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	WebDriver driver;
	WebElement firstName,lastName;
	
	RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	void enterFirstName(String s)
	{
		firstName=driver.findElement(By.name("firstName"));
		firstName.sendKeys(s);
	}
	void enterLastName(String s)
	{
		lastName=driver.findElement(By.name("lastName"));
		lastName.sendKeys(s);
	}
}
