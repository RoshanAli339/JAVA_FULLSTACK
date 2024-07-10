package com.wipro.thread;

public class ThreadsDemo implements Runnable{
	public void run() {
		System.out.println("Running a thread....");
	}
	public static void main(String[] args) {
		ThreadsDemo obj = new ThreadsDemo();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("Scooby");
		t2.setName("Shaggy");
		
		System.out.println("New name of thread1: " + t1);
		System.out.println("New name of thread2: " + t2);
		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
	}
}
