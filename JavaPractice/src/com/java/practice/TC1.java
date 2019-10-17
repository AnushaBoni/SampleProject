package com.java.practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends BaseClass {
	
	
	
	@Test(groups = { "smoke", "sanity" })
	public void m1() {
		System.out.println("m1");
	}
	
	@Test(groups = { "smoke", "regression" })
	public void m2() {
		System.out.println("m2");
	}
	
	@Test(groups = { "smoke"})
	public void m3() {
		System.out.println("m3");
	}
	
	@Test(groups = {"sanity" })
	public void m4() {
		System.out.println("m4");
	}

}
