package day12;

import day11.OrgMaster;

public class UserLoginTC {

	public static void main(String[] args)
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Sharath123456", "Sharath123456");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed");

	}

}