package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ATMTest {
	private ATM atm;
	
	@Before
	public void setUp() throws Exception {
		atm = new ATM(10.0);
	}

	@After
	public void tearDown() throws Exception {
		atm = null;
	}

//	@Test
//	public void testATM() {		
//		double actual = atm.getBalance();
//		double expected = 0.0;
//		assertEquals(expected, actual, 0.0);
//	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testDeposit() {
		atm.deposit(-2.0);
		atm.deposit(5.0);
		double actual = atm.getBalance();
		double expected = 15.0;
		assertEquals(actual, expected, 0.0);
	}

	@Test
	public void testGetBalance() {
		double actual = atm.getBalance();
		double expected = 10.0;
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void testToString() {
		String expected = "Amount balance is $10.00";
		assertEquals(expected, atm.toString());
	}

	@Test (expected = IllegalArgumentException.class)
	public void testWithdraw() {
		atm.withdraw(200.0);
		atm.withdraw(5.0);
		double actual = atm.getBalance();
		double expected = 5.0;
		assertEquals(actual, expected, 0.0);
	}
	

}
