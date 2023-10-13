package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckPasswordIsDisplayingOrNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("akashdebsdkjhcb");
		Thread.sleep(2000);
		WebElement continueButton = driver.findElement(By.xpath("//button[@data-continue-to='password-container']"));
		
		if(continueButton.isEnabled()) {
			
			continueButton.click();
			
			WebElement passwordLabel = driver.findElement(By.xpath("//label[contains(text(), 'Create a password')]"));
		
			if(passwordLabel.isDisplayed()) {
				System.out.println("The Password label is displaying");
			}
			
			else
				System.out.println("The Password label is not displaying");
		}
		
		else {
			WebElement errorMsg = driver.findElement(By.xpath("//p[text()='Email is invalid or already taken']"));
			System.out.println(errorMsg.getText());
		}
		
		
	}

}
