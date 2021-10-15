package com.api.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.api.employee.model.Address;
import com.api.employee.model.Employee;


@Repository
public class EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	

	public Employee getEmployeeDetail(int id) {
		
		String query = "SELECT *\n"
				+ "FROM employee\n"
				+ "INNER JOIN address\n"
				+ "ON employee.name = address.name WHERE id=?";
		
		Employee emp = jdbctemplate.queryForObject(query, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setName(rs.getString("name"));
				e.setAge(rs.getInt("age"));
				e.setId(id);
				return e;
			}
		}, id);
		return emp;
	}
	
	
	

	public void saveEmployee(Employee employee) {
		
		String sql1 = "insert into employee(name, age, id) values(?,?,?)";
		
		
		jdbctemplate.update(sql1,employee.getName(),employee.getAge(),employee.getId());
		

		
	}

	public void saveAddress(Address address) {
		String sql2 = "insert into address(name, city) values(?,?)";
		jdbctemplate.update(sql2,address.getName(),address.getCity());
	}

	public void deleteEmpDetails(int id ) {
		
		Employee emp1 = getEmployeeDetail(id);
		
		
		Address ad = new Address();
		ad.setName(emp1.getName());
		
		deleteAddress(ad);
		System.out.println("address is deleted");
		deleteEmployee(emp1);
	}
	
	public void deleteEmployee(Employee employee) {
		String sql = " delete from employee where id = ? ";
		jdbctemplate.update(sql,employee.getId());
		
	}
	public void deleteAddress(Address address) {
		String sql = " delete from address where name = ? ";
		jdbctemplate.update(sql,address.getName());
		
	}

}
