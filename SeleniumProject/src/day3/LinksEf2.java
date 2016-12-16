package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEf2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Home")).click();
		//Method1
		
//		driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();
		
		//Method2
		
//		List<WebElement> home=driver.findElements(By.linkText("Home"));
//		
//		System.out.println(home.size());
//		
//		home.get(1).click();
		
		//Method3
		
//		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
//		
//		List<WebElement> links=block.findElements(By.tagName("a"));
//		
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++)
//		{
//			String lName=links.get(i).getText();
//			System.out.println(lName);
//			if (lName.equalsIgnoreCase("Home"))
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		
		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td")).findElement(By.linkText("Home")).click();
		
	}

}