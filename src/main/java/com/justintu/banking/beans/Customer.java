package com.justintu.banking.beans;

/**
 * Represents a bank customer's credentials and info. Holds their username, password, and
 * references to his or her accounts.
 * @author Justin Tu
 *
 */
import java.util.LinkedList;

public class Customer {
	private String username, password;
	private LinkedList<Account> accounts;
	
}
