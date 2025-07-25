package com.app;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Character Here......");
		
		char ch = sc.next().charAt(0);
	
		switch (ch) {
		case 'A':
			System.out.println("Welcome Pratik Here..");
			System.out.println("Result = " +(10+10));
			
			break;
			
		case 'B':
			System.out.println("Welcome Ram Here..");
			System.out.println("Result = "+(20-5));
			break;
			
		case 'C':
			System.out.println("Welcome Shyam Here..");
			System.out.println("Result = "+(10*5));
			break;
			
		case 'D':
			System.out.println("Welcome Arpit Here..");
			System.out.println("Result = "+(50/2));
			break;

		default:
			System.out.println("Invalid choice here.......");
			break;
		}

	}

}
