package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLocater {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		//bytext
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		//id
		 String text=driver.findElement(By.id("name-and-slogan")).getText();
		 
		 System.out.println(text);
		
		//name
		 driver.findElement(By.name("firstName")).sendKeys("Ashwani");
		 
		//class
		 
		 String text2=driver.findElement(By.className("mouseOut")).getText();
		 
		 System.out.println(text2);
		 
		//absulte xpath
		 
		 String text3=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font")).getText();
		 System.out.println(text3);
		 
		//relative xpath
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");;
		
		
		String text4=driver.findElement(By.xpath("//input[@name='phone']")).getAttribute("maxlength");
		
		System.out.println(text4);
		
		
		
		// find elements 
		List<WebElement> list=driver.findElements(By.xpath("//tbody//tr"));
		
		System.out.println(list.size()); 
		 
		 driver.close();

	}

}
