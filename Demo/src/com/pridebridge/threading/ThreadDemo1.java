package com.pridebridge.threading;

public class ThreadDemo1 implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is="+i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo1 t1=new ThreadDemo1();
		Thread t2=new Thread(t1);
		t2.start();
		
		for(int j=0;j<=10;j++) {
			System.out.println("j value is="+j);
		}
		
	}
}