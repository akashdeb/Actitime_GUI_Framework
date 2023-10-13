package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		WebElement searchBar = driver.findElement(By.name("q"));
		
		searchBar.sendKeys("Selenium");
		
		driver.navigate().refresh();

		searchBar.sendKeys("Automation");

	}

}
