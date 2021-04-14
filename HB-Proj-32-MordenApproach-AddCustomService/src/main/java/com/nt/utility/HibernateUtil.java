package com.nt.utility;

import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import com.nt.service.ApacheDPCP2ConnectionProviderService;

import net.bytebuddy.asm.Advice.This;

public class HibernateUtil {
private static SessionFactory factory;
static {
	try {
	Configuration cfg= new Configuration();
	//craete registary Builder
	StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder();
	//add service registary to service registarty builder
	builder.addService(ConnectionProvider.class, new ApacheDPCP2ConnectionProviderService());
	
	//create registry
	StandardServiceRegistry registry=builder.configure("/com/nt/cfgs/hibernate.cfg.xml").build();
	
	//create Session Factory Object
	factory=cfg.buildSessionFactory(registry);
	}catch (Exception e) {
		e.printStackTrace();
	}	
}//end static block
public static Session getSession() {
	Session ses=null;
	if(factory!=null)
		ses=factory.openSession();
		return ses;
}

public static void closeSession(Session ses) {
	if(ses!=null)
	ses.close();
}
public static void closeSessionFactory() {
	if(factory!=null)
		factory.close();
}
}
