package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyLocationInGoogleMap {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
		
		driver.switchTo().frame("app");
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		WebElement searhBox = driver.findElement(By.id("searchboxinput"));
		searhBox.sendKeys("Noida");
		searhBox.sendKeys(Keys.ENTER);
		
		if(driver.getPageSource().contains("Noida")) {
			System.out.println("Pass: the Location is verified");
		}
		
		else
			System.out.println("Fail: the Location is not verified");

		
		driver.quit();
		
	}

}
