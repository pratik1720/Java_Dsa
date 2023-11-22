package com.demo.sorting;

import java.util.Arrays;

public class MergeTwoSortedArr {
	public static int[] mergeTwoSorted(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
	    int i=0, j=0;
	    int k=0;
	    int[] arr3=new int[arr1.length+arr2.length];
	    while(i<arr1.length && j<arr2.length ) {
	    	if(arr1[i]<arr2[j]) {
	    		arr3[k]=arr1[i];
	    		i++;
	    		k++;
	    	}
	    	else {
	    		arr3[k]=arr2[j];
	    		j++;
	    		k++;
	    	}
	    }
	      while(i<arr1.length) {
	    	  arr3[k]=arr1[i];
	    		i++;
	    		k++; 
	      }
	      while(j<arr2.length) {
	    	  arr3[k]=arr2[j];
	    		j++;
	    		k++; 
	      }
	      return arr3;
	    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr1= {12,23,33,44,56,65,99,324};
      int[] arr2= {5,9,10,33,54,62,68,77,88,99,100,112};
      int[] arr3=mergeTwoSorted(arr1,arr2);
      System.out.println(Arrays.toString(arr3));
	}

	

}
