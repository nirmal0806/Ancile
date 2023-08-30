package com.pridebridge.threading;


@FunctionalInterface
public interface functionalInterface {
	 abstract void m1();
	 }

interface third extends functionalInterface{
	void m2();
	
}

class Test {

	public void m1() {
		// TODO Auto-generated method stub
		functionalInterface fi=()->{
			System.out.println("this is m1 method");
		};
		fi.m1();
		
	}
	
}
