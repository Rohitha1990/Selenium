package praticse;

public class PyramidTriangle 
{

	public static void main(String[] args)
	{
		
		int space = 4;
		int i, j;
		
		for(i=1; i<=5; i++)
		{
			//print the space//
			for(j=1; j<=space; j++)
				System.out.print(" ");
			
			//print the stars//
			for(j=1; j<=i; j++)
				System.out.print("* ");
			
			//print a new line//
			System.out.println();
			space--;
		}
		
	}

}
