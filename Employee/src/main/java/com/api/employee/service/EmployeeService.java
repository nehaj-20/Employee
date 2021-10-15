package com.api.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.employee.dao.EmployeeDao;
import com.api.employee.model.Address;
import com.api.employee.model.Employee;


@Component
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeedao;
	
	public Employee getEmployeeDetail(int id) {
		return employeedao.getEmployeeDetail(id);
	}

	public void saveEmployee(Employee employee) {
		
		employee.setEmployeeDetail(employee.getName()+"-"+employee.getAge()+"-"+employee.getId());
		employeedao.saveEmployee(employee);
		
	}

	public void saveAddress(Address address) {
		address.setAddressDetail(address.getName()+"-"+address.getCity());
		employeedao.saveAddress(address);
		
	}

	public void deleteEmployee(int id) {
		employeedao.deleteEmpDetails(id);
		
	}



}
