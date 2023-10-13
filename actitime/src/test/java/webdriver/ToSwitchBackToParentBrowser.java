package webdriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToParentBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		String parentID = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);

		driver.navigate().to("https://www.facebook.com/");
		
		String titlefacebook = driver.getTitle();
		System.out.println(titlefacebook);

		driver.switchTo().window(parentID);
		
		String titlegoogle = driver.getTitle();
		
		System.out.println(titlegoogle);
		
		Set<String> allIDs = driver.getWindowHandles();
		
		for(String id:allIDs) {
			driver.switchTo().window(id);//child
			if(!id.equals(parentID)) {
				String titlefacebookAgain = driver.getTitle();
				
				System.out.println(titlefacebookAgain);
			}
		}
		
		
	}

}
