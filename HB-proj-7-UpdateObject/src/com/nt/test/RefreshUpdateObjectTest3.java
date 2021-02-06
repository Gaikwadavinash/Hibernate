

package com.nt.test;

import java.util.Arrays;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nt.entity.Actor;
import com.nt.utility.HibernateUtil;


public class RefreshUpdateObjectTest3 {
	public static void main(String[] args) {
		
//To get Session Object
		Session ses=HibernateUtil.getSession();
		try {
		//Load the Object
		Actor actor= ses.get(Actor.class,1);
	System.out.println(actor);
	System.out.println("-------Refershing Data Display-------");
	Thread.sleep(40000);
	//During this time modify data
	ses.refresh(actor);
	System.out.println(actor);
		}catch (HibernateException hb) {

			hb.printStackTrace();
		}
		catch (Exception e) {
	
		e.printStackTrace();
		}
		finally {
			//Close SessionFactory Object
			HibernateUtil.closeSessionFactoty();
			//Close Session Object
			HibernateUtil.closeSession(ses);
		}
			}
			
	}


