package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class SynchronizationEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		//To launch the application
		driver.get("http://gmail.com");
		//Maximize the window
		driver.manage().window().maximize();
		
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		//Identification of the email textbox
		WebElement email=driver.findElement(By.id("Email"));
		//Enter the data into email 
		email.sendKeys("gandesharath");
		//wait for 5 seconds
//		Sleeper.sleepTightInSeconds(5);
		
		//clear the text in textbox
//		email.clear();
		
		//click on next button
		
		driver.findElement(By.name("signIn")).click();
		
//		Thread.sleep(5000);
		//Enter the text in password field
		
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("123456789");
		
		//click on signin button
		
		driver.findElement(By.cssSelector("#signIn")).click();

	}

}
