package binarySeach;

import java.util.Scanner;

public class FibonaciUsingRecursion {
      public static int fib(int no) {
    	  if(no==0) return 0;
    	  if(no==1) return 1;
    	  return fib(no-2)+fib(no-1);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the till u wnt to print fib serieds ");
	int n=sc.nextInt();
            for(int i=0;i<n;i++) {
            	System.out.println(fib(i));
            }
	}

}
