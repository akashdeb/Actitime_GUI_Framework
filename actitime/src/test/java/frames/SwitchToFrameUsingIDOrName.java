package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameUsingIDOrName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/User/Desktop/frame.html");
		
		driver.switchTo().frame("demoFrame");
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	}

}
