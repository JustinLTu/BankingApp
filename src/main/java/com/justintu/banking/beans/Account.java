package com.justintu.banking.beans;

import java.util.LinkedList;

/**
 * A bank account class. Keeps track of funds, and the customer(s) who have access to this account.
 * Allows for fund deposits, withdrawls, and transfers.
 *  
 * @author Justin Tu
 *
 */
public class Account {
	/**
	 * Represents that the account is still pending approval by a bank employee
	 */
	public static final int PENDING = 0; 
	
	/**
	 * Represents that the account is approved by a bank employee.
	 */
	public static final int APPROVED = 1;
	
	/**
	 * Represents that the account has been declined by a bank employee.
	 */
	public static final int DECLINED = -1;
	
	/**
	 * Represents that the account has been canceled by a bank admin
	 */
	public static final int CANCELED = -2;
	
	/**
	 * Represents whether the account is still pending approval, is approved, was
	 * declined, or was canceled.
	 */
	private int status;
	private long funds;
	private LinkedList<Customer> users = new LinkedList<Customer>();;
	
	
	/**
	 * Default constructor for account. Creates an account who's status is pending,
	 * has 0 funds, and has no customers attached to the account.
	 */
	public Account() {
		status = PENDING;
		funds = 0;
	}
	
	/**
	 * Constructor for account which takes in an initial amount of funds. 
	 * If this is called with a negative 
	 * amount of funds, then an IllegalArgumentException is thrown.
	 * @throws IllegalArgumentException If funds is a negative amount
	 * @param funds Initial amount of funds for this account
	 * @param customer Customer to be attache to this account
	 */
	public Account(long funds) throws IllegalArgumentException {
		if(funds > -1) {
			this.funds = funds;
			status = PENDING;
		} else {
			throw new IllegalArgumentException("Cannot initialize account with negative values. Was given " + funds);
		}
	}
	
	/**
	 * Constructor for account which takes in an initial amount of funds, and 
	 * an initial Customer for this account. If this is called with a negative 
	 * amount of funds, then an IllegalArgumentException is thrown.
	 * @throws IllegalArgumentException If funds is a negative amount
	 * @param funds Initial amount of funds for this account
	 * @param customer Customer to be attache to this account
	 */
	public Account(long funds, Customer customer) throws IllegalArgumentException {
		if(funds > -1) {
			this.funds = funds;
			status = PENDING;
			users.add(customer);
		} else {
			throw new IllegalArgumentException("Cannot initialize account with negative values. Was given " + funds);
		}
	}
	
	/**
	 * Constructor for account which takes in an initial amount of funds, and 
	 * an initial array of Customers for this account. If constructor is called 
	 * with a negative amount of funds, then an IllegalArgumentException is thrown.
	 * @throws IllegalArgumentException If funds is a negative amount
	 * @param funds Initial amount of funds for this account
	 * @param customers Array of Customers to be attached to this account
	 */
	public Account(long funds, Customer[] customers) throws IllegalArgumentException {
		if(funds > -1) {
			this.funds = funds;
			status = PENDING;
			users = new LinkedList<Customer>();
			for(Customer c: customers) {
				users.add(c);
			}
		} else {
			throw new IllegalArgumentException("Cannot initialize account with negative values. Was given " + funds);
		}
	}

	
	public int getStatus() {
		return status;
	}

	public long getFunds() {
		return funds;
	}

	public LinkedList<Customer> getUsers() {
		return users;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Attempts to withdraw the given amount of money from this Account.
	 * It will return true on a successful withdrawal from the Account.
	 * It will return false if amount is greater than the funds in this Account.
	 * If the amount is a negative value, then the method throws an 
	 * IllegalArgumentException.
	 * If the amount is greater than the total funds in the account, then
	 * nothing is withdrawn from the account and the method returns false.
	 * 
	 * @param amount how much money to withdraw from this account
	 * @throws IllegalArgumentException Thrown if amount is negative
	 * @return true if the amount is successfully withdrawn, false if amount
	 * 			exceeds the funds in this Account
	 * .
	 */
	public boolean withdraw(long amount) {
		if(amount < 0) {throw new IllegalArgumentException("Must withdraw a positive amount. Gave " + amount);}
		if(amount <= funds) {
			funds -= amount;
			return true;
		}
		return false;
	}
	
	/**
	 * Attempts to deposit the given amount of money into the Account. If the
	 * given amount is negative, then the method throws an IllegalArgumentException.
	 * 
	 * @param amount The amount of money to deposit
	 * @throws IllegalArgumentException Thrown if amount is negative
	 */
	public void deposit(long amount) {
		if(amount < 0) {throw new IllegalArgumentException("Must deposit a positive amount. Gave " + amount);}
		funds += amount;
	}
	
	/**
	 * Transfers money from this account in an other Account. Returns
	 * false if this account cannot transfer the funds. Returns true 
	 * upon a successful funds transfer. Throws an 
	 * @param amount
	 * @param other
	 * @return
	 */
	public boolean transfer(long amount, Account other) {
		
		return false;
	}
	
	/**
	 * Attempts to adds Customer to this account. If the account already
	 * has the given Customer under it, then that customer is not added
	 * and the method returns false.
	 * @param c Customer that the method attempts to add
	 * @return true if the Customer is added, false otherwise
	 */
	public boolean addCustomer(Customer c) {
		int i = users.indexOf(c);
		if(i == -1) {
			users.add(c);
			return true;
		} else {
			return false;
		}
	}
	
	
}
