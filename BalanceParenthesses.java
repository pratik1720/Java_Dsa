package com.demo.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc =new Scanner(System.in);
	       System.out.println("Enter the parenthesses that u want to check");
	       String s=sc.nextLine();
	       int n=s.length();
       if(balance(n,s)) {
    	   System.out.println("The parenthesses is balance");
    	   
       }
       else {
    	   System.out.println("The parenthesses are imbalance");
       }
	}

	private static boolean balance(int n,String s) {
		// TODO Auto-generated method stub
		Stack<Character> my=new Stack<>();
		 for (int i=0;i<n;i++) {
			 
				 if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
					 my.push(s.charAt(i));
				 }	 
			 
				 else if (my.peek()=='(' &&s.charAt(i)==')' || my.peek()=='{' &&s.charAt(i)=='}' || my.peek()=='[' &&s.charAt(i)==']'){
				  my.pop();
			 }
			 
		 }
		 return my.isEmpty();
		 
		
	}

}
