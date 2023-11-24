package com.demo.stack;

public class TestMyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mystack m=new Mystack(5);
        System.out.println(m.isEmpty());
        System.out.println(m.isFull());
        m.push(12);
        m.push(23);
        m.push(54);
        m.push(323);
        m.push(45);
        System.out.println(m.isFull());
        for(int i=0;i<5;i++) {
        	System.out.println(m.pop());
        }
        
	}

}
