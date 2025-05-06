package java_basic_question;

import java.util.Scanner;

public class Grade_Evaluation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a letter grade (A-F): ");
		char Grade = sc.next().toUpperCase().charAt(0);
		switch (Grade) {
		case 'A': {
			System.out.println("Excellent");
			break;
		}
		case 'B': {
			System.out.println("Good");
			break;

		}
		case 'C': {
			System.out.println("Fair");
			break;
		}
		case 'D': {
			System.out.println("Poor");

			break;
		}
		case 'E': {
			System.out.println("Fail");
			break;
		}
		default: {
			System.out.println("Invalid Input");
			break;
		}
		}
	}

}
