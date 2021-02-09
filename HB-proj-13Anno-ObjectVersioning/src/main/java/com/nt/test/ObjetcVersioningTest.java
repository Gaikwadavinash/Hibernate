package com.nt.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.nt.entity.CallerTune;
import com.nt.entity.CallerTuneAnno;
import com.nt.utility.HibernateUtil;

public class ObjetcVersioningTest {
	public static void main(String[] args) {
Transaction tx=null;		
try(SessionFactory factory=HibernateUtil.getSessionFactory()){
	try(Session ses=factory.openSession()){
tx=ses.beginTransaction();
//CallerTune tune= new CallerTune();
CallerTuneAnno tune= new CallerTuneAnno();
tune.setCallertuneName("Dil");
tune.setProvider("Jio");
tune.setMobileNo(8958566L);
int idval=(int)ses.save(tune);
tx.commit();
System.out.println("Genrated id value with Save Object:"+idval);
System.out.println("object Save");
System.out.println(tune);
	}//try2	Inner
}//try1Outer
catch (HibernateException hb) {

	hb.printStackTrace();
	tx.rollback();
	System.out.println("Object Not Saved");
}catch (Exception e) {

	e.printStackTrace();
	tx.rollback();
	System.out.println("Object Not Saved");
}
	}
}
