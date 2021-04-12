package com.nt.genrator;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class RandomGenrator implements IdentifierGenerator {
public RandomGenrator() {
	System.out.println("RandomGenrator::0-param constructor");
}
	@Override
public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		System.out.println("RandomGenrator.generate()"); 
	Random rad=new Random();
	int idVal=rad.nextInt(10000);
		return new Long(idVal);
	}

}
