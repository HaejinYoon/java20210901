package p12thread.p03lecture.p01thread;

import java.awt.Toolkit;

public class Ex03 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);// 1000 milli second 만큼 멈추기
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
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
