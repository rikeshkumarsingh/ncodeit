package com.prcatices_12_5.conditional;

import java.util.Scanner;

public class NumberOfDayInMonth {
	public static void main(String[] args) {
		System.out.println("enter a number to show month name and Number of days");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch (month) {

		case 1:
			System.out.println("Junary has 31 Days");

			break;
		case 2:
			System.out.println("Febrary has 28 Days");

			break;
		case 3:
			System.out.println("March has 31 Days");

			break;
		case 4:
			System.out.println("April has 30 Days");

			break;
		case 5:
			System.out.println("May has 31 Days");

			break;
		case 6:
			System.out.println("June has 30 Days");

			break;
		case 7:
			System.out.println("July has 31 Days");

			break;
		case 8:
			System.out.println("August has 31 Days");

			break;
		case 9:
			System.out.println("September has 30 Days");

			break;
		case 10:
			System.out.println("Octuber has 31 Days");

			break;
		case 11:
			System.out.println("November has 30 Days");

			break;
		case 12:
			System.out.println("December has 31 Days");

			
		
		default:
			System.out.println("please enter the number between 1 to 12");
			break;
		}

	}

}
