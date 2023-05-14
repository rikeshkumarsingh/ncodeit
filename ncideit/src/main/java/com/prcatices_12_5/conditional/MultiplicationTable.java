package com.prcatices_12_5.conditional;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("enter a number to print a table");
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(l+" X "+i+" = "+l*i);
		}
	}

}
