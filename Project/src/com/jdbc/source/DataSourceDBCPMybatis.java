package com.jdbc.source;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSourceDBCPMybatis extends DataSource {

	private static DataSourceDBCPMybatis instance = new DataSourceDBCPMybatis();

	private DataSourceDBCPMybatis() {
	}

	public static DataSourceDBCPMybatis getInstance() {
		return instance;
	}

	private SqlSessionFactory factory;

	{ // instance initialize
		try {
			reader = Resources.getResourceAsReader("com/cms/slqConfig/mybatis-sqlConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error - Cause:" + e, e);

		}

	}

	public SqlSession getSqlSession() {
		SqlSession session = factory.openSession();
		return session;

	}
}