package com.test;
import static org.testng.AssertJUnit.assertNotNull;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import com.base.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.ExcelUtil;

public class LoginPageTest extends BaseTest{
	

	LoginPage lp;
	HomePage hp;
	
	@BeforeClass
	public void initialize()
	{
		//hp = new HomePage(driver);

	}
	//@DataProvider(name ="user-data")
	public Object[][] getUserData()
	{
		Object [][] data = {{"surya","kjjnijn"}, {"surya","kjjnijn"}};
		return data;
		
	}
	//@Test(dataProvider = "user-data")
	public void testInvalidLogin(String userName,String pwd)
	{
/*		hp.clickLogin();
		lp = new LoginPage(driver);
		String actString = lp.invalidLogin(userName, pwd);
		assertEquals("You have not registered.",actString);*/
	}
	@BeforeClass
	public void beforeClass(){
		lp = new LoginPage(driver);
	}
	@DataProvider(name="userData")
	public Object[][] getUsers(){
		Object[][] data = ExcelUtil.getData();
		System.out.println(data);
		return data;
	}
	@Test(dataProvider = "userData")
	public void testLogin(String username,String password){
		System.out.println("user name " + username + "pwd " + password);
		assertNotNull(username);
	}
	

	
}
