package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;
public class MergeObjectVersion2 {
	public static void main(String[] args) {
	Transaction tx=null;
	boolean flag=false;
//To get Session Object
		Session ses=HibernateUtil.getSession();
		try {
			//begin Transaction
			tx=ses.beginTransaction();
			//Load Object
			Actor actor= ses.get(Actor.class,1);
			if(actor!=null) {
				System.out.println(actor);
			}
			//update loaded object by creating new object having same id
		Actor actor1= new Actor();
		actor1.setActorId(1);//Must be Existing id
		actor1.setActorName("Radhika");
		actor1.setActorAddress("Mumbai");
		actor1.setPhoneNo(89966L);
		actor1.setRemuneration(61426.0f);
		//ses.update(actor1);// 1st Throws Exception 
		//org.hibernate.NonUniqueObjectException
		Actor actor2=(Actor)ses.merge(actor1);
		//2nd Call
		System.out.println(actor2);
         //ses.merge(actor);;
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

