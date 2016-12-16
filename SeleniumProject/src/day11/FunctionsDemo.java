package day11;


public class FunctionsDemo 
{
	public static void main(String[] args)
	{
		function1();

		String res=function2();
		System.out.println(res);
		
		FunctionsDemo fd=new FunctionsDemo();
		fd.function3();
		
		boolean flag=fd.function4();
		System.out.println(flag);
		
	}
	
	//static method without returning any value
	
	public static void function1()
	{
		System.out.println("This is function1 code");
	}

	//static method with returning value
	public static String function2()
	{
		System.out.println("This is funtion2 code");
		return "Pass";
	}
	
	//Nonstatic Method without reurning any value
	
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	//Non static Method with returrning value
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
	
}
