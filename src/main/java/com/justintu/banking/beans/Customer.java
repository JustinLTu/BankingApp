package com.justintu.banking.beans;

/**
 * Represents a bank customer's credentials and info. Holds their username, password, and
 * references to his or her accounts.
 * @author Justin Tu
 *
 */
import java.util.LinkedList;

public class Customer {
	/**
	 * Constant holding the Customer's username, for when the empty Customer() default 
	 * constructor is used.
	 */
	public static final String DEFAULT_USERNAME = "not_blank";
	
	/**
	 * Constant holding the Customer's password, for when the empty Customer() default 
	 * constructor is used.
	 */
	public static final String DEFAULT_PASSWORD = "password";
	
	private String username, password;
	private LinkedList<Account> accounts = new LinkedList<Account>();
	
	/**
	 * Creates a default Customer with username "not_blank" and password "password"
	 */
	public Customer() {
		this.username = DEFAULT_USERNAME;
		this.password = DEFAULT_PASSWORD;
	}
	
	/**
	 * Constructs a new customer from the given username, and password. Will not
	 * have an initial account attached to this Customer.
	 * @param username Given String username for this Customer
	 * @param password Given password to use for this Customer
	 */
	
	public Customer(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	/**
	 * Constructs a new customer from the given username, password, and inital 
	 * account.
	 * @param username Given String username for this Customer
	 * @param password Given password to use for this Customer
	 * @param account Given initial account to attach to this Customer
	 */
	public Customer(String username, String password, Account account) {
		this.username = username;
		this.password = password;
		this.accounts.add(account);
	}

	public LinkedList<Account> getAccounts() {
		return accounts;
	}

	/**
	 * Attempts to adds an Account to this Customer. If the customer already
	 * has the given account under him or her, then that account is not added
	 * and the method returns false.
	 * @param c Customer that the method attempts to add
	 * @return true if the Account is added, false otherwise
	 */
	public boolean addAccount(Account account) {
		if(accounts.indexOf(account) == -1) {
			this.accounts.add(account);
			return true;
		}
		return false;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
