package com.thread;

public class ToStringDemo {

	public ToStringDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1= new Thread();
		System.out.println(th1);
		
		Thread th2= new Thread("child1");
		System.out.println(th2);
		
		Thread th3= new Thread("child1");
		System.out.println(th3);
		th3.setPriority(7);
		
		Thread th4= new Thread("child1");
		System.out.println(th4);
		
		
		

	}

}
