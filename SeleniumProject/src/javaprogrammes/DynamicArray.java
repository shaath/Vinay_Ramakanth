package javaprogrammes;

public class DynamicArray {

	public static void main(String[] args)
	{
		int[] s=new int[10];

		//length of the array
		
		System.out.println(s.length);
		
		//Write the data into array
		
		s[5]=50000;
		s[8]=70000;
		s[2]=60000;
		s[3]=50000;
//		s[10]=60000;
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}

}
