package com.demo.beans;

public class Current extends Account
{
String nomineeName;


public Current(long accountNumber, long balance, String ifcs, String nomineeName) {
	super(accountNumber, balance, ifcs);
	this.nomineeName = nomineeName;
}


@Override
public String toString() {
	return "In Current [nomineeName=" + nomineeName + " Data From Account= "+super.toString()+"]";
}

}
