package com.jdbc.source;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

public class DBCPDataSourceFactory extends UnpooledDataSourceFactory{
	
	public DBCPDataSourceFactory(){
		this.dataSource=new BasicDataSource();
	}

	
	
}
	