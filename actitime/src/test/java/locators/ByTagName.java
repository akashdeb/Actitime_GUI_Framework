package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/demoApp.html");
		
		WebElement heading = driver.findElement(By.tagName("h1"));
		
		String headingOfPage = heading.getText();
		
		System.out.println(headingOfPage);
	}

}
