package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_popup {
	//https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		
		//Alert popup
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		//driver.switchTo().alert().accept();
		
		
		Alert simplealert=driver.switchTo().alert();
		
		System.out.println(simplealert.getText());
		simplealert.accept();
		
		
		// confirmation popup
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		
		//okbutton
		Alert confimationalert=driver.switchTo().alert();
		
		//confimationalert.accept();
		confimationalert.dismiss();
		
		String msg=driver.findElement(By.xpath("//p[@id='confirm-demo']")).getText();
		
		if (msg.contains("Cancel")) {
		
			System.out.println("PASS");
			
		}
		else
		{
			System.out.println("FAIL");
		}
		
		//javascript ALert
		
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		
		Alert javascriptpoup=driver.switchTo().alert();
		javascriptpoup.sendKeys("Ashwani");
		javascriptpoup.accept();
		
		String msg1=driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText();
		
		if (msg1.contains("Ashwani")) {
			
			System.out.println("PASS");
			
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
		
	}
	
	

}
