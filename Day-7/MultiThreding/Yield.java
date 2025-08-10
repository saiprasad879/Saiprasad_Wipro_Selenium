package day_7_assignment.multithreading;

// 5 Create a thread and use Thread.yield() to pause and give chance to another thread.

class YieldThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			Thread.yield(); 
		}
	}
}

public class YieldDemo {
	public static void main(String[] args) {
		YieldThread t1 = new YieldThread();
		YieldThread t2 = new YieldThread();

		t1.start();
		t2.start();
	}
}
