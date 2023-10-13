package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  GoogleSearchPage {
	
	public GoogleSearchPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q") 
	WebElement searchBar;
	
}
