package com.thread;

public class Deamondemo implements Runnable{

	Thread th;
	
	Deamondemo(){
		th = new Thread(this);
		
		th.setDaemon(true);
		th.start();
		
		
	}

	public void run() {
		System.out.println("Run:"+th.isDaemon());
		
		for(int i=1;i<=100;i++)
		{
			System.out.println("Run: "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deamondemo dd1= new Deamondemo();
		System.out.println("Baba countdown starts");
		
		for(int i=1;i<=5;i++) {
			System.out.println("main: "+i);
		}

	}

}
