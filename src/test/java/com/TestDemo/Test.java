package com.TestDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Test {

	@BeforeSuite
	public void Beforesuite() {
		System.out.println("BS");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		System.out.println("BT");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("BClass");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("BM");
	}
   @org.testng.annotations.Test
   public void Test1() {
	   System.out.println("1");
   }
	@org.testng.annotations.Test
	public void Test2() {
		System.out.println("2");
	}
@AfterMethod
public void AM() {
	System.out.println("AM");
}
@AfterClass
public void AC() {
	System.out.println("AC");
}
@AfterTest
public void AT() {
	System.out.println("AT");
}
@AfterSuite
public void AS() {
	System.out.println("AS");
}
	
}
