package java_basic_question;

import java.util.Scanner;

public class GradingSystem {
	// Write a Java program that takes a student's
	// marks (out of 100) as input and prints
	// their grade according to the following rules
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
       System.out.println("Enter your marks to know your grades");
	   int marks = sc.nextInt();
	if(marks >= 91 && marks <= 100) {
		System.out.println(" your grade is A1\n"+"Congrats you got highest grade");
	}else if(marks <= 90 && marks >= 81) {
		System.out.println(" your grade is A2\n"+"your marks are beetween 81 to 90");
	}else if(marks <= 80 && marks >= 71) {
		System.out.println(" your grade is B1\n"+"your marks are beetween 71 to 80");
	}else if(marks <= 70 && marks >= 61) {
		System.out.println(" your grade is B2\n"+"your marks are beetween 61 to 70");
	}else if(marks <= 60 && marks >= 51) {
		System.out.println(" your grade is C1\n"+"your marks are beetween 51 to 60");
	}else if(marks <= 50 && marks >= 41) {
		System.out.println(" your grade is C2\n"+"your marks are beetween 41 to 50");
	}else if(marks <= 40 && marks >= 31) {
		System.out.println(" your grade is D1\n"+"your marks are beetween 31 to 40");
	}else if(marks <= 30) {
		System.out.println("sorry you failed this test");
	}else {
		System.out.println(" you have entered the wrong number\n"+"enter numbers between 1 to 100");
	}
	
}
}
