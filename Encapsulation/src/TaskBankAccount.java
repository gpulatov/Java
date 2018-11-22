
public class TaskBankAccount {
	private int accountNumber;
	private double balance;
	private String name;
	private String email;
	private int phoneNum;
	
	
	
//	public TaskBankAccount(int accountNumber, double balance, String name, String email, int phoneNum) {
//		this.accountNumber = accountNumber;
//		this.balance = balance;
//		this.name = name;
//		this.email = email;
//		this.phoneNum = phoneNum;
//	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void deposit (double depAmount) {
		this.balance+=depAmount;
	}
	public void withdraw (double amount) {
		if(this.balance>=amount) {
		this.balance-=amount;
		System.out.println("You withdraw is $"+amount+" and new remaining balance is $"+this.balance);
		}else {
		System.out.println("Unsufficient fund: you can only withdraw"+this.balance);
		}
	}
	

}
