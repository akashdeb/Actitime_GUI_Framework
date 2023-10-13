package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		driver.findElement(By.id("email")).sendKeys("82374627863t4");
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@data-continue-to=\"password-container\"]"));
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		wait.ignoring(Exception.class);
			
		continueButton.click();
	}

}
