package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangehrmLogin {

	public static void main(String[] args)
	{
	   WebDriver driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin");
	   driver.findElement(By.id("btnLogin")).click();

	}

}
