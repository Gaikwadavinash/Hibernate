package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;

public class SaveObjectDataTest {

	public static void main(String[] args) {
		Transaction tx=null;
	Session ses=HibernateUtil.getSession();
	try {
		tx=ses.beginTransaction();
	Actor actor= new Actor();
	actor.setName("raja");
	actor.setAddr("Mumbai");
	actor.setPhoneNo(89899L);
	actor.setStatus("Unmarried");
	actor.setSal(89999.0f);
	int idVal=(int)ses.save(actor);
	tx.commit();
		System.out.println(idVal);
		System.out.println(actor);
	}catch (HibernateException hb) {
		hb.printStackTrace();
	}
	}

}
