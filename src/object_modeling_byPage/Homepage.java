package object_modeling_byPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	WebElement home,hotel,flight,register;
	Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	void clickHomeLink()
	{
	home=driver.findElement(By.linkText("Home"));
	home.click();
	}
	void clickRegisterLink()
	{
		register=driver.findElement(By.linkText("REGISTER"));
		register.click();	
	}
	
}
