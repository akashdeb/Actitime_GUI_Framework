package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		//Test data
		String productName = "APPLE iPhone 13 (Starlight, 128 GB)";
		String productPrice = "59,499";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
		
		WebElement priceAddress = driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()='₹"+productPrice+"']"));

		String price = priceAddress.getText();
		
		System.out.println(price);
	}

}
