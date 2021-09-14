package p12thread.p03lecture.p01thread;

public class Ex02 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		Thread t3 = new MyThread2();
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("Video thread launch");
	}
}

class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("Chatting thread launch");
	}
}