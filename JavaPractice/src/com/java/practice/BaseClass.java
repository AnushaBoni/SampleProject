package com.java.practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	
	@BeforeClass
	public void bc() {
		System.out.println("am in bc");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("am in bm");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("am in bt");
	}
	
	@BeforeSuite
	public void bs() {
		
	}
}
