
package com.techment.relation;

class Customer
{
	int custId;
	String name;
	Account account;
	
	public Customer(int custId, String name, Account account) {
		super();
		this.custId = custId;
		this.name = name;
		this.account = account;
	}
	
	void details()
	{
		System.out.println("Customer ID: "+custId+"\nCustomer Name: "+name+"\nAccount: "+
				"\n\tAccount Number: "+account.accountNo+"\n\tAccount Type: "+account.accountType+"\n\tBalance: "+
				account.balance+"\n\tIFSC Code: "+account.ifsc+"\n\tBranch: "+account.branch);
	}
}

class Account
{
	int accountNo;
	String accountType;
	int balance;
	String ifsc;
	String branch;
	public Account(int accountNo, String accountType, int balance, String ifsc, String branch) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	
}
public class CustomerHasAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(3256789, "Savings", 20000, "SBIN0004678", "Civic Center");
		Customer customer = new Customer(2045, "Arpit", account);
		customer.details();
	}

}
