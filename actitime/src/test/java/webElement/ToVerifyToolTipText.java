package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyToolTipText {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String toolTipText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		
		System.out.println(toolTipText);
		
		if(toolTipText.contains("Do not select")) {
			System.out.println("Pass: the tool tip text is verified");
		}
		
		else
			System.out.println("Fail: the tool tip text is not verified");

	}

}
