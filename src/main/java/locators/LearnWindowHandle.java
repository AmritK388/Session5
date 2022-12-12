package locators;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnWindowHandle {
	
		
	WebDriver driver;

	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "/Users/Amrit/Selenium/session4/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void testWindowHandle() throws InterruptedException{
		
//		String title1 = driver.getTitle();
//		System.out.println(title1);
//		String handle1 = driver.getWindowHandle();
//		System.out.println(handle1);
		
		driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
		
		Thread.sleep(2000);
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		String handle2 = driver.getWindowHandle();
//		System.out.println(handle2);
		
		driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a")).click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for(String str : handles) {
//			System.out.println(str);
			driver.switchTo().window(str);
		}
		
		
		driver.switchTo().window(handle2);
		
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		driver.switchTo().window(handle2);
		
		String titlePrevious = driver.getTitle();
		System.out.println(titlePrevious);
		
		
	}

}



