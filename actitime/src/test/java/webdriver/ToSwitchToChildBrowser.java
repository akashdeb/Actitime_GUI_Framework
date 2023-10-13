package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToChildBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id:allIds) {
			driver.switchTo().window(id);
			if(!id.equals(parentWindowId)) {
				String childTitle = driver.getTitle();
				System.out.println(childTitle);
				
			}
			
		}
		
		driver.switchTo().window(parentWindowId);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		
		
	}

}
