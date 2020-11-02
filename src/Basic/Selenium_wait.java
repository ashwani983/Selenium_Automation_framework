package Basic;





import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_wait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//page load time
		//driver.manage().timeouts().pageLoadTimeout(01, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ashwani");
		
		
		//Explicit wait
		//WebDriverWait wait= new WebDriverWait(driver,10);
		//send text
		
		//WebElement element;
		
		//element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstName']")));
		
		
		//fluent Wait
		//https://www.guru99.com/implicit-explicit-waits-selenium.html
		/*Wait wait = new FluentWait<WebDriver>(driver)
				.withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
	//Above code is deprecated in Selenium v3.11 and above. You need to use*/
		
		/*
		 * Wait wait = new FluentWait(WebDriver driver)
		 * .withTimeout(Duration.ofSeconds(50))
		 * .pollingEvery(Duration.ofSeconds(SECONDS)) .ignoring(Exception.class);
		 */
		
		
		driver.findElement(By.xpath("//input[@name='firstNam']")).sendKeys("Ashwani");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("456789456");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ashwanig7767@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123, near my hometworn ,bhopal");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Madhya Pradesh");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("462030");
		
		
		//Clear text
		driver.wait(1000);
		
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

	}


	

}
