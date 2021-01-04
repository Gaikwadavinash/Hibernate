package com.nt.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.nt.entity.Actor;
public class SaveObjectTest {
	public static void main(String[] args) {
		
		//Bootstrap the hibernate(Activate the hibernate Framework)
	Configuration cfg= new Configuration();
	//specify the name and location of hibernate configuration file
	cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
	//create Sessionfactory object
	SessionFactory factory=cfg.buildSessionFactory();
	//creaste session object
	Session ses=factory.openSession();
	//create entity class object
	Actor act= new Actor();
	act.setActorId(115);
	act.setActorName("maven");
	act.setActorAddress("aus");
	act.setPhoneNo(77855225);
	act.setRemuneration(78788.0f);
	Transaction tx=null;
	boolean flag=false;
	try {
		tx=ses.beginTransaction();
	ses.save(act);
	flag=true;
	}
	catch (HibernateException hb) {
		hb.printStackTrace();
	}catch (Exception e) {
e.printStackTrace();
	}
	finally {
		if(flag) {
	tx.commit();
		System.out.println("Data Inserted ::SaveObjectTest is Recorded In DataBase Table ");
		}
		tx.rollback();
		System.out.println("Data Not Inserted ::SaveObjectTest is Recorded In DataBase Table ");

	}
	
	}

}
