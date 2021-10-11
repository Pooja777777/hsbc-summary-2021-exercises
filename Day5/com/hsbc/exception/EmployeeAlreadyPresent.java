package com.hsbc.exception;

@SuppressWarnings("serial")
public class EmployeeAlreadyPresent extends Exception{

	public EmployeeAlreadyPresent() {
		super();
		
	}

	public EmployeeAlreadyPresent(String message) {
		super(message);
		
	}
	
	

}
