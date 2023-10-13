package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeTheScreen {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.manage().window().minimize();

		driver.manage().window().fullscreen();
	}

}
