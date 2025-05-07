package java_basic_question;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter traffic light color (red, yellow, green): ");
		String color = sc.nextLine().toLowerCase();
		switch(color) {
		case "red": {
			System.out.println("Stop!");
			break;
		}
		case "yellow":{
			System.out.println("Ready!");
			break;
		}
		case "green": {
			System.out.println("Go!");
			break;
		}
		default :{
			 System.out.println("Invalid input");
			 break;
		}
		}
	}

}
