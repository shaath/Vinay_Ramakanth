package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultiplewindowHandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Privacy")).click();

//		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getTitle());
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String wId=it.next();
			System.out.println(wId);
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle());
			try
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTight(2000);
				System.out.println(driver.getTitle());
			} 
			catch (Exception e) 
			{
				System.out.println("Expected link not avaialble in this page");
			}
		}
		
		driver.quit();
	}

}
