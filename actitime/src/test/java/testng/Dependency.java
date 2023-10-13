package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test(priority = 1)
	public void login() {
		System.out.println("The user is logged in");
	}
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void searchProduct() {
		Assert.fail();
		System.out.println("The product is found");
	}
	
	@Test(priority = 3, dependsOnMethods = "searchProduct")
	public void addToCart() {
		System.out.println("The product is added to cart");
	}
	
	@Test(priority = 4, dependsOnMethods = "addToCart")
	public void paymemt() {
		System.out.println("The product is paid");
	}

	@Test(priority = 5, dependsOnMethods = "login")
	public void logout() {
		System.out.println("The user has logged out");
	}

}
