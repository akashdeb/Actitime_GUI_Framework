package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableTestcase {
	
	@Test(priority = 1)
	public void goodMorning() {
		System.out.println("Good Morning");
	}
	
	@Test(priority = 2, enabled = false)
	public void breakFast() {
		System.out.println("Break fast with paratha");
	}
	
	@Test(priority = 3)
	public void work() {
		System.out.println("Work");
	}

}
