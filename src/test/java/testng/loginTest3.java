package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginTest3 {
		@BeforeClass
		public void befoclas()
		{
			System.out.println("before executing any methods in the class");
		}
		@Parameters({"URL","APIKey/username" })
		@Test
		public void WebloginCarloan(String urlname,String key)
		{
			System.out.println("weblogincar");
			System.out.println(urlname);
			System.out.println(key);
			
		}
		@BeforeMethod
		public void beforeevery()
		{
			System.out.println(" I will execute before every test method in day 3 class");
		}
		@AfterMethod 
		public void Aftereevery()
		{
			System.out.println(" I will execute every every test method in day 3 class");
		}
		@AfterClass
		public void afteclas()
		{
			System.out.println("After executing all methods in the class");
		}
		
		@Test(groups=("Smoke"))
		public void Mobilelogincarloan()
		{
			System.out.println("Mobilelogincar");
		}
		@BeforeSuite
		public void Bfsuite()
		{
			System.out.println(" I am no 1");
		}
		
		@Test
		public void Mobilesignincarloan()
		{
			System.out.println("Mobile signin");
			
		}
		@Test(dataProvider="getData")
		public void Mobilesignoutcarloan(String username, String password)
		{
			System.out.println("Mobile signout");
			System.out.println(username);
			System.out.println(password);
		}
		@Test(dependsOnMethods=("WebloginCarloan"))
		public void APIcarLoan()
		{
			System.out.println("APIlogincar");
		}

		@DataProvider
		public Object[][] getData()
		{
			//1st combination - username password good credit history =row
			//2nd- username password - no credit history 
			//3rd - fraudelent credit history 
			
			Object[][] data = new Object[3][2];
			//1st set
			data[0][0] ="firstsetusername";
			data[0][1] ="password";
			//columns in the row are nothing but values for the particular combination(row)
			data[1][0] ="Secondsetusername";
			data[1][1] ="Secondsetpassword";
			//3rd set
			data[2][0] ="thirdsetusername";
			data[2][1] ="thirdsetusername";
			return data;
		}

}
