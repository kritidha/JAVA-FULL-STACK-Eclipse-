package Ans9;

class ticket{
	private int tickets=3;
	public synchronized void book() {
		System.out.println("ticket left: "+tickets);
		tickets= tickets-2;
		if(tickets!=3 && tickets<1) {
			System.out.println("no more bookings");
			
		}
		while(tickets!=0) {
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
		}
		
		System.out.println("Tickets left:"+ tickets);
		notifyAll();
	}
}

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ticket tc= new ticket();
			Thread john= new Thread(()->{
				while(true) {
					tc.book();
				
					try {
						Thread.sleep(1000);
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
				});
			Thread Martin= new Thread(()->{
				while(true) {
					tc.book();
				
					try {
						Thread.sleep(1000);
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
				});
			john.start();
			System.out.println("john is booking");
			Martin.start();
	}

}
