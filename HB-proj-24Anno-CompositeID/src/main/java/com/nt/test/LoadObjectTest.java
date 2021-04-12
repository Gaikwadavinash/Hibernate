package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nt.entity.Programmer_Project;
import com.nt.id.PrgmrProjId;
import com.nt.utility.HibernateUtil;

public class LoadObjectTest {

	public static void main(String[] args) {
		Transaction tx = null;

		try (SessionFactory factory = HibernateUtil.getSessionFactory()) {
			try (Session ses = HibernateUtil.getSession()) {
				// begin transaction
				tx = ses.beginTransaction();
				// prepare object
				PrgmrProjId id = new PrgmrProjId();
				id.setPrgmrId(101);
				id.setProjId(1002);
				Programmer_Project project = ses.get(Programmer_Project.class,id);
		
				if(project==null) {
			System.out.println("Record is not Found");
			
		}else {
			System.out.println("record is found");
			System.out.println(project);
		}
             
			} // inner try
		} // outertry1
		catch (HibernateException hb) {
			if (tx != null || tx.getStatus() != null || tx.getRollbackOnly())
				tx.rollback();
			hb.printStackTrace();

		} catch (Exception e) {
			if (tx != null || tx.getStatus() != null || tx.getRollbackOnly())
				tx.rollback();
			e.printStackTrace();

		}
	}
}
