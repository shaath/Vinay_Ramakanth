package day1;

import org.openqa.selenium.opera.OperaDriver;

public class OperaLaunch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Dell\\Downloads\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("http://google.com");

	}

}
