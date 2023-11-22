package com.demo.sorting;

import java.util.Arrays;

public class Selectionsort {
	public static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			cnt++;
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min==i) {
				break;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {99,2,26,75,1,343,44};
        int[] arr1= {9,21,26,75,100,343};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        
	}

	

}
