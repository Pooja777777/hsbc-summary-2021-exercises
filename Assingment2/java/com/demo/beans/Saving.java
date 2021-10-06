package com.demo.beans;

public class Saving extends Account
{
private double dailyLimit;

public Saving(long accountNumber, long balance, String ifcs, double dailyLimit) {
	super(accountNumber, balance, ifcs);
	this.dailyLimit = dailyLimit;
}

public double getDailyLimit() {
	return dailyLimit;
}

public void setDailyLimit(double dailyLimit) {
	this.dailyLimit = dailyLimit;
}

@Override
public String toString() {
	return "Saving [dailyLimit=" + dailyLimit + " Data from Account =" +super.toString()+"]";
}

}
