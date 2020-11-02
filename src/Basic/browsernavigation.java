package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsernavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.navigate().to("https://www.capgemini.com/in-en/");
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.google.co.in/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.close();
		

	}

}
