package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowHandle {

	public static void main(String[] args) {
		//window 1
		ChromeDriver driver = new ChromeDriver();
		
		String windowID1 = driver.getWindowHandle();
		
		System.out.println(windowID1);
		
		//window 2
		ChromeDriver driver1 = new ChromeDriver();
		
		String windowID2 = driver1.getWindowHandle();
		
		System.out.println(windowID2);

	}

}
