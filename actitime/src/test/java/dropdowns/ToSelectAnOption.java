package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAnOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		
		Select select1=new Select(dayDropdown);
		select1.selectByIndex(9);
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		
		Select select2 = new Select(monthDropdown);
		select2.selectByVisibleText("Dec");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select select3 = new Select(yearDropdown);
		select3.selectByValue("1996");
	}

}
