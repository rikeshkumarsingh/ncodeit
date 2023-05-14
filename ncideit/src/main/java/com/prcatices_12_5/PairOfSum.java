package com.prcatices_12_5;

public class PairOfSum {
	public static void main(String[] args) {
		int givenNumber=10;
		int arr[]= {1,8,3,4,7,6,2,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==givenNumber) {
					System.out.println("sum of "+arr[i]+" and "+arr[j]+" is "+givenNumber);
				}
				
			}
			
		}
		
		
		

	}
}
