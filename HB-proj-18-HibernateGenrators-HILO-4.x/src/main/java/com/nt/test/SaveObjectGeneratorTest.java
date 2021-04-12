
package com.nt.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.nt.entity.InsurancePolicy;
import com.nt.utility.HibernateUtil;
public class SaveObjectGeneratorTest {
	public static void main(String[] args)  {
	Transaction tx=null;
	SessionFactory factory=HibernateUtil.getSessionFactory();
	Session ses=HibernateUtil.getSession();
	try {	    		
	//begin Transaction
		     tx=ses.beginTransaction();
			//Save Object
			InsurancePolicy policy= new InsurancePolicy();
			policy.setPolicyName("lic");
			policy.setCompany("js++");
			policy.setTenure(1500.0f);
			 long idVal=(long)ses.save(policy);	
			 long idVal1=(long)ses.save(policy);	
			tx.commit();
			System.out.println(idVal1);
			System.out.println(idVal);
	System.out.println(policy);
		
		}catch (HibernateException hb) {
			hb.printStackTrace();
			tx.rollback();
		}
		catch (Exception e) {
		e.printStackTrace();
		tx.rollback();
		}
	HibernateUtil.closeSessionFactory();
//	HibernateUtil.closeSession(ses);
		}
	}



	


