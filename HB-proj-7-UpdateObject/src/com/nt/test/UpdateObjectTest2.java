

package com.nt.test;

import java.util.Arrays;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;


public class UpdateObjectTest2 {
	public static void main(String[] args) {
	
//To get Session Object
		Session ses=HibernateUtil.getSession();
		//Load the Object
		Actor actor= ses.get(Actor.class,1);
		if(actor!=null) {
			System.out.println(actor);
			Transaction tx=null;
			boolean flag=false;
		
		try {
			//begin Transaction
			tx=ses.beginTransaction();
			//partial  obejct Modification
			//actor.setPhoneNo(98986559L);
	//	actor.setRemuneration(995644.0F);
actor.setActorName("sara");
actor.setActorAddress("Nai Mumbai");	
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
				System.out.println("Object is Not Updated");
			}
		}
		}
			else {
			System.out.println("Object/Record is Not Found and Updated ");
			//Close SessionFactory Object
			HibernateUtil.closeSessionFactoty();
			//Close Session Object
			HibernateUtil.closeSession(ses);
		}
			}
			
	}


