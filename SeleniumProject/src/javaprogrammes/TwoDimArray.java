package javaprogrammes;

public class TwoDimArray {

	public static void main(String[] args)
	{
		Object[][] x=new Object[2][3];

		//length of the rows
		
		System.out.println(x.length);
		
		//length of the columns
		
		System.out.println(x[0].length);
		
		//write the data into array
		
		x[1][2]="Selenium";
		
		x[0][1]=40000;
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}
		
		

	}

}
