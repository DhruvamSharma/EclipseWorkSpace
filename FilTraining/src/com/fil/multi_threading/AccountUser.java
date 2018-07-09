package com.fil.multi_threading;

public class AccountUser extends Thread{
	
	Account account;

	public AccountUser(Account account) {
		super();
		this.account = account;
	}



	@Override
	public void run() {
		account.withdraw(500);
	}
	
}
