package binarySeach;

import java.util.Scanner;

public class TestBinary {
	public static int binarySearchRecursion(int left, int right, int[] arr, int search) {
		// TODO Auto-generated method stub
		if(left>right) {
			return -1;
		}
		else {
			
				int mid=(left+right)/2;
				if(arr[mid]==search) {
					return mid;
				}
				else if(arr[mid]<search) {
					return binarySearchRecursion(mid+1,right,arr,search);
				}
				else {
					return binarySearchRecursion(left,mid-1,arr,search);
				}
			
			
		}
	}
	public static int binarySearchcom(int[] arr,int search) {
		int left=0;
		int cnt=0;
		int right=arr.length-1;
		int mid=(left+right)/2;
		while(left<=right) {
			cnt++;
			mid=(left+right)/2;
			if(arr[mid]==search) {
				return cnt;
			}
			else if(arr[mid]<search) {
				left=mid+1;
				
			}
			else {
				right=mid-1;
			}
		}
		return cnt;
	}
	public static int binarySearch(int[] arr,int search) {
		int left=0;
		int right=arr.length-1;
		int mid=(left+right)/2;
		while(left<=right) {
			mid=(left+right)/2;
			if(arr[mid]==search) {
				return mid;
			}
			else if(arr[mid]<search) {
				left=mid+1;
				
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of an array");
         int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++) {
        	 System.out.println("Enter the "+(i+1)+" element");
        	arr[i]=sc.nextInt();
         }
         System.out.println("Enter the element that u want to search in array");
         int search=sc.nextInt();
//         int i=binarySearch(arr,search);
//         int cnt=binarySearchcom(arr,search);
//         if(i!=-1) {
//        	 System.out.println(i); 
//         }
//         else {
//        	 System.out.println("Number is not found"); 
//         }
         
//         System.out.println("The number of comparison "+cnt); 
         int in=binarySearchRecursion(0,arr.length-1,arr,search);
         if(in!=-1) {
        	 System.out.println(in); 
         }
         else {
        	 System.out.println("Number is not found"); 
         }
	}
	

	

}
