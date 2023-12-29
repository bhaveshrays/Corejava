package in.co.rays.exception;

import javax.naming.InsufficientResourcesException;

public class Accounts {
	private int  balance;
	private String accountnumber;
	
	public Accounts() {
		System.out.println("Defauult Constructor");
	}
	
	public Accounts (int balance, String accountnumber) {
		this.balance= balance;
		this.accountnumber=accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	
public void deposite(int amount) {
	int total = getBalance()+amount;
	setBalance(total);
	System.out.println("After Deposit="+ getBalance());
}

public void withdrawl(int amount) throws InsufficientBalance{
	int total = getBalance()- amount;
	if (total<2000) {
		throw new  InsufficientBalance();
	}
	else {
		
		setBalance(total);
		System.out.println("after withdrawl = "+ getBalance());
	}
	}
	
}
