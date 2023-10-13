package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test
	public void a() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.co.in/");
		
		
	}

}
