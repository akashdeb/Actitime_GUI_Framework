package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyTheErrorMsgIsDisplayingOrNot {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
		 boolean errorMsg = driver.findElement(By.className("errormsg")).isDisplayed();
		 
		 if(errorMsg) {
			 System.out.println("Pass: the error msg is displaying");
		 }
		 
		 else
			 System.out.println("Fail: the error msg is not displaying");

	}

}
