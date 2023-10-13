package webdriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowHandles {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://www.facebook.com/");
		
		String currentTitle = driver.getTitle();
		
		System.out.println(currentTitle);
		
		Set<String> allIDs = driver.getWindowHandles();
		
		System.out.println(allIDs);
	}

}
