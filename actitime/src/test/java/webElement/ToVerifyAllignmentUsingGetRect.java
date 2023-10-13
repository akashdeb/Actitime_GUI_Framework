package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentUsingGetRect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/demoPage.html");
		
		WebElement username = driver.findElement(By.id("123abc"));
		WebElement password = driver.findElement(By.xpath("//input[@testing='qspiders']"));
		
		Rectangle usernameRect = username.getRect();
		Rectangle passwordRect = password.getRect();
		
		int x1 = usernameRect.getX();
		int w1 = usernameRect.getWidth();
		
		int x2 = passwordRect.getX();
		int w2 = passwordRect.getWidth();
		
		int x3 = x1+w1;
		int x4 = x2+w2;
		
		if(x1 == x2 && x3 == x4) {
			System.out.println("Pass: the textfields are properly alligned");
		}
		
		else
			System.out.println("Fail: the textfields are not properly alligned");


	}

}
