package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FFLAunch {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		//LAunching the application in browser
		
		driver.get("http://google.com");

	}

}
