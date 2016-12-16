package day1;

import org.openqa.selenium.safari.SafariDriver;

public class SafaryLAunch {

	public static void main(String[] args) 
	{
		SafariDriver driver=new SafariDriver();
		driver.get("http://google.com");

	}

}
