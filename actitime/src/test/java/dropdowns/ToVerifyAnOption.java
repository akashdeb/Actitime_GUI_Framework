package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyAnOption {

	public static void main(String[] args) {
		
		int flag = 0;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select select = new Select(yearDropdown);
		List<WebElement> allOptions = select.getOptions();
		
		int noOfOptions = allOptions.size();
		
		System.out.println("The no of Options are : "+noOfOptions);
		
		for(WebElement option:allOptions) {
			
			if(option.getText().equals("2055")) {
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 1) {
			System.out.println("The option is present");
		}
		
		else
			System.out.println("The option is not present");

			
	}

}
