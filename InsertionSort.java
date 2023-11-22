package com.demo.sorting;

import java.util.Arrays;

public class InsertionSort {
	public  static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			for(;j>=0 && arr[j]>key;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {2,1,33,453,4,45,678,47,5};
   insertionSort(arr);
   System.out.println(Arrays.toString(arr));
	}

	

}
