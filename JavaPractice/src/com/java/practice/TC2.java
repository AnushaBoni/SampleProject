package com.java.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 extends BaseClass {
	
	@Test
	public void m1() {
		
		Assert.assertEquals(false, true);
		System.out.println("tc2m1");
	}
	
	@Test
	public void m2() {
		System.out.println("tc2m2");
	}
	@Test
	public void m3() {
		System.out.println("tc2m3");
	}
}
