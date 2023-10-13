package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifySelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement carDropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(carDropdown);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
		int noOfSelectedOptions = selectedOptions.size();
		
		System.out.println("the no of selected options are : "+noOfSelectedOptions);
		
		for(WebElement option:selectedOptions) {
			System.out.println(option.getText());
		}
		
		WebElement firstSelectedElement = select.getFirstSelectedOption();
		
		String firstSelectedOption = firstSelectedElement.getText();
		
		System.out.println("The first selected option is : "+firstSelectedOption);
	}

}
