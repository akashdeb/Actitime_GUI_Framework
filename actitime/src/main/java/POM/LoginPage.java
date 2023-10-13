package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//2. Constructor
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//1. Element identification
	@FindBy(id = "username")
	private WebElement usernameTextField;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;
	

	//4. getter methods
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}



	public WebElement getPasswordTextField() {
		return passwordTextField;
	}



	public WebElement getLoginButton() {
		return loginButton;
	}


	//3. Business Logic
	public void loginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
	}
	

}
