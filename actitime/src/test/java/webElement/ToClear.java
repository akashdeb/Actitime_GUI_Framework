package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToClear {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/demoApp.html");
		
		WebElement username = driver.findElement(By.id("something"));
		WebElement password = driver.findElement(By.name("somethingElse"));
		username.clear();
		username.sendKeys("trainee");
		password.clear();
		password.sendKeys("trainee");
	}

}
