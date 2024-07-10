package com.wipro;

public class EvenOdd {

	public static void main(String[] args) {
		Thread evenThread = new Thread(new EvenNumber());
		Thread oddThread = new Thread(new OddNumber());
		
		evenThread.start();
		try {
			evenThread.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		oddThread.start();
		try {
			oddThread.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class EvenNumber implements Runnable {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if ((i & 1) == 0)
				System.out.println("Even: " + i);
		}
	}
}

class OddNumber implements Runnable {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if ((i & 1) == 1)
				System.out.println("Odd: " + i);
		}
	}
}