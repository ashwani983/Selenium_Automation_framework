package Basic;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(5000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String getcurl=driver.getCurrentUrl();
		System.out.println(getcurl);
		
		
		boolean getpagesource=driver.getPageSource().contains("Google");
		
		System.out.println(getpagesource);
		
		driver.close();
		
		
		
		
		

	}

}
