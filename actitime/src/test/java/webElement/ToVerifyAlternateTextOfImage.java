package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAlternateTextOfImage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String altText = driver.findElement(By.xpath("//img[@src=\"https://rukminim1.flixcart.com/image/210/210/kokdci80/dslr-camera/v/e/x/z-24-200mm-z5-nikon-original-imag2zuekuxgxsgg.jpeg?q=90\"]")).getAttribute("alt");
		
		System.out.println(altText);
	}

}
