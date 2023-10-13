package popUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpUsingAutoIt {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_July3PmBatch2023\\Automation\\autoIt\\auth.exe");
		
	}

}
