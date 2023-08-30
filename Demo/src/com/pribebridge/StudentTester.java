package com.pribebridge;

public class StudentTester {
	public static void main(String[] args) {
		Student s=new Student();//object creation or instance creation
		Student s1=new Student();//object  creation 
		s.setStdid(101);
		s.setStdname("ajay");
		s.setStdaddress("hyderbad");
	//	System.out.println(s.getStdid()+" "+s.getStdname()+" "+s.getStdaddress());
		System.out.println(s);
		
		System.out.println(s.hashCode());//it return address 
		System.out.println(s1.hashCode());
		
		System.out.println(s.equals(s1));
		
	}
}