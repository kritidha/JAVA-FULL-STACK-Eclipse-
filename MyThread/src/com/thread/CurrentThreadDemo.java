package com.thread;

public class CurrentThreadDemo {

	static {
		System.out.println("in SB");
		
		Thread th= Thread.currentThread();
		System.out.println("SB is executing in\""+th.getName()+"\"thread\n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nin main method");
		
		Thread th= Thread.currentThread();
		
		System.out.println("Original name and priority of main thread");
		System.out.println("Current thread name:"+th.getName());
		System.out.println("current Thread priority:"+th.getPriority());
		
		th.setName("xxty");
		th.setPriority(7);
		
		
		System.out.println("\nmodified name and priority of main thread");
		System.out.println("current thread name:"+th.getName());
		System.out.println("current thread priority: "+th.getPriority());
		
		
	}

}
