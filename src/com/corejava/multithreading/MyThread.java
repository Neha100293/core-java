package com.corejava.multithreading;

public class MyThread implements Runnable {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}
}
