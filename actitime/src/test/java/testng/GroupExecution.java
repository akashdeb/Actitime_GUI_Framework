package testng;

import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test(groups = "smoke")
	public void demo1() {
		System.out.println("Smoke Testing 1");
	}

	
	@Test(groups = "regression")
	public void demo2() {
		System.out.println("Regression Testing 1");
	}

	
	
	@Test(groups = "smoke")
	public void demo3() {
		System.out.println("Smoke Testing 2");
	}

	
	
	@Test(groups = "regression")
	public void demo4() {
		System.out.println("Regression Testing 2");
	}

	
	@Test(groups = "smoke")
	public void demo5() {
		System.out.println("Smoke Testing 3");
	}

}
