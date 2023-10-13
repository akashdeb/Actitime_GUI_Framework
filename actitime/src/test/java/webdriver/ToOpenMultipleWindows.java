package webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToOpenMultipleWindows {

	public static void main(String[] args) {
		//TestData
		String windowToSwitch = "Instagram";
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.instagram.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.selenium.dev/");
		
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id:allIds) {
			driver.switchTo().window(id);
			 
			String currentWindowTitle = driver.getTitle();
			if(currentWindowTitle.contains(windowToSwitch)) {
				System.out.println(driver.getTitle());
				break;
			}
		}
		
	}

}
