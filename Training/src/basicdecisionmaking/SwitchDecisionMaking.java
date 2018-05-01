package basicdecisionmaking;

import java.util.Scanner;

public class SwitchDecisionMaking {

	public static void main(String[] args) 
	{
		int a=10, b=20, c;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Select the case ..... : " );
	    String var = sc.next();
	    System.out.println(var);
	    
	    switch (var) {
		case "add":
			c=a+b;
			System.out.println("Addition Result is : " +c);
			break;

		case "sub":
			c=a-b;
			System.out.println("Subtraction Result is : " +c);
			break;
			
		case "mul":
			c=a*b;
			System.out.println("Multiplication Result is : " +c);
			break;
			
		case "div":
			c=a/b;
			System.out.println("Division Result is : " +c);
			break;
			
		}
	    		
	    		
	    		
	    		
	    		

	}

}
