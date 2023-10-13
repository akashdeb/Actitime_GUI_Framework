package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyMultiSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement colorDropdown = driver.findElement(By.id("oldSelectMenu"));
		
		Select select=new Select(colorDropdown);
		boolean multiSelect = select.isMultiple();
		
		System.out.println(multiSelect);
		
		if(multiSelect) {
			System.out.println("Pass: the dropdown is multiselect");
		}
		
		else
			System.out.println("Fail: the dropdown is not multiselect");

	}

}
