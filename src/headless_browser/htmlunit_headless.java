package headless_browser;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class htmlunit_headless {

	public static void main(String[] args) throws InterruptedException {
		// download https://github.com/SeleniumHQ/htmlunit-driver/releases

		HtmlUnitDriver unitDriver = new HtmlUnitDriver(BrowserVersion.CHROME);
		
		unitDriver.get("http://demo.guru99.com/popup.php");
		
		Thread.sleep(5000);
		
		System.out.println(unitDriver.getTitle());

		

	}

}
