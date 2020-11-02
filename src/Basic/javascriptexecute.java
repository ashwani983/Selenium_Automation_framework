package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Launching the site.
		driver.get("http://demo.guru99.com/popup.php");
		
		JavascriptExecutor javascriptexecuter=(JavascriptExecutor)driver;
		
		String title=javascriptexecuter.executeScript("return document.title;").toString();
		System.out.println(title);
		
		javascriptexecuter.executeScript("window.scrollBy(50,document.body.scrollHeight)");
		
		WebElement button=driver.findElement(By.xpath("//*[contains(@href,'popup.php')]"));
		
		
		
		javascriptexecuter.executeScript("arguments[0].click();", button);
		
		
		

	}

}
