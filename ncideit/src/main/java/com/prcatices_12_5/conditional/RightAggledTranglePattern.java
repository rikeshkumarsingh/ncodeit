package com.prcatices_12_5.conditional;

import java.util.Iterator;
import java.util.Scanner;

public class RightAggledTranglePattern {
	public static void main(String[] args) {
		System.out.println("enter a number of Layer");
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		for(int i=1;i<=l;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
