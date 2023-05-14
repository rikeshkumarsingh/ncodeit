package com.prcatices_12_5.Array;

public class MaxMinArray {
	public static void main(String[] args) {
		int arr[]= {1,5,3,4,8,9,7,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		System.out.println("Maximum value in array is "+arr[arr.length-1]);
		System.out.println("Minimum value in array is "+arr[0]);
	}

}
