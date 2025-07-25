package com.app;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		String wantToContinue="Yes";
		
		do {
			System.out.println("Calculator code here.......");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number1 here......");
			int num1=sc.nextInt();
			
			System.out.println("Enter the number2 here....");
			int num2=sc.nextInt();
			
			System.out.println("Enter the operator + - * / %");
		    char ch = sc.next().charAt(0);
		    
		    switch (ch) {
			case '+':
				int result=num1+num2;
				System.out.println("Addition = "+result);
				
				break;
				
			case '-':
				int result1=num1-num2;
				System.out.println("Subtraction = "+result1);
				break;
				
			case '*':
				int multiply = num1*num2;
				System.out.println("Multiply = "+multiply);
				break;
				
			case '/':
				int division = num1/num2;
				System.out.println("Division = "+division);
				break;
				
			case '%':
				int mod = num1%num2;
				System.out.println("Division = "+mod);
				break;
				

			default:
				System.out.println("Invalid choice here......");
				break;
			}
		    
		    System.out.println("Do You Want To Continue......Say Yes/No");
		    
		    wantToContinue=sc.next();
		    
		    if(wantToContinue.equalsIgnoreCase("No"))
		    {
		    	break;
		    }
			
		} while (wantToContinue.equalsIgnoreCase("Yes"));
		
		
		
	}

}
