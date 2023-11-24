package com.demo.stack;

import java.util.Scanner;

public class TestMyStringStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringStack m=new MyStringStack(5);
		 System.out.println(m.isEmpty());
	        System.out.println(m.isFull());
	        String s="";
	        Scanner sc =new Scanner(System.in);
	        for(int i=0;i<5;i++) {
	        	 System.out.println("Enter String that u want push");
	        	 s=sc.nextLine();
	        	 m.push(s);
	        }
	        System.out.println(m.isFull());
	        for(int i=0;i<5;i++) {
	        	 System.out.println("The element in the stack");
	        	
	        	 System.out.println(m.pop());
	        }
	}

}
