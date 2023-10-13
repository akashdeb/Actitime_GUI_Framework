package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		// window 1
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://www.google.com/");

		String windowIDForGoogle = driver.getWindowHandle();

		System.out.println(windowIDForGoogle);
		
		driver.navigate().to("https://www.facebook.com/");
		
		String windowIDForFacebook = driver.getWindowHandle();

		System.out.println(windowIDForFacebook);
	}

}
