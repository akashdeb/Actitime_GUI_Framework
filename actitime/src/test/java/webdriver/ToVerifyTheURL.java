package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheURL {
	//Test Case name: The verify the URL
	public static void main(String[] args) {
		
		//Test Data
		String expectedURL = "https://www.selenium.dev/";
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Navigate to the URL
		driver.get("https://www.selenium.dev/");
		
		//Fetching the main URL
		String actualURL = driver.getCurrentUrl();
		
		//Printing both the URLs on the COnsole
		System.out.println("The actual URL is : "+actualURL);
		
		System.out.println("The expected URL is : "+expectedURL);
		
		//Verify the URL is correct or not
		if(actualURL.equals(expectedURL)) {
			System.out.println("Pass: The URL is verified");
		}
		
		else
			System.out.println("Fail: The URL is not verified");

		
		

	}

}
