package com.demo.test;

import java.util.Arrays;

public class HeapSort {
	
	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
        for(int i=(n/2)-1;i>=0;i--) {
        	heapify(arr,i,n);
        }
        System.out.println(Arrays.toString(arr));
        for(int i=n-1;i>=0;i--) {
        	int temp =arr[0];
        	arr[0]=arr[i];
        	arr[i]=temp;
        	heapify(arr,0,i);
        	 System.out.println("size " +i);
        	 System.out.println(Arrays.toString(arr));
        }
	}
	private static void heapify(int[] arr, int i, int n) {
		// TODO Auto-generated method stub
		   int largest=i;
		   int l=2*i+1;
		   int r=2*i+2;
		   if(l<n && arr[l]>arr[largest]) {
			   largest=l;
		   }
		   if(r<n && arr[r]>arr[largest]) {
			   largest=r;
		   }
		   if(largest!=i) {
			   int temp=arr[i];
			   arr[i]=arr[largest];
			   arr[largest]=temp;
			   heapify(arr,largest,n);
		   }
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {26,6,34,12,342,1,55,8};
        System.out.println("The original Array");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("The After Sorting Array");
        System.out.println(Arrays.toString(arr));
        
	}

	

}
