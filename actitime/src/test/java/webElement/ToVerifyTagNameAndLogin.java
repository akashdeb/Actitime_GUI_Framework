package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagNameAndLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		String usernameTagName = username.getTagName();
		String passwordTagName = password.getTagName();
		String loginButtonTagName = loginButton.getTagName();
		
		if(usernameTagName.equals("input") && passwordTagName.equals("input") && loginButtonTagName.equals("div")) {
			username.sendKeys("admin");
			password.sendKeys("manager");
			loginButton.click();
			System.out.println("The Login is successful");
		}
		
		else
			System.out.println("The Login was not successful");

	}

}
