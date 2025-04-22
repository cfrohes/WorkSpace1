package com.Maven.OneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String streets;
	@Column
	int pincode;
	public address(String streets, int pincode) {
		super();
		this.streets = streets;
		this.pincode = pincode;
	}
	public address() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreets() {
		return streets;
	}
	public void setStreets(String streets) {
		this.streets = streets;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "address [id=" + id + ", streets=" + streets + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
