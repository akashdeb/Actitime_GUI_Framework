package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://fineuploader.com/demos.html");
		
		driver.findElement(By.name("qqfile")).sendKeys("C:\\Users\\User\\Pictures\\1690182357037.jpg");
	}

}
