package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginAndVerifyTheHomePage {

	public static void main(String[] args) throws InterruptedException {
		//1. Launch the browser
		WebDriver driver = new ChromeDriver();
		//2. Maximize the window
		driver.manage().window().maximize();
		//3. Nav to the URL
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		loginButton.click();
		
		Thread.sleep(2000);
		String homePagetitle = driver.getTitle();
		
		if(homePagetitle.contains("Enter Time-Track")) {
			System.out.println("Pass: the home page is verified");
		}
		
		else
			System.out.println("Fail: the home page is not verified");

		WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Logout']"));
		logoutButton.click();
		
		driver.quit();
		
	}

}
