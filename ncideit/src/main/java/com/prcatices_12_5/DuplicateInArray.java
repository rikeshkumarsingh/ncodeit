package com.prcatices_12_5;

public class DuplicateInArray {
	public static void main(String[] args) {
		int arr[]= {5,1,2,2,3,4,5,6,7,8,9,5,5};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
					
				}
				
			}
			
		}

	}
}
