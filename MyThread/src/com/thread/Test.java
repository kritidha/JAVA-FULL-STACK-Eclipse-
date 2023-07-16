package com.thread;

public class Test {

	public static void main(String args[]) {
		Add a= new Add(0, 0);
		
		new Thread1(a).start();
		new Thread2(a).start();
		
	}

}
