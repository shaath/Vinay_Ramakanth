package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimusBAnkLoginTest
{
	public static WebDriver driver;
	@BeforeTest
	public void br_Launch()
	{
		driver=new FirefoxDriver();
	}
	@BeforeClass
	public void app_Launch()
	{
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void app_Login()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterClass
	public void app_Logout()
	{
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	@AfterTest
	public void br_Close()
	{
		driver.close();
	}
}
