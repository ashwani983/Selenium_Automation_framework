package Selenium_Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Hub_prog {
	static WebDriver driver;
	static String nodeURL;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		nodeURL="http://192.168.42.110:4444/wd/hub";
		

		DesiredCapabilities dc=DesiredCapabilities.chrome();
		
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL(nodeURL), dc);
		
		
		
		
		
		
		
		
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		//send text
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ashwani");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("456789456");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ashwanig7767@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123, near my hometworn ,bhopal");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Madhya Pradesh");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("462030");
		
		
		//Clear text
		//driver.wait(1000);
		
		driver.findElement(By.xpath("//input[@name='address1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123, near my hometworn ,bhopal");
		
		//send Key
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(Keys.PAGE_DOWN);;
		//sect radio button
		
		//select from Drop down
		Thread.sleep(2000);
		Select dropdown=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		
		dropdown.selectByVisibleText("INDIA");
		
		//element is display
		Thread.sleep(2000);
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		
		
		System.out.println(country.isDisplayed());
		
		
		//submit form
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashwanig7767@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("demo123");
		
		driver.findElement(By.xpath("//input[@name='phone']")).submit();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
