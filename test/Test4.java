package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

class Test4 {
	@Parameters({"username","pass"})
	@Test
	public void webLoginHomeLoan(String uname,String password) {
		System.out.println("web login home loan");
		System.out.println(uname+" "+password);
	}
	
	@Test(dataProvider = "dataProvide")
	public void mobileLoginHomeLoan(String username,String password) {
		System.out.println("mobile login home loan");
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void apiLoginHomeLoan() {
		System.out.println("api login home loan");
	}
	@DataProvider
	public Object[][] dataProvide() {
		Object[][] obj = new Object[3][2];
		obj[0][0] = "firstusername";
		obj[0][1] = "firstpassword";
		
		obj[1][0] = "secondusername";
		obj[1][1] = "secondpassword";
		
		obj[2][0] = "thirdusername";
		obj[2][1] = "thirdpassword";
		
		return obj;
	}
}
