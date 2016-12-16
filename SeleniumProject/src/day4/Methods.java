package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Methods 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//getTitle()
		System.out.println(driver.getTitle());
		//getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		
		//navigate()
		
		driver.navigate().to("http://facebook.com");
		//getTitle()
		System.out.println(driver.getTitle());
		//getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().refresh();
		
		
		
	}

}
