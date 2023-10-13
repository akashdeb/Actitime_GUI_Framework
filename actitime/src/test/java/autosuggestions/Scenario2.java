package autosuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("tv");
		
		Thread.sleep(2000);
		
		List<WebElement> as = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]"));
		
		int n = as.size();
		System.out.println(n-1);
		
		for(WebElement s:as) {
			System.out.println(s.getText());
			
			if(s.getText().equals("tvf")) {
				s.click();
				break;
			}
		}
		
	}

}
