package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("alertButton")).click();

		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		alert.dismiss();

		WebElement alertText = driver.findElement(By.xpath("//div[text()='Alerts']"));
		
		JavascriptExecutor	js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", alertText);
		
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		
		alert.sendKeys("Automation");
		
		String alertMsg = alert.getText();
		System.out.println(alertMsg);
		
		alert.accept();
		
		
	}

}
