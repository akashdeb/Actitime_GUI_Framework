package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyElementIsEnabledOrNot {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		boolean enabled = driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled();
		
		if(enabled) {
			System.out.println("Pass: the element is enabled");
		}
		
		else
			System.out.println("Fail: the element is not enabled");

	}

}
