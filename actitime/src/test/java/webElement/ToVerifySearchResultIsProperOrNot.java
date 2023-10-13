package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySearchResultIsProperOrNot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement textBox = driver.findElement(By.name("q"));
		
		textBox.sendKeys("Selenium");
		textBox.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		String sourceCode = driver.getPageSource();
		
		if(sourceCode.contains("Selenium")) {
			System.out.println("Pass: the information is present in the page");
		}
		
		else
			System.out.println("Fail: the information is not present in the page");

	}

}
