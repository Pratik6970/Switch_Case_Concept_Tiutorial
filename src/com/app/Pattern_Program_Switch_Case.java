package com.app;

import java.util.Scanner;

public class Pattern_Program_Switch_Case {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number to Print Star Pattern Here.......");
		
		System.out.println("Enter the choice here........");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 5:
			
			for(int i=1; i<=5; i++)
			{
				for(int j = 1 ; j<=5; j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
			
			break;
			
		case 10:
			
			for(int i =1 ;i<=10; i++)
			{
				for(int j =1 ; j<=10; j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
			break;

        case 15:
			
			for(int i =1 ;i<=15; i++)
			{
				for(int j =1 ; j<=15; j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
			break;

		default:
			System.out.println("Invalid choice here..... sorry");
			break;
		}
	}
	

}
