package com.nt.hibernateutil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
private static SessionFactory factory;
static {
	System.out.println("static block");
	try {
		// bootstrap the hibernate file
	Configuration cfg= new Configuration();
	//specify the location of hibernate cfg file
	cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
	factory=cfg.buildSessionFactory();
	}catch (HibernateException hb) {
	hb.printStackTrace();
	}//end catch block
}//end static block

//to create session object
public static Session getSession() {
	Session ses=null;
	if(factory!=null) 
	ses=factory.openSession();
	return ses;
}
//to closed session object
 public static void closeSession(Session ses) {
if(ses!=null)
	ses.close();
}
 //to closed factorySession object
 public static void closeSessionFactory() {
	 if(factory!=null)
		 factory.close();
 }
}//end class
