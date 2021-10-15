package com.api.employee.model;

public class EmployeeDetails {
	Employee employee;
	Address address;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employee=" + employee + ", address=" + address + "]";
	}

}
