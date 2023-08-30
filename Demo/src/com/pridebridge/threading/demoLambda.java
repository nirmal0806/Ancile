package com.pridebridge.threading;

interface Demo1{
	void show();
}

public class demoLambda {
	public static void main(String[] args) {
		Demo1 d=(a,b)->{
			System.out.println("welcome");
		};
		d.show();
	}

}
