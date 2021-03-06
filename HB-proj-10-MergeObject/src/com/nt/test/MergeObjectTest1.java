package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;
public class MergeObjectTest1 {
	public static void main(String[] args) {
	Transaction tx=null;
	boolean flag=false;
//To get Session Object
		Session ses=HibernateUtil.getSession();
		try {
			//begin Transaction
			tx=ses.beginTransaction();
		
		Actor actor= new Actor();
		actor.setActorId(1);//Must be Existing id
		actor.setActorName("Deepika");
		actor.setActorAddress("Delhi");
		actor.setPhoneNo(8989899L);
		actor.setRemuneration(66666.0f);
         //ses.merge(actor);
	
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
			System.out.println("Objetc is Updated");
			}else { tx.rollback();
				System.out.println("Object is Not upadted");
			}
			//Close SessionFactory Object
			HibernateUtil.closeSessionFactoty();
			//Close Session Object
			HibernateUtil.closeSession(ses);
		}
	}
}

