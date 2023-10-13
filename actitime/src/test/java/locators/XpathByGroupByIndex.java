package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupByIndex {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/xpath.html");
		
		
		WebElement thirdTextBox = driver.findElement(By.xpath("(//input)[3]"));
		
		thirdTextBox.sendKeys("Third box");
	}

} 
