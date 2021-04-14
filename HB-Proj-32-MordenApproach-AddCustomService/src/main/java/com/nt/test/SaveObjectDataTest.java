package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;

import net.bytebuddy.asm.Advice.This;

public class SaveObjectDataTest {

	public static void main(String[] args) {
		Transaction tx=null;
	Session ses=HibernateUtil.getSession();
	try {
		tx=ses.beginTransaction();
	Actor actor= new Actor();
	actor.setName("ramu");
	actor.setAddr("Mumbai");
	actor.setPhoneNo(899L);
	actor.setStatus("married");
	actor.setSal(895699.0f);
	int idVal=(int)ses.save(actor);
	tx.commit();
		System.out.println(idVal);
	
		System.out.println(actor);
	}catch (HibernateException hb) {
		hb.printStackTrace();
	}
	}

}
