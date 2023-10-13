package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utils {
	
public static void takeScreenShotOfElement(WebElement element) throws IOException {
		
		Date date = new Date();
		String sysdate = date.toString().replace(" ", "_").replace(":", "_");
		
		File source = element.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/googleImage"+sysdate+".png");
		
		FileHandler.copy(source, destination);
		
	}


public static void takeScreenShotOfWebPage(WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./screenshots/googleImage2.png");
	
	FileHandler.copy(source, destination);
	
}


}
