package testng;

import org.testng.annotations.Test;

public class RunMultipleTimes {
	//How will u execute same test script multiple times using same data
	
	@Test(priority = 1)
	public void goodMorning() {
		System.out.println("Good Morning");
	}
	
	@Test(priority = 2, invocationCount = 3)
	public void breakFast() {
		System.out.println("Break fast with paratha");
	}
	
	@Test(priority = 3)
	public void work() {
		System.out.println("Work");
	}

}
