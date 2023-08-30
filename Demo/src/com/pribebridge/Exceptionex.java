package com.pribebridge;
import java.util.*;

class InvalidAgeException extends Exception{
	InvalidAgeException(){
		
	}
	InvalidAgeException(String message){
		super(message);
	}
}

public class Exceptionex {
	public static void main(String args[]) throws InvalidAgeException {
//		int a,b,c;
//		
//		try(Scanner sc=new Scanner(System.in);){
//			System.out.println("Enter a value");
//			a=sc.nextInt();
//			System.out.println("Enter b value");
//			b=sc.nextInt();
//		}
//		catch(ArithmeticException | InputMismatchException e) {
//			System.out.println(e);
//		}
//		finally{
//			System.out.println("finally block is created");
//			//sc.close();//close open resources in the finally block
//		}

		int age=17;
		if(age<=18) {
			throw new InvalidAgeException("yes you are not eligible to vote");
		}
		else {
			System.out.println("Eligible for vote");
		}
		
	}
	

}
