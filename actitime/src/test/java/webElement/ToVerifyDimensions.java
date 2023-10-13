package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 		driver.get("file:///C:/Users/User/Desktop/demoPage.html");
		WebElement username = driver.findElement(By.id("123abc"));
		WebElement password = driver.findElement(By.xpath("//input[@testing='qspiders']"));
		
		Dimension usernameDim = username.getSize();
		Dimension passwordDim = password.getSize();
		
		int h1 = usernameDim.getHeight();
		int w1 = usernameDim.getWidth();
		
		int h2 = passwordDim.getHeight();
		int w2 = passwordDim.getWidth();
		
		if(h1==h2 && w1==w2) {
			System.out.println("The Dimensions are proper");
		}
		
		else
			System.out.println("The Dimensions are not proper");

		
		

		

	}

}
