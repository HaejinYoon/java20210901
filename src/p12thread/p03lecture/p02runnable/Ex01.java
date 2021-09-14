package p12thread.p03lecture.p02runnable;

import java.awt.Toolkit;

public class Ex01 {
	public static void main(String[] args) {
		Runnable r1= new NumberThread();
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(new NumberThread());
		t2.start();
		
		Thread t3 = new Thread(new BeepThread());
		t3. start();
	}
}

class NumberThread implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class BeepThread implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5 ; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}