package arrays;

import java.util.Scanner;

public class ArrayScanner1 
{

	public static void main(String[] args)
	{
		int a,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size of the element :");
		a=sc.nextInt();
		
		int[] y=new int[a];
		System.out.println("Enter the values of the array element :");
		
		for(int i=0; i<y.length; i++)
		{
			int val=sc.nextInt();
		 System.out.println("y [" + " ] = " + val);
		 sum=sum+val;
		 System.out.println("Sum of the array values =" + sum);
		 
				
		}

	}
}


