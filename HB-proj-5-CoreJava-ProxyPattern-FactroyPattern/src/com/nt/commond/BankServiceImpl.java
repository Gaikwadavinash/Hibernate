package com.nt.commond;

public class BankServiceImpl implements IBankService {

	@Override
	public String withdraw(Long accNo, double amount) {
	return amount + " amount withdraw from account " +accNo;
	}

}
