package day11;

public class MethodsEg1 
{
	public static void main(String[] args) 
	{
		MethodsEg1 m=new MethodsEg1();
		
		int res=m.sum(60,40);
		System.out.println(res);
		
	}
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
 	}

}
