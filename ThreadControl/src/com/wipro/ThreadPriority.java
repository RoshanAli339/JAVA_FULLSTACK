package com.wipro;

public class ThreadPriority implements Runnable {
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" thread is running: " + i);
		}
	}

	public static void main(String[] args) {
		ThreadPriority ob = new ThreadPriority();
		Thread t1 = new Thread(ob, "First");
		Thread t2 = new Thread(ob, "Second");
		Thread t3 = new Thread(ob, "Third");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

}
