package java_basic_question;

import java.util.Scanner;

public class EligibilityCheck {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age");
		int age = sc.nextInt();
		boolean hasLicense = true;
		
		if(age >= 18) {
			if(hasLicense) {
				System.out.println("you can vote and drive.");
			}else {
				System.out.println("You can vote but not drive.");
			}
		}else {
			System.out.println("you are not eligible to vote or drive. ");
		}
		
	}

}
