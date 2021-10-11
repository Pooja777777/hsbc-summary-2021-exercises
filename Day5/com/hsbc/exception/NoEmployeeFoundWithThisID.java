package com.hsbc.exception;

@SuppressWarnings("serial")
public class NoEmployeeFoundWithThisID extends Exception{

	public NoEmployeeFoundWithThisID() {
		super();
		
	}

	public NoEmployeeFoundWithThisID(String message) {
		super(message);
		
	}

	
}
