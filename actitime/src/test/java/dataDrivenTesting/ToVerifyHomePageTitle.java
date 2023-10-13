package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyHomePageTitle {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileUtility fUtils = new FileUtility();
		String url = fUtils.toFetchDataFromPropertyFile("url");

		String username = fUtils.toFetchDataFromPropertyFile("username");
		
		String password = fUtils.toFetchDataFromPropertyFile("password");
		
		String expectedTitle = fUtils.fetchStringDataFromExcelSheet("Sheet2", 3, 0);
		
		

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
		if(driver.getTitle().contains(expectedTitle)) {
			System.out.println("The Title is verified");
		}
		
		else
			System.out.println("The Title is not verified");



		driver.quit();

	}

}
