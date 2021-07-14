package com.natwest.encapsulation;

public class Bank  {

    private String name;
    private float balance;
    private long accountNum;
    
    public Bank() {
		super();
	}

	public float getBalance() {
        return this.balance;
    }

    public void setBalance(float newBalance) {
    	if(newBalance>=1000000) {
    		System.out.println("FRAUDDD");
    		return;
    	}
        this.balance = newBalance;
    }

}
