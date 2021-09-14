package p12thread.p03lecture.p02runnable;

import java.awt.Toolkit;

public class Ex04 {
	// skip!!!!! 안봐도됨!!!!
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Thread t1 = new Thread(new Runnable() {

					@Override
					public void run() {
						Toolkit toolkit = Toolkit.getDefaultToolkit();

						for (int i = 0; i < 5; i++) {
							toolkit.beep();
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				});
				t1.start();

				for (int i = 0; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();
	}
}