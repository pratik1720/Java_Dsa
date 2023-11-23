package com.demo.sorting;

import java.util.Arrays;

public class MergeSort {
	private static void merge(int[] arr, int start, int end, int mid) {
		// TODO Auto-generated method stub
		int i,j,k;
		int n1=mid-start+1;
		int n2=end-mid;
		int[] leftArr=new int[n1];
		int[] rightArr=new int[n2];
		for(i=0;i<n1;i++) {
			leftArr[i]=arr[start+i];
			
		}
		for(i=0;i<n2;i++) {
			rightArr[i]=arr[mid+1+i];
			
		}
		
		
		i=0;j=0;k=start;
		while(i<n1 && j<n2) {
			if(leftArr[i]<rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
				k++;
			}
			else {
				arr[k]=rightArr[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
		
	}
	private static void mergeSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,end,mid);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {123,44,2,66,7,99,74,12,34,2};
       System.out.println("The original array is");
       System.out.println(Arrays.toString(arr));
       int start=0;
      int end=arr.length-1;
       mergeSort(arr,start,end);
       System.out.println("The updated array is");
       System.out.println(Arrays.toString(arr));
	}

	

}
