package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void demo() {
		String a = "Qspiders";
		String b = "spiders";
		
		Assert.assertTrue(a.contains(b));
		System.out.println("Control came to next line after checking string value");
	}
	@Test
	public void demo1() {
		int c = 143;
		int d = 420;

		Assert.assertEquals(c, d);
		System.out.println("Control came to next line after checking int value");

	}

	@Test
	public void demo2() {
		boolean e = true;
		boolean f = true;

		Assert.assertEquals(e, f);
		System.out.println("Control came to next line after checking boolean value");

	}

}
