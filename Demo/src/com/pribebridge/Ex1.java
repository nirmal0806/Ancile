package com.pribebridge;
class InvalidAuthenticationException extends Exception{
	public InvalidAuthenticationException(String message) {
		super(message);
	}
}
public class Ex1 {
	private void psvm() throws InvalidAuthenticationException {
		// TODO Auto-generated method stub
		String usernmae="root";
		String password="root";
		if(usernmae.equals("root") && password.equals("root")) {
			System.out.println("login is success");
		}
		else {
			throw new InvalidAuthenticationException("Eligible age for vote is above 18");
		}

	}

}
