package com.prcatices_12_5.conditional;

import java.util.Scanner;

public class NegativePositive {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		if(num>0) {
			System.out.println("It is positive number");
		}
		else if(num==0) {
			System.out.println("It is Zero");
		}
		else {
			System.out.println("It is negative number");
		}
		

	}
}
