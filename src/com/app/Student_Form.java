package com.app;

import java.util.Scanner;

public class Student_Form {

	public static void main(String[] args) {

		System.out.println("========== Student_Form Here ==========");
		String wantToContinue = "Yes";

		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.print("Enter Name: ");
			String name = sc.next();

			System.out.print("Enter Age: ");
			int age = sc.nextInt();

			System.out.print("Enter Email ID: ");
			String email = sc.next();

			System.out.print("Enter Contact No: ");
			long contact = sc.nextLong();

			
			System.out.println("\nSelect Gender:");
			System.out.println("1. Male");
			System.out.println("2. Female");
			System.out.println("3. Other");
			System.out.print("Enter choice: ");
			int genderChoice = sc.nextInt();

			String gender;
			switch (genderChoice) {
			case 1:
				gender = "Male";
				System.out.println("Male selected.");
				break;
			case 2:
				gender = "Female";
				System.out.println("Female selected.");
				break;
			case 3:
				gender = "Other";
				System.out.println("Other selected.");
				break;
			default:
				gender = "Invalid";
				System.out.println("Invalid gender selected.");
				break;
			}

			
			System.out.println("\nSelect Education:");
			System.out.println("1. SSC");
			System.out.println("2. HSC");
			System.out.println("3. UnderGraduation");
			System.out.println("4. Post-Graduation");
			System.out.print("Enter choice: ");
			int educationChoice = sc.nextInt();

			String education;
			switch (educationChoice) {
			case 1:
				education = "SSC";
				System.out.println("SSC selected.");
				break;
			case 2:
				education = "HSC";
				System.out.println("HSC selected.");
				break;
			case 3:
				education = "UnderGraduation";
				System.out.println("UnderGraduation selected.");
				break;
			case 4:
				education = "Post-Graduation";
				System.out.println("Post-Graduation selected.");
				break;
			default:
				education = "Invalid";
				System.out.println("Invalid education selected.");
				break;
			}

			// 4. Summary
			System.out.println("\n========== Student Information ==========");
			System.out.println("Name       : " + name);
			System.out.println("Age        : " + age);
			System.out.println("Email      : " + email);
			System.out.println("Contact No : " + contact);
			System.out.println("Gender     : " + gender);
			System.out.println("Education  : " + education);
			System.out.println("=========================================");

			
			System.out.print("\nDo you want to enter another student? (Yes/No): ");
			
			wantToContinue=sc.next();
			
			if(wantToContinue.equalsIgnoreCase("No"))
			{
				break;
			}

		} while (wantToContinue.equalsIgnoreCase("Yes"));

		System.out.println("Thank you! Form entry completed.");
		sc.close();
	}

}
