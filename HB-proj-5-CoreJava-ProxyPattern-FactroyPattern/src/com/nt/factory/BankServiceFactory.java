package com.nt.factory;

import com.nt.commond.BankServiceImpl;
import com.nt.commond.IBankService;
import com.nt.proxy.BankServiceProxy;
public class BankServiceFactory {
public static IBankService getInstance(Boolean demonizization) {
	IBankService service=null;
	if(demonizization) {
//Proxy Object
		service= new BankServiceProxy();
		System.out.println(service.getClass().getSuperclass()+" "+service.getClass()+" "+service.hashCode());
	}else {
		//real Object
		service=new BankServiceImpl();
		
		System.out.println(service.getClass().getSuperclass()+" "+service.getClass()+" "+service.hashCode());
	}
	return service;
}
}
