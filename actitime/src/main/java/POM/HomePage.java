package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Logout")
	public WebElement logoutLink;
	
	
	public void logoutAction() {
		logoutLink.click();
	}
	
}
