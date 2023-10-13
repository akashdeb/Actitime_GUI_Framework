package webdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChangeTheDimension {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		Dimension dim = new Dimension(500, 200);
		driver.manage().window().setSize(dim);

	}

}
