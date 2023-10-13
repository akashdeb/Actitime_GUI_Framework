package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
		String errorMsg = driver.findElement(By.className("errormsg")).getText();
		
		if(errorMsg.contains("Username or Password is invalid.")) {
			System.out.println("Pass: the error msg is proper");
			
		}
		
		else
			System.out.println("Fail: the error msg is not proper");

	}

}
