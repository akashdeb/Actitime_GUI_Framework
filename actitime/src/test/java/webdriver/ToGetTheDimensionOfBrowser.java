package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheDimensionOfBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		
		Dimension dim = driver.manage().window().getSize();
		
		System.out.println(dim);
		
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		System.out.println("The Height is : "+height);
		System.out.println("The Width is : "+width);

	}

}
