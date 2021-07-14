package ClassDemo;

public class BankAccount {
	private String name;
	private int ID;
	private double balance;
	
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getID() {
		return ID;
	}
	private void setID(int iD) {
		ID = iD;
	}
	private double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(String name, int iD, double balance) {
		super();
		this.name = name;
		ID = iD;
		this.balance = balance;
	}
	public BankAccount() {
		super();
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", ID=" + ID + ", balance=" + balance + "]";
	}
	
	
	private Array List<BankAccount> accountList = new ArrayList<> ();
	
	private void deposit(double depositamount) {
		this.balance = balance + depositamount;
	}
	private void withdrawal(double withdrawamount) {
		if(withdrawamount>this.balance)
			System.out.println("unable to go over limit");
	}
	else {
		this.balance = balance - withdrawamount;
	}
	}

	
	

}
