package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Write a Script to check whether a particular information is present in a paragraph
public class ContainsFunction {

	public static void main(String[] args) {
		// 1. Launch the browser
		WebDriver driver = new ChromeDriver();
		// 2. Maximize the window
		driver.manage().window().maximize();
		// 3. Nav to the URL
		driver.get("https://www.selenium.dev/");
		
		WebElement paragraphAddress = driver.findElement(By.xpath("//p[contains(text(), 'If you want to create robust, browser-based regression')]"));
		
		String paragraph = paragraphAddress.getText();
		
		System.out.println(paragraph);
		
		if(paragraph.contains("browser-based regression")) {
			System.out.println("Pass: the text is present");
		}
		
		else
			System.out.println("Fail: the text is not present");

	}

}
