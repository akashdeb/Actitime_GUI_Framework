package polymorphism;

import org.openqa.selenium.WebDriver;

public class TestGoogle {
	
	public static void test(WebDriver driver) {
		
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		
		if(title.contains("Google")) {
			System.out.println("Pass: The title is verified");
		}
		else
			System.out.println("Fail: The title is not verified");
		
		driver.quit();

	}

}
