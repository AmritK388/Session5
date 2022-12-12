package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class loginTest {
	
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	
	
	
	@Test
	public void Demo()
	{
		System.out.println("hello");
	}
	@AfterSuite
	public void afSyite()
	{
		System.out.println("I am the  no 1 from last ");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}




}

