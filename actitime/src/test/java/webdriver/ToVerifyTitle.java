package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitle {

	public static void main(String[] args) {
		
		String expectedTitle = "Facebook";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actualTitle = driver.getTitle();
		
		System.out.println("The actual title is : "+actualTitle);
		System.out.println("The expected title is : "+expectedTitle);

		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Pass: the title is verified");
		}
		
		else
			System.out.println("Fail: the title is not verified");

	}

}
