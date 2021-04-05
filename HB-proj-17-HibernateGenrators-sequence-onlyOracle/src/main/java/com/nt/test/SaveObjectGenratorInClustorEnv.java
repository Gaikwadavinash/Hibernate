package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nt.entity.InsurancePolicy;
import com.nt.utility.HibernateUtil;

public class SaveObjectGenratorInClustorEnv {

	public static void main(String[] args) {
		Transaction tx=null;
		try(SessionFactory factory=HibernateUtil.getSessionFactory()){
		      try(Session ses=HibernateUtil.getSession()){
		    		//begin Transaction
		     tx=ses.beginTransaction();
			//Save Object
			InsurancePolicy policy= new InsurancePolicy();
		
			policy.setPolicyName("lic");
			policy.setCompany("lifeInsu");
			policy.setTenure(1500.0f);
			 long idVal=(long)ses.save(policy);	
		
			System.out.println(idVal);
			System.out.println(policy);
			System.out.println("simulteneously.....Run the application");
		Thread.sleep(40000);
		tx.commit();
System.out.println(idVal);
		}
		}catch (HibernateException hb) {
			hb.printStackTrace();
			tx.rollback();
		}
		catch (Exception e) {
		e.printStackTrace();
		tx.rollback();
		}
	}

}
