package headless_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless_chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("headless");
		
		
		WebDriver driver = new ChromeDriver(co);
		
		// Launching the site.
		driver.get("http://demo.guru99.com/popup.php");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();

	}

}
