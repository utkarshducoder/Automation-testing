package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

class Test3 {
	@BeforeMethod
	public void webLoginCarLoan() {
		System.out.println("weblogincar");
	}
	@Test
	public void mobileLoginCarLoan() {
		System.out.println("mobile login car");
	}
	@Test
	public void mobileSignUpCarLoan() {
		System.out.println("sign up with mobile in car loan");
	}
	@Parameters({"URL"})
	@Test
	public void mobileSignInCarLoan(String name) {
		System.out.println("sign in with mobile in car loan");
		System.out.println(name);
	}
	@Test
	public void apiLoginCarLoan() {
		System.out.println("login api car loan");
	}
}

