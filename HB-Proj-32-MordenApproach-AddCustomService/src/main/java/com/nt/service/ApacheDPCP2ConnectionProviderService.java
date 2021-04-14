/**
 * 
 */
package com.nt.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import net.bytebuddy.asm.Advice.This;

public class ApacheDPCP2ConnectionProviderService implements ConnectionProvider {

	@Override
	public boolean isUnwrappableAs(Class unwrapType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> unwrapType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getConnection() throws SQLException {
BasicDataSource bds= new BasicDataSource();
System.out.println(bds.getClass().getSuperclass());
System.out.println(this.getClass().getSuperclass());
bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
bds.setUsername("scott");
bds.setPassword("tiger");
bds.setMinIdle(5);
bds.setMaxWaitMillis(20);
bds.setMaxTotal(20);
Connection con=bds.getConnection();
		return con;
	}

	@Override
	public void closeConnection(Connection conn) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean supportsAggressiveRelease() {
		// TODO Auto-generated method stub
		return false;
	}

}
