package p12thread.p03lecture.p03sync;

public class Ex01 {
	public static int value = 0;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					value++;
				}
			}
		});
		t.start();
		try {
			t.join();//t thread가 끝나길 기다림
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(value);
		System.out.println("프로그램 종료");
	}
}
