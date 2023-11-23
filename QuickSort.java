package com.demo.sorting;

import java.util.Arrays;

public class QuickSort {
	
	private static void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
	    if(start<end) {
	    	int p =partionPivot(arr,start,end);
	    	quickSort(arr,start,p-1);
	    	quickSort(arr,p+1,end);
	    }
	}
	private static int partionPivot(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot=start;
		int i=start;
		int j=end;
		while(i<j) {
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>pivot && arr[j]>arr[pivot]) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		
		return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,1,342,23,44,56,77,4,3,60};
		int start=0;
		int end=arr.length-1;
		System.out.println("The original array");
		System.out.println(Arrays.toString(arr));
		
		
     quickSort(arr,start,end);
     System.out.println("The quick_sort array");
		System.out.println(Arrays.toString(arr));
	}

	

}
