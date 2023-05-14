package com.prcatices_12_5.conditional;

import java.util.Scanner;

public class BonusCalculation {
	public static void main(String[] args) {
		System.out.println("enter your service in year");

		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		System.out.println("enter your selery");

		int s = scanner.nextInt();

		if(l>=5) {
			System.out.println("your bonus is "+(5*s)/100);
		}
		else {
			System.out.println("your service is less than 5 year");
		}
	}

}
