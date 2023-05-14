package com.prcatices_12_5;

public class SumOfDigitOfInteger {
public static void main(String[] args) {
	int num=365;
	
	int sum=0;
	
	
	while(num!=0) {
		int r=num%10;
		sum+=r;
		num/=10;
		
	}
	System.out.println(sum);
}
}
