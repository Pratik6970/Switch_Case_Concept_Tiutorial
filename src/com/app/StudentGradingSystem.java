package com.app;

import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (0 to 100): ");
        int marks = scanner.nextInt();
        String grade;

        
        int gradeCategory = marks / 10;

        switch (gradeCategory) {
            case 10:
            case 9:
                grade = "A (Excellent)";
                break;
            case 8:
                grade = "B (Very Good)";
                break;
            case 7:
                grade = "C (Good)";
                break;
            case 6:
                grade = "D (Satisfactory)";
                break;
            case 5:
                grade = "E (Needs Improvement)";
                break;
            default:
                grade = "F (Fail)";
        }

        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}
