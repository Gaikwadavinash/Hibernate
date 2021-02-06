package com.nt.test;

import java.util.Arrays;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.IActor;
import com.nt.utility.HibernateUtil;
public class LoadObject {

	public static void main(String[] args) {
//To get Session Object
		Session ses=HibernateUtil.getSession();
		try {
	IActor actor=ses.load(IActor.class,1);
	System.out.println(actor.getClass()+" "+actor.getClass().getSuperclass()+" "+Arrays.toString(actor.getClass().getInterfaces()));
//System.out.println(actor);
	//	if(actor==null) {
//	System.out.println("Object is Not Found");
//	}else {
//		System.out.println(actor);
//	}
		}catch (Exception e) {
		System.out.println("Object Not Found ");
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
