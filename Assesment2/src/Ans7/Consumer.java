package Ans7;

public class Consumer implements Runnable{
	Factory fa;
	Consumer(Factory fa){
		this.fa= fa;
		new Thread(this,"Consumer").start();
	}
	public void run() {
		int i=1;
		
		while (i<=10) {
			fa.consume();
			i++;
		}
	}
}
