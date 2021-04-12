package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nt.entity.Programmer_Project;
import com.nt.id.PrgmrProjId;
import com.nt.utility.HibernateUtil;

public class SaveObjectTest {

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
				Programmer_Project project = new Programmer_Project();
				project.setId(id);
				project.setPrgmrName("Raja");
				project.setAge(30);
				project.setProjName("openFx");
				project.setTeamSize(10);
             //save object
				PrgmrProjId idVal = (PrgmrProjId) ses.save(project);
				System.out.println("Genrated Id val" + idVal.toString());
				tx.commit();
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
