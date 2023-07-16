package Ans8;

public class AnonymousThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Thread() {
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println("run:"+i);
				}
			}
		}
		).start();
	}

}
