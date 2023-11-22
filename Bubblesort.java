package com.demo.sorting;

import java.util.Arrays;

public class Bubblesort {
	public static void improvebubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					cnt++;
					flag=true;
					
				}
				
			}
			if(flag) {
				continue;
			}
			else {
				break;
			}
		}
		System.out.println(cnt);
	}
	public static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					cnt++;
				}
			}
		
		}
		System.out.println(cnt);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {23,13,44,1,22,66,32};
//       bubbleSort(arr);
//       System.out.println("Normal bubble sort");
//      System.out.println(Arrays.toString(arr));
      improvebubbleSort(arr);
      System.out.println("Improved bubble sort");
     System.out.println(Arrays.toString(arr));
      
	}

	

}
