package com.api.employee.model;

public class Employee {
	
	private String name;
	private int age;
	private int id;
	
	private String employeeDetail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeDetail() {
		return employeeDetail;
	}
	public void setEmployeeDetail(String employeeDetail) {
		this.employeeDetail = employeeDetail;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + ", employeeDetail=" + employeeDetail + "]";
	}
	public Employee() {
		System.out.println("Employee Constructor");
	}
	

}
