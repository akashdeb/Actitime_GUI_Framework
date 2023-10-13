package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	//How will u execute same test script multiple times using multiple datas
	//What will be the return type of data provider == Two Dimensional Object Array
	
	@DataProvider
	public Object[][] data() {
		
		Object[][] arr = new Object[5][3];
		
		arr[0][0]= "Noida";
		arr[1][0]= "Delhi";
		arr[2][0]= "Punjab";
		arr[3][0]= "Meerut";
		arr[4][0]= "Tripura";
		
		arr[0][1]= "Afgani Chaap";
		arr[1][1]= "Chole Bhature";
		arr[2][1]= "Lassi";
		arr[3][1]= "Nun Katai";
		arr[4][1]= "Oranges";
		
		arr[0][2]= "Check";
		arr[1][2]= "Check";
		arr[2][2]= "Un check";
		arr[3][2]= "Un check";
		arr[4][2]= "Check";

		
		return arr;
		
	}
	
	@Test(dataProvider = "data")
	public void test(String place, String food, String status) {
		
		System.out.println("Place : "+place+" "+"Food : "+food+" "+" Status : "+status);
	}

}
