package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaleElementReferenceException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		GoogleSearchPage google = new GoogleSearchPage(driver);
		google.searchBar.sendKeys("selenium");
		
		driver.navigate().refresh();
		
		google.searchBar.sendKeys("automation");
		
		
	}

}
