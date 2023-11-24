package com.demo.stack;

public class MyStringStack {
	 private String[] arr;
	  private int top;
	  private int size;
	  public MyStringStack() {
		  arr=new String[10];
		  top=-1;
		  size=10;
	  }
	  public MyStringStack(int n) {
		  arr=new String[n];
		  size=n;
		  top=-1;
	  }
	  public boolean isEmpty() {
		  
		  return top==-1;
	  }
	  public boolean isFull() {
		  return top==size-1;
	  }
	  public boolean push(String name) {
		  if(isFull()) {
			  System.out.println("Stack is overFlow");
			  return false;
		  }
		  else {
			  top++;
			  arr[top]=name;
		  }
		  return true;
	  }
	  public String pop() {
		  if(isEmpty()) {
			  System.out.println("Stack is Underflow");
			  return"-1";
	     	  }
		       String name=arr[top];
		        top--;
		        return name;
	  }
}
