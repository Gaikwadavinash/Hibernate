package com.nt.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
private static SessionFactory factory;
static {
	try {
	//Bootstrap the hibernate
Configuration cfg= new Configuration();
cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
//Create Session Factory Object
factory=cfg.buildSessionFactory();
	
}catch(HibernateException e){
	e.printStackTrace();
}
}//end static block

//To craete a Session Object
public static Session getSession() {
Session ses=null;
if(factory!=null) 
	ses=factory.openSession();
	return ses ;	
}

//To close Session Object
public static  void closeSession(Session ses) {
	//Session ses= null;
if(ses!=null) {
	ses.close();
}
}
//To close Session Factory Object
public static void closeSessionFactoty() {
if(factory!=null) {	
factory.close();
}
}
}
