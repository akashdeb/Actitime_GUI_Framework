package polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.getTitle();
				
		driver.quit();

		driver = new FirefoxDriver();

		driver.get("https://www.google.co.in/");
		driver.getTitle();
			
		driver.quit();

		driver = new EdgeDriver();

		driver.get("https://www.google.co.in/");
		driver.getTitle();
				
		driver.quit();

	}

}
