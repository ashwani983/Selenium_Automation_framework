package Framework;



import org.junit.Assert;

import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import org.junit.AfterClass;

public class asserting_tags {
	static WebDriver driver;
	@BeforeClass
	public static void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.manage().window().maximize();
	}
	@Before
	public void Before() throws InterruptedException {
		
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("REGISTER")).click();
		

	}


	@Test
	public void test() throws InterruptedException {
		
		// send text
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ashwani");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("456789456");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ashwanig7767@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123, near my hometworn ,bhopal");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Madhya Pradesh");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("462030");
		// Clear text
		// driver.wait(1000);

		driver.findElement(By.xpath("//input[@name='address1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123, near my hometworn ,bhopal");

		// send Key
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(Keys.PAGE_DOWN);

		// sect radio button

		// select from Drop down
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='country']")));

		dropdown.selectByVisibleText("INDIA");

		// element is display
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		System.out.println(country);

		

		// submit form
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashwanig7767@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("demo123");

		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String expected=driver.findElement(By.xpath("//b[contains(text(),'@gmail.com')]")).getText();
		Thread.sleep(5000);
		
		Assert.assertTrue(expected.contains("ashwanig7767@gmail.com"));
		
		
		
	}


	@AfterClass
	public static void AfterClass() {
		driver.quit();

	}
	@After
	public void After() {
		
	}

}
