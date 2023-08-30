package com.pridebridge.threading;
import java.util.*;
import java.util.stream.Collectors;

public class Test6 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(0);
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		
		//List a2=a.stream().filter(i->i%2==0).collect(Collectors.toList());
		//List a2=a.stream().map(i->i+10).collect(Collectors.toList());
		List l=a.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		
	}

}
