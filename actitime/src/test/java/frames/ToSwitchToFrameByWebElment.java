package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToFrameByWebElment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/User/Desktop/frame.html");
		
		WebElement demoFrame = driver.findElement(By.xpath("//iframe[@src=\"file:///C:/Users/User/Desktop/insideFrame.html\"]"));
	
		driver.switchTo().frame(demoFrame);
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();

		
	}

}
