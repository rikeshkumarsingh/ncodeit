package com.prcatices_12_5.conditional;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		System.out.println("enter a 3 number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		if(num>num2&&num>num3) {
			System.out.println(num+" is Greatest number among three");
		}
		else if(num2>num&&num2>num3) {
			System.out.println(num2+" is Greatest number among three");
		}
		else {
			System.out.println(num3+" is Greatest number among three");
		}
		

	}
}
