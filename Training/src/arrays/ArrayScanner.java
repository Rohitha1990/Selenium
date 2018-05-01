package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner 
{
	 
	public static void main(String[] args)
	{
		
		int asize,sum=0;
		
		//to declare values in runtime we Scanner class//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size :");
		asize = sc.nextInt();
		
		int[] y=new int[asize];//Array declaration//
		System.out.println("Enter Array Values :");
		
		for(int i=0;i<y.length;i++)
		{
			int val=sc.nextInt();
			System.out.println("y[ " + i + " ] =" +val);
			sum=sum+val;
			System.out.println("sum of array values " +sum);
		}
		
		Arrays.sort(y);
		System.out.println("Array values in descending order :");
		
		
		for(int i=0;i<y.length;i++)
		{
			int val=sc.nextInt();
		    System.out.println("y[ " + i + " ] =" +val);
		    
		
		
			

		
		}

	}
}
