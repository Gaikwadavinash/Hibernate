package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.InsurancePolicy;
import com.nt.utility.HibernateUtil;

import javassist.bytecode.stackmap.BasicBlock.Catch;

public class myThread extends Thread {
	public void run() {
	Transaction tx=null;
	Session ses=HibernateUtil.getSession();
	try {
	tx=ses.beginTransaction();
	InsurancePolicy policy= new InsurancePolicy();
	policy.setPolicyName("Ja");
	policy.setCompany("Lic");
	policy.setTenure(5000.0f);
	long idVal=(Long)ses.save(policy);	
	System.out.println(idVal);
	tx.commit();
	}//end try
	catch(HibernateException hb){
		hb.printStackTrace();
	
	}catch (Exception e) {
	e.printStackTrace();
HibernateUtil.closeSession(ses);
HibernateUtil.closeSessionFactory();
	}
}
}
