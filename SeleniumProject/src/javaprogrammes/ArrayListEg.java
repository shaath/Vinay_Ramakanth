package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<Object>();
		
		//Adding the values to the arraylist
		a.add("Selenium");
		a.add(30000);
		a.add(true);
		
		//length of the array list
		System.out.println(a.size());
		
		for (int i = 0; i < a.size(); i++) 
		{
			System.out.println(a.get(i));
		}

	}

}