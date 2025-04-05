package com.itkoma.pojo;

public class Cust {

	private String custId;
	private String custName;
	private String phone;
	private String address;
	public Cust() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cust(String custId, String custName, String phone, String address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phone = phone;
		this.address = address;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Cust [custId=" + custId + ", custName=" + custName + ", phone=" + phone + ", address=" + address + "]";
	}
	
}
