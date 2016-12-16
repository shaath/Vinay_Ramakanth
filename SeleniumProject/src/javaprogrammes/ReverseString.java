package javaprogrammes;

public class ReverseString {

	public static void main(String[] args)
	{
		//dad---->dad
		//QEdge------> egdEQ
		//Polindrome
		String Original="QEdge";
		String Reverse="";
		int len=Original.length();
		
		for (int i = len-1; i >= 0; i--)
		{
			Reverse=Reverse+Original.charAt(i);
		}
		System.out.println(Reverse);
	}

}
