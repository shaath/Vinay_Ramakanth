package day14;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import day11.OrgMaster;

public class org_loginTC 
{
	OrgMaster om=new OrgMaster();
	String res=null;
	@BeforeClass
	public void setup()
	{
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
	}
	@Test
	public void login()
	{
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
	}
	
	@AfterClass
	public void logout_close()
	{
		res=om.org_Logout();
		System.out.println(res);
		om.org_Close();
	}

}
