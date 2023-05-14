package com.prcatices_12_5;

public class NumberOfOddAndEvenInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int even=0;
		int odd=0;
		for(int i=1;i<=arr.length;i++) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("in given array number of Even is "+even+" and number of odd "+odd);

	}

}
