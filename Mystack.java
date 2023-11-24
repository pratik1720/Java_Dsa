package com.demo.stack;

public class Mystack {
  private int[] arr;
  private int top;
  private int size;
  public Mystack() {
	  arr=new int[10];
	  top=-1;
	  size=10;
  }
  public Mystack(int n) {
	  arr=new int[n];
	  size=n;
	  top=-1;
  }
  public boolean isEmpty() {
	  
	  return top==-1;
  }
  public boolean isFull() {
	  return top==size-1;
  }
  public boolean push(int n) {
	  if(isFull()) {
		  System.out.println("Stack is overFlow");
		  return false;
	  }
	  else {
		  top++;
		  arr[top]=n;
	  }
	  return true;
  }
  public int pop() {
	  if(isEmpty()) {
		  System.out.println("Stack is Underflow");
		  return-1;
     	  }
	       int num=arr[top];
	        top--;
	        return num;
  }
}
