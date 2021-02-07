package com.nt.test;

import java.util.Arrays;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;
public class SaveOrUpdateCase3 {
	public static void main(String[] args) {
	Transaction tx=null;
	boolean flag=false;
//To get Session Object
		Session ses=HibernateUtil.getSession();
		try {
			//begin Transaction
			tx=ses.beginTransaction();
			//Save Object
		Actor actor= new Actor();
		//actor.setActorId(30); Not set Is value,not maching unsigned value
//genrated genrated Id value		
		actor.setActorName("Alieana");
		actor.setActorAddress("Delhi");
		actor.setPhoneNo(89855899L);
		actor.setRemuneration(665586.0f);
         ses.saveOrUpdate(actor);;
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

