package javaprogrammes;

import java.util.Scanner;

public class SwitchCaseEg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String course=sc.next();
		
		switch (course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "Uft":
			System.out.println("You are selected Uft");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
