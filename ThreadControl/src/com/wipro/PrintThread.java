package com.wipro;

public class PrintThread implements Runnable{
	
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				if (i == 5) {
					Thread.sleep(5000);
				}
			}
		}
		catch (InterruptedException e) {
			System.out.println("Thread interrupted!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread ob = new PrintThread();
		Thread t = new Thread(ob);
		t.start();

	}

}
