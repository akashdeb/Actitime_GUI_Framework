package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//1. The physical property file is converted to Java representation
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_July3PmBatch2023\\Automation\\testData\\propertyData.properties");
		
		//2. creating an object of Properties Class
		Properties prop = new Properties();
		
		//3. calling the load method to read the key and value pair
		prop.load(fis);
		
		//4 calling the value using the key
		String urlFromPropertyFile = prop.getProperty("url");
		System.out.println(urlFromPropertyFile);
		
		String browserFromPropertyFile = prop.getProperty("browser");
		System.out.println(browserFromPropertyFile);
		

		String usernameFromPropertyFile = prop.getProperty("username");
		System.out.println(usernameFromPropertyFile);
		

		String passwordFromPropertyFile = prop.getProperty("password");
		System.out.println(passwordFromPropertyFile);
		

		
		

	}

}
