package com.wipro.thread;

import java.util.Random;

public class ColorDisplay implements Runnable {
	private static final String[] colors = { "white", "blue", "black", "green", "red", "yellow" };
	private static final Random random = new Random();
	
	public void run() {
		int index;
		do {
			index = random.nextInt(colors.length);
			System.out.println(colors[index]);
		} while (!colors[index].equals("red"));
		System.out.println("Stopped displaying as 'red' colour is encountered!");
	}
	
	public static void main(String[] args) {
		ColorDisplay ob = new ColorDisplay();
		Thread t = new Thread(ob);
		t.start();
	}
}
