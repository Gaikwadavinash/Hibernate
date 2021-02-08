package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nt.entity.InsurancePolicy;
import com.nt.utility.HibernateUtil;

public class SaveObjectTest {

	public static void main(String[] args) {
		Transaction tx=null;
	try(SessionFactory factory=HibernateUtil.geSessionFactory()){
	try (Session ses=HibernateUtil.getSession()){
	tx=ses.beginTransaction();
	InsurancePolicy policy= new InsurancePolicy();
	policy.setPolicyId(900L);
	policy.setPolicyName("JA");
	policy.setCompany("SBI");
	policy.setTenure(5000.0f);
	Long idval=(long)ses.save(policy);
		tx.commit();
		System.out.println("Object Save with Genrated Id value:"+idval);
		System.out.println(policy);
	}//try2
	}//try1
catch (HibernateException hb) {
	
	tx.rollback();
	hb.printStackTrace();
	System.out.println("Object Not Saved");
}catch (Exception e) {
tx.rollback();
e.printStackTrace();
System.out.println("Object Not Saved");
}
}//class
	}//main
