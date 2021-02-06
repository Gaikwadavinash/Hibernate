package com.nt.proxy;

import com.nt.commond.BankServiceImpl;
import com.nt.commond.IBankService;

public class BankServiceProxy implements IBankService {
	private IBankService real;
	public BankServiceProxy() {
		real = new BankServiceImpl();
	}
	@Override
	public String withdraw(Long accNo, double amount) {
		if(amount<4000) 
			return real.withdraw(accNo, amount);
		else 	
		return real.withdraw(accNo, 4000);
	
		}

}
