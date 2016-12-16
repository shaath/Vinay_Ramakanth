package javaprogrammes;

public class ForLoopEg {

	public static void main(String[] args) 
	{
		for(int i=1; i <= 100; i++)
		{
			System.out.println(i);
			if (i==50)
			{
				break;
			}
		}
		System.out.println("******************************");
		
		for (int i = 100; i >= 1; i--)
		{
			System.out.println(i);
			if (i==70)
			{
				break;
			}
		}
		
		System.out.println("####################");
		for (char a = 'A'; a <= 'Z'; a++)
		{
			System.out.println(a);
		}
	}

}
