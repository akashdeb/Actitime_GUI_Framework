package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheCountryInformation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		String pageSource = driver.getPageSource();
		
		//System.out.println(pageSource);
		
		if(pageSource.contains("India")) {
			System.out.println("Pass: the country information has been verified");
		}
		
		else
			System.out.println("Fail: the country information has not been verified");

	}

}
