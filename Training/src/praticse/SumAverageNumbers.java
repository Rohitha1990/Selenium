package praticse;

import java.util.Scanner;

public class SumAverageNumbers
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		int sum=0, avg=0;
		System.out.println("Enter Any Three Numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.println("You entered : "  +num1+  "," +num2+ "," +num3);
		
		sum = num1+num2+num3;
		System.out.println("Sum of all the three numbers together = " + sum);
		
		avg = sum/3;
		System.out.println("Finding average of the three numbers = " + avg);
		
	}

}
