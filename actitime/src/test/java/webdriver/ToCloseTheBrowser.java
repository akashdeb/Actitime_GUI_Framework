package webdriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseTheBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.facebook.com/");
		
		//Close will close facebook.com
		driver.quit();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Quit will close all windows
		//driver.quit();
		 

	}

}
