package com.Mavan.HibernateExists;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class ucucbank {
	@Column
	@Id
	int accNo;
	@Column
	String name;
	@Column
	int balance;
	
	public ucucbank(int id, String name, int amt) {
		super();
		this.accNo = id;
		this.name = name;
		this.balance = amt;
	}
	
}
