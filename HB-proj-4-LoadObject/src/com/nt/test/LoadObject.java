package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;
public class LoadObject {

	public static void main(String[] args) {
//To get Session Object
		Session ses=HibernateUtil.getSession();
		try {
	Actor actor=ses.get(Actor.class,1);
	//System.out.println(actor);
	if(actor==null) {
	System.out.println("Object is Not Found");
	}else {
		System.out.println("Object is Found");
	}
		}catch (HibernateException hb) {
	hb.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			//Close SessionFactory Object
			HibernateUtil.closeSessionFactoty();
			//Close Session Object
			HibernateUtil.closeSession(ses);
		}
	}

}
