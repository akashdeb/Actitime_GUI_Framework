package webdriver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation { 

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//Main URL and SubURL
		driver.get("https://www.google.co.in/");
		
		Navigation nav = driver.navigate();
		
		nav.to("https://www.facebook.com/");
		
		nav.back();
		
		nav.forward();
		
		nav.refresh();
		
		

	}

}
