package com.natwest.encapsulation;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setBalance(100000);
		
		System.out.println(bank.getBalance());

	}

}
