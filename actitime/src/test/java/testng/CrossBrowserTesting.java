package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void a(String browserVar) {
		
		if(browserVar.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		if(browserVar.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		if(browserVar.equals("edge")) {
			driver=new EdgeDriver();
		}
		 
		driver.get("http://google.co.in/");
		
		
	}

}
