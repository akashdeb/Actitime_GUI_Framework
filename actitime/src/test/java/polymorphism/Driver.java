package polymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		
		TestGoogle.test(new ChromeDriver());
		System.out.println("The application is tested on Chrome");
		
		TestGoogle.test(new FirefoxDriver());
		System.out.println("The application is tested on Firefox");
		
		TestGoogle.test(new EdgeDriver());
		System.out.println("The application is tested on Edge");
		
	}

}
