package com.app;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		String wantToContinue="Yes";
		do {
			
			System.out.println("Switch Case Concept......");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the name......");
			
			String name =sc.next();
			
			switch (name) {
			case "ram":
				System.out.println("Ram ram here");
				
				break;
				
			case "Shyam":
				System.out.println("Shaym ram here");
				
				break;


			default:
				System.out.println("Invalid name here.......");
				break;
			}
			
			System.out.println("Do You Want To Continue Yes/No......");
			
			wantToContinue=sc.next();
			
			if(wantToContinue.equalsIgnoreCase("No"))
			{
				break;
			}
			
		} while (wantToContinue.equalsIgnoreCase("Yes"));
		
		
	}
	

}
