package com.fil.multi_threading;

public class BalanceUtils {
	
	public static int balance = 100000;

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		BalanceUtils.balance = balance;
	}
	
	public static void printBalance() {
		System.out.println(getBalance());
	}
	
	

}
