package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassB {
	
	
	@Test
	public void b() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		
		
	}

}
