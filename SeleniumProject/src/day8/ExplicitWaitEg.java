package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		//webdriverwait
//		WebDriverWait wait=new WebDriverWait(driver, 40);
//		
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("html/body/div[4]/div[2]/div/div[1]/div[2]/div/a")));
		
		//Fluentwait
		
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).
								withTimeout(40, TimeUnit.SECONDS)
								.pollingEvery(2, TimeUnit.SECONDS)
								.ignoring(NoSuchElementException.class);
		
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/div[2]/div/div[1]/div[2]/div/a")));
		
		driver.findElement(By.xpath("html/body/div[4]/div[2]/div/div[1]/div[2]/div/a")).click();
	}

}
