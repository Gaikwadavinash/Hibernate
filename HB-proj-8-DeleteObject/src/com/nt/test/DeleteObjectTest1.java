package com.nt.test;

import java.util.Arrays;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;
public class DeleteObjectTest1 {
	public static void main(String[] args) {
	
//To get Session Object
		Session ses=HibernateUtil.getSession();
		Actor actor= ses.get(Actor.class, 11);
		if(actor!=null) {
			Transaction tx=null;
			boolean flag=false;	
		try {

			//begin Transaction
			tx=ses.beginTransaction();
         ses.delete(actor);
         flag=true;
	//System.out.println(actor);
		}catch (HibernateException hb) {
	flag=false;
			hb.printStackTrace();
		}
		catch (Exception e) {
		flag=false;
		e.printStackTrace();
		}
		finally {
			if(flag) {
			tx.commit();
			System.out.println("Objetc is deleted");
			}else { tx.rollback();
				System.out.println("Object is Not deleted");
			}
		}
		}else {
			System.out.println("Record is Not Found");
		
			//Close SessionFactory Object
			HibernateUtil.closeSessionFactoty();
			//Close Session Object
			HibernateUtil.closeSession(ses);
		}
		}
	}


