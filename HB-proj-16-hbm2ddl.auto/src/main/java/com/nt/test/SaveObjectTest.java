package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;
public class SaveObjectTest {
	public static void main(String[] args) throws Throwable {
	Transaction tx=null;
	boolean flag=false;
//To get Session Object
		Session ses=HibernateUtil.getSession();
		Thread.sleep(30000);
		System.out.println("Session Object Created");
		try {
			//begin Transaction
			tx=ses.beginTransaction();
			//Save Object
		Actor actor= new Actor();
		actor.setActorId(49); //Not set Is value,not maching unsigned value
//genrated genrated Id value		
		actor.setActorName("Alieana");
		actor.setActorAddress("Delhi");
		actor.setPhoneNo(89855899L);
		actor.setRemuneration(665586.0f);
		//actor.setDesg("null");
         ses.save(actor);;
         flag=true;
	System.out.println(actor);
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
			System.out.println("Object is saved -- Object data is inserted to DB table as record");
			Thread.sleep(20000);
			}else { tx.rollback();
				System.out.println("Object is Not upadted");
			}
			//Close SessionFactory Object
			HibernateUtil.closeSessionFactory();
			//Close Session Object
			HibernateUtil.closeSession(ses);
		}
	}
}

