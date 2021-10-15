package com.api.employee.model;

public class Address {
	
	private String name;
	private String city;
	
	private String addressDetail;
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", city=" + city + ", addressDetail=" + addressDetail + "]";
	}
	public Address() {
		super();
		System.out.println("Addres Constructor");
	}
	

}
