package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkTextAndPartialLinkText {
	//Why to use partial Link text??
//	We use partial link text:
//		1. Whenever there is a dynamic text in the link text
//		2. If the link text is too long
//		3. If we have unbreakable spaces
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/demoApp.html");
		
		WebElement link = driver.findElement(By.partialLinkText("Goto Selenium"));
	
		link.click();
	}

}
