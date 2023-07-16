package com.thread;

public class JoinDemo  extends Thread{
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(getName()+":"+i);
			
			if(i==5 && getName().equals("Child2")) {
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					e.printStackTrace();
					
				}
			}
		}
	}

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("main is started");
		
		JoinDemo jd1 = new JoinDemo();
		jd1.setName("child1");
		jd1.start();
		
		JoinDemo jd2 = new JoinDemo();
		jd2.setName("child2");
		jd2.start();
		
		jd1.join();
		jd2.join();
		
		
		System.out.println("main is exited");
	}

}
