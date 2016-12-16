package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class Examples {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		String pValue=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		
		System.out.println(pValue);
		
		//close()
		driver.close();
		
		WindowsUtils.killByName("eclipse.exe");
	}

}
