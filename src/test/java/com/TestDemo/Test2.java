package com.TestDemo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Test2 {
@BeforeMethod
public void BM() {
	System.out.println("Browser Open");
}
@Test
public void Verify() {
	System.out.println("Test");
}
@Test
public void Verify2() {
	System.out.println("Test2");
}

@AfterMethod
public void AM() {
	System.out.println("Browser close");
}
}
