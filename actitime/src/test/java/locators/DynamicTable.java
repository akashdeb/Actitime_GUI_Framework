package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
	
		String playerName = "Babar Azam";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i/batting");
		
		WebElement rankingAdd = driver.findElement(By.xpath("//a[text()='"+playerName+"']/ancestor::tr/descendant::td[4]"));
		
		String rating = rankingAdd.getText();
		
		System.out.println(rating);

	}

}
