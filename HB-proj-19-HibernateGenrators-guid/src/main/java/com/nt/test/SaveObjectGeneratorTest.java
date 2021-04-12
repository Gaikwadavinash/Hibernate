
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
	try(SessionFactory factory=HibernateUtil.getSessionFactory()){
	try(Session ses=HibernateUtil.getSession()){  		
	//begin Transaction
		//for(int i=1;i<=10;++i) {
		     tx=ses.beginTransaction();
			//Save Object
			InsurancePolicy policy= new InsurancePolicy();
			policy.setPolicyName("lic");
			policy.setCompany("js++");
			policy.setTenure(1500.0f);
			String idVal=(String)ses.save(policy);	
				System.out.println(idVal);
//			 long idVal1=(long)ses.save(policy);	
			tx.commit();
//			System.out.println(idVal1);
			System.out.println(idVal);
	//	}

		
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



	


