package Ans7;

public class Producer implements Runnable{
	Factory fa;
	
	Producer(Factory fa){
		this.fa= fa;
		new Thread(this,"Producer").start();
	}
	public void run() {
		int i=1;
		while(i<=10) {
			fa.produce(i++);
		}
	}
}
