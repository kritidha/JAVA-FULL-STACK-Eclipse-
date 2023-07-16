package com.thread;

public class MyThread extends Thread {

	public MyThread() {
		super();
		
	}
	MyThread(String name){
		super(name);
	}
	public  void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"i:"+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread("child2");
		
		System.out.println("mt1 Thread initial name and priority");
		System.out.println("mt1 name:"+mt1.getName());
		System.out.println("mt1 priority :"+mt1.getPriority());
		
			System.out.println();
			
			System.out.println("mt2 Thread initial name and priority");
			System.out.println("mt2 name:"+mt2.getName());
			System.out.println("mt2 priority :"+mt2.getPriority());
			mt1.setName("child1");
			
			mt1.setPriority(6);
			mt2.setPriority(9);
			
			System.out.println("mt1 Thread changed name and priority");
			System.out.println("mt1 name:"+mt1.getName());
			System.out.println("mt1 priority :"+mt1.getPriority());
			
			System.out.println();
			
			System.out.println("mt2 Thread changed name and priority");
			System.out.println("mt2 name:"+mt2.getName());
			System.out.println("mt2 priority :"+mt2.getPriority());
			
			mt1.start();
			mt2.start();
			
			for(int i=0;i<10;i++) {
				System.out.println("main i:"+i);
			}
				

	}

}
