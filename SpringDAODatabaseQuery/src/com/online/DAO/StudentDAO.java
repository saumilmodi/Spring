package com.online.DAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import com.online.Model.StudentSpring;

@Controller
public class StudentDAO {
	StudentSpring StudentSpring;
	private DataSource datasource=null;
	private JdbcTemplate jdbcTamplate=null;
	public DataSource getDatasource() {
		return datasource;
	}
	@Autowired
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		this.jdbcTamplate=new JdbcTemplate(datasource);
	}
	
	public int getCustomerCount()
	{
		String query="select count(*) from StudentSpring";
		return jdbcTamplate.queryForInt(query);
		
	}
	
}
