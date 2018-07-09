package com.fil.multi_threading;

public class AcountDemo {

	public static void main(String ... args) throws InterruptedException {
		
		Account account = new Account(100000);
		
		
		AccountUser user1 = new AccountUser(account);
		AccountUser user2 = new AccountUser(account);
		
		
		user1.start();
		user2.start();
		
		user1.join();
		user2.join();
		
		System.out.println(account.getBalance());
	}
}
