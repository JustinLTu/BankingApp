package com.justintu.banking.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.justintu.banking.beans.*;
public class BankingTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDefaultCustomer() {
		//Customer c = new Customer();
		/*
		 * Create a new customer with default constructor
		 * Get default customer parameters (Name, password, account)
		 * Set new customer parameters (Name, password) //Don't allow customer to approve or deny accounts
		 * Get customer parameters (Name, password)
		 */
	}
	
	@Test 
	public void testDefaultAccount() {
		/*
		 * Create a new account with default constructor
		 * Get default account parameters (Funds, Customers that use this account, approval status)
		 * Test account functions (Withdraw, deposit, transfer, approve, deny)
		 * Test modified account values
		 */
	}
	
	@Test
	public void testDefaultEmployee() {
		/*
		 * Create a new employee with default constructor
		 * Get default employee parameters (name, password access level?)
		 * 
		 */
	}
}
