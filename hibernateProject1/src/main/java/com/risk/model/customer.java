package com.risk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CUSTOMER")
public class customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	
	@NotEmpty
	@Size(min=3, max=50)
	private String customerName;
	
	@NotEmpty
	private String cphone;
	
	@NotEmpty
	private  String mode;
	
	@NotEmpty
	private String paymentMethod;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public customer(Integer cid, String customerName, String cphone, String mode, String paymentMethod) {
		super();
		this.cid = cid;
		this.customerName = customerName;
		this.cphone = cphone;
		this.mode = mode;
		this.paymentMethod = paymentMethod;
	}
	public customer() {
		super();
	}

}
