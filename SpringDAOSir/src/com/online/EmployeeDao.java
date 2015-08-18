package com.online;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

public class EmployeeDao {  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveEmployee(Employee e){  
    String query="insert into cus values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
    return jdbcTemplate.update(query);  
}  
public int updateEmployee(Employee e){  
    String query="update cus set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteEmployee(Employee e){  
    String query="delete from cus where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);     
}

public int selectEmployee(){  
    String query="select count(*) from cus";  
    return jdbcTemplate.queryForInt(query);     
}  

	public Employee getEmployee(int eno){
	String query = "select * from cus where id=?";
	return jdbcTemplate.queryForObject(query, new Object[]{eno}, new EmployeeMapper());
	}
	public List<Employee> getAllEmployees(){
		String query = "select * from cus";		
		return jdbcTemplate.query(query, new EmployeeMapper());
	}
    
	
	private static final class EmployeeMapper implements RowMapper<Employee>{
		@Override
		public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setId(resultSet.getInt("id"));
			employee.setName(resultSet.getString("name"));
			employee.setSalary(resultSet.getFloat("salary"));
			return employee;
		}
	}
	

  
}  