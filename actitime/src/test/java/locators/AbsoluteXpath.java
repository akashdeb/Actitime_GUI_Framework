package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/xpath.html");
		
		WebElement thirdTextBox = driver.findElement(By.xpath("html/body/div[2]/input[1]"));
		thirdTextBox.sendKeys("Radhe");
	}

}
  