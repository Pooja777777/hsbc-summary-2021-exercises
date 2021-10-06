package com.demo.beans;

public class Account 
{
private long accountNumber;
private long balance;
private String ifcs;
public Account(long accountNumber, long balance, String ifcs) {
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.ifcs = ifcs;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}
public String getIfcs() {
	return ifcs;
}
public void setIfcs(String ifcs) {
	this.ifcs = ifcs;
}

@Override
public String toString() {
	return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", ifcs=" + ifcs + "]";
}

}
