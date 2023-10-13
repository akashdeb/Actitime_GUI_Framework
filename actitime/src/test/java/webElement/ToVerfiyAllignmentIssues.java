package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerfiyAllignmentIssues {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/demoPage.html");
		
		WebElement username = driver.findElement(By.id("123abc"));
		WebElement password = driver.findElement(By.xpath("//input[@testing='qspiders']"));
		
		Point usernamePos = username.getLocation();
		Point passwordPos = password.getLocation();
		
		int x1 = usernamePos.getX();
		int x2 = passwordPos.getX();

		if(x1 == x2) {
			System.out.println("The textfields are alligned");
		}
		
		else
			System.out.println("The textfields are not alligned");


		
	}

}
