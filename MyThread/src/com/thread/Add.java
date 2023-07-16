package com.thread;

public class Add {

	
		int x,y;
		public Add(int x, int y) {
			this.x=x;
			this.y=y;
			try {
				Thread.sleep(1000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			int res= this.x+this.y;
			
			System.out.println("in"+ Thread.currentThread().getName()+"Result: "+res);
			
			
			// TODO Auto-generated constructor stub
		}

		// TODO Auto-generated constructor stub
		
		
	}


