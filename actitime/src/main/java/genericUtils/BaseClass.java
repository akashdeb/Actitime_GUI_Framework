package genericUtils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import POM.HomePage;
import POM.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();

	@BeforeSuite
	public void bs() {
		System.out.println("Data base connection is established");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Parrallel Execution started");
	}

	@BeforeClass
	public void bc() throws IOException {
		String URL = fUtils.toFetchDataFromPropertyFile("url");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		System.out.println("Launch the browser");

		driver.get(URL);

		System.out.println("Navigate to the URL");

	}

	@BeforeMethod
	public void bm() throws IOException {

		String USERNAME = fUtils.toFetchDataFromPropertyFile("username");
		String PASSWORD = fUtils.toFetchDataFromPropertyFile("password");

		LoginPage login = new LoginPage(driver);
		login.loginAction(USERNAME, PASSWORD);
		System.out.println("Login to the Application");

	}

	@AfterMethod
	public void am() {
		HomePage home = new HomePage(driver);
		home.logoutAction();
		System.out.println("The logout from the application");

	}

	@AfterClass
	public void ac() {
		driver.quit();

		System.out.println("Close the browser");

	}

	@AfterTest
	public void at() {
		System.out.println("Parrallel Execution stopped");
	}

	@AfterSuite
	public void as() {
		System.out.println("Data base connection is stopped");
	}

}
