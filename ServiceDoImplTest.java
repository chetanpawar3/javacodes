package com.service;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import com.model.AccountDoImpl;

public class ServiceDoImplTest {

	private static final String ACCOUNT_NO="1234";
	private ServiceDoImpl serviceDoImpl;
	@Before
	public void init() {
		serviceDoImpl=new ServiceDoImpl(new AccountDoImpl());
		
	}
	@Test
	public void createAccount()
	{
		serviceDoImpl.createAccount(ACCOUNT_NO);
	}
	
	@Test
	public void testDeposit() {
		serviceDoImpl.createAccount(ACCOUNT_NO);
		serviceDoImpl.deposit(ACCOUNT_NO, 50);
		serviceDoImpl.deposit(ACCOUNT_NO, 250);
		assertEquals(serviceDoImpl.getBalance(ACCOUNT_NO), 300);
	}
	


}
