
package Ans8;

public class AnonymousRunnable {
	public static void main(String args[]) {
		(new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println("run:"+i);
				}
			}
		})).start();
	}

}
