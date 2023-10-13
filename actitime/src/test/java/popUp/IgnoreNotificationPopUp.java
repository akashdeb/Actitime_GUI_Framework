package popUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class IgnoreNotificationPopUp {

	public static void main(String[] args) {
		
		FirefoxOptions option=new FirefoxOptions();
		option.addPreference("dom.webnotifications.enabled", false);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.yatra.com/");
		
	}

}
