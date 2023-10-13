package Home_Module;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import genericUtils.BaseClass;


public class ToVerifyHomePageTest extends BaseClass {

	@Test
	public void toVerifyHomePageTest() throws IOException {
		String expectedHomePageTitle = fUtils.fetchStringDataFromExcelSheet("Sheet2", 3, 0);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(expectedHomePageTitle));

		String actaulHomePageTitle = driver.getTitle();

		Assert.assertTrue(actaulHomePageTitle.contains(expectedHomePageTitle));
		System.out.println("Pass: the title is verified");

	}

}
