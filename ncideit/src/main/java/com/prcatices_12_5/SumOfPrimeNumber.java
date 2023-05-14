package com.prcatices_12_5;

public class SumOfPrimeNumber {
public static void main(String[] args) {
	int a=1;
	int flag=0;
	int sum=0;
	int i=0;
	int b=2;
	while (a<=100){
		 flag=0;
		for( i=2;i<=b/2;i++) {
			if(b%i==0) {
				flag++;
				break;
			}
				
		}
		if(flag==0) {
			sum+=b;
			a++;
		}
		b++;
	}
	System.out.println("sum of first 100 prime number is "+sum);
	
}
}
