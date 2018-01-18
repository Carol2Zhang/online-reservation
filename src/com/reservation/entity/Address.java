package com.reservation.entity;

import java.math.BigDecimal;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Users users;
	private String address;

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** full constructor */
	public Address(Users users, String address) {
		this.users = users;
		this.address = address;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}