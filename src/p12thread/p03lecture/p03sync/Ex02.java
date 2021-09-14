package p12thread.p03lecture.p03sync;

public class Ex02 {
	public static int value=0;
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				for (int i=0;i<1000;i++) {
					value++;
					// 1. value read
					// 2. value increase
					// 3. value write
				}
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(value);
	}
}
