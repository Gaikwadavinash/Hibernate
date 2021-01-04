package com.nt.test;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nt.entity.Actor;
import com.nt.hibernateutil.HibernateUtil;

public class ActorClientApp {
	public static void main(String[] args) {
		System.out.println("main class");
		Session ses = HibernateUtil.getSession();
		System.out.println(ses.hashCode());
//craete entity class object
		Actor actor = new Actor();
		actor.setActorId(810);
		actor.setActorName("katrina");
		actor.setActorAddress("mumbai");;
		actor.setPhoneNo(887956545);
		actor.setRemuneration(884585.0F);
		Transaction tx = null;
		boolean flag = false;
		try {
			tx =ses.beginTransaction();
			int idVal = (int) ses.save(actor);
			System.out.println("Genarated Id value:" + idVal);
			flag = true;
		} catch (HibernateException hb) {
			flag = false;
			hb.printStackTrace();

		} catch (Exception e) {		
			flag = false;
			
			e.printStackTrace();

		} finally {
			if (flag) {
				tx.commit();
				System.out.println("Data Inserted SuccessFully..");
			} else {
				tx.rollback();
				System.out.println("Data Not Inserted SucessFully");
			}
		} // end of finally
//end closeSession() object
		HibernateUtil.closeSession(ses);
//end CloseSessionFactory() object
		HibernateUtil.closeSessionFactory();
	}
}