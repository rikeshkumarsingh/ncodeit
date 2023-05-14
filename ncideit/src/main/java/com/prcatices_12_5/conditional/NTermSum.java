package com.prcatices_12_5.conditional;

import java.util.Scanner;

public class NTermSum {
	public static void main(String[] args) {
		System.out.println("enter a number till print the sum");
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int sum=0;
		
		for(int i=1;i<=l;i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum of natural number till "+l+" is "+sum);
	}

}
