package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyCssInfo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		String colorCssValue = driver.findElement(By.name("login")).getCssValue("background-color");
		
		System.out.println(colorCssValue);
	}

}
