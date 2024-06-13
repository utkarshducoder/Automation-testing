package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

class Test1 {
//	public static void main(String[] args) {
//		System.out.println("Hello");
//	}
	@Parameters({"URL"})
	@Test
	public void Demo(String name) {
		System.out.println("Hello");
		System.out.println(name);
	}
	@Test
	public void last() {
		System.out.println("I will execute in the last");
	}
	@Test(timeOut = 4000)
	public void Demo2() {
		System.out.println("By");
	}
}
