package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void demoAssertion1() {
		String a = "Qspiders";
		String b = "Jspiders";
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a, b);
		System.out.println("Line before assertion for demo 1");


		sa.assertAll();
		
		System.out.println("Line after assertion for demo 1");


	}
	
	@Test
	public void demoAssertion2() {
		int a = 420;
		int b = 143;
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a, b);
		System.out.println("Line before assertion for demo 2");


		sa.assertAll();
		
		System.out.println("Line after assertion for demo 2");


	}
	
	
	@Test
	public void demoAssertion3() {
		boolean a = true;
		boolean b = false;
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a, b);
		System.out.println("Line before assertion for demo 3");


		sa.assertAll();
		
		System.out.println("Line after assertion for demo 3");


	}

}
