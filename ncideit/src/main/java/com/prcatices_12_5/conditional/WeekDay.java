package com.prcatices_12_5.conditional;

import java.util.Scanner;

public class WeekDay {
	public static void main(String[] args) {
		System.out.println("enter a number to show weekday");
		Scanner scanner=new Scanner(System.in);
		int Day=scanner.nextInt();
		switch (Day) {
		
		case 1:System.out.println("Monday");
		
		break;
		case 2:System.out.println("Tuesday");
		
		break;
		case 3:System.out.println("Wednesday");
		
		break;
		case 4:System.out.println("Thrusday");
		
		break;
		case 5:System.out.println("Friday");
		
		break;
		case 6:System.out.println("Saturday");
		
		break;
		case 7:System.out.println("Sunday");
		
		break;

		default:
			System.out.println("please enter the number between 1 to 7");
			break;
		}
	}

}
