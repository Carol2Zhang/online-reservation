package com.reservation.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private String orderNumber;
	private Users users;
	private BigDecimal orderTotal;
	private Set detailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/** full constructor */
	public Orders(String orderNumber, Users users, BigDecimal orderTotal,
			Set detailses) {
		this.orderNumber = orderNumber;
		this.users = users;
		this.orderTotal = orderTotal;
		this.detailses = detailses;
	}

	// Property accessors

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public BigDecimal getOrderTotal() {
		return this.orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Set getDetailses() {
		return this.detailses;
	}

	public void setDetailses(Set detailses) {
		this.detailses = detailses;
	}

}