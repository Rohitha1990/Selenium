package praticse;

import java.util.Scanner;

public class EvenandOddNumbers {
	
	
	public static void main(String[] args) 
	{
		int num = 0 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number : ");
		 num = sc.nextInt();
		
		if(num/2==0)
		{
			System.out.println("It is a even number");
		}
		else
		{
			System.out.println("It is an odd number");
		}
			
		
		
			

	}

}
