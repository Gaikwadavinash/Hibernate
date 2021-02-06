package com.nt.test;

import com.nt.commond.BankServiceImpl;

import com.nt.commond.IBankService;
import com.nt.factory.BankServiceFactory;

public class BankCustomer1 {
	public static void main(String[] args) {
IBankService service=BankServiceFactory.getInstance(true);
System.out.println(service.withdraw(1001L, 20000));
System.out.println("........................");
IBankService service2=BankServiceFactory.getInstance(false);
System.out.println(service2.withdraw(1001L,20000));
	}
}
