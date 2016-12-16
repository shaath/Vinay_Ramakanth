package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("sharathqedge449");
		driver.findElement(By.id("next")).click();
		
		Thread.sleep(5000);
		
//		WebElement check=driver.findElement(By.id("PersistentCookie"));
//		
//		if (check.isSelected()) 
//		{
//			check.click();
//		}
		driver.findElement(By.id("Passwd")).sendKeys("333ddd33");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		
		String eMsg=driver.findElement(By.id("errormsg_0_Passwd")).getText();
		System.out.println(eMsg);
		

	}

}
