package com.pridebridge.threading;

public class ThreadDemo extends Thread {

	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is "+i);
		}
		try {
			sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Thread.currentThread().setName("child thread");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		ThreadDemo t= new ThreadDemo();
		t.start();
		for(int j=0;j<=10;j++) {
			System.out.println("j value is "+j);
		}
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
	}
	
}
