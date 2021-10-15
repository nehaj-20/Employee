package com.api.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.employee.model.Address;
import com.api.employee.model.Employee;
import com.api.employee.service.EmployeeService;
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeserive;
	
	
	@GetMapping(path="/getemplyeedetailbyid/{id}")
	public Employee getEmployeeDetail(@PathVariable("id") int id ) {
		
		System.out.println("HERE IS EMPLOYEE DETAIL"+ id);
		Employee e = employeeserive.getEmployeeDetail(id);
		System.out.println(e);
	
		return e;
	}
	
	@PostMapping(path="/createEmployee")
	public String createEmployee(@RequestBody Employee employee) {
		System.out.println("employee table created");
		employeeserive.saveEmployee(employee);
		return "response ok for employee";
		
	}
	
	@PostMapping(path="/createAddress")
	public String createAddress(@RequestBody Address address) {
		System.out.println("address table created");
		employeeserive.saveAddress(address);
		return "response ok for address ";
		
	}
	
	@DeleteMapping(path="/deleteEmpById/{id}")
	public String deteteEmpById(@PathVariable("id") int id) {
		
	
		employeeserive.deleteEmployee(id);
		return "information deleted";
		
	}

}
