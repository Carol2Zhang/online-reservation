package com.reservation.entity;

import java.math.BigDecimal;

/**
 * Details entity. @author MyEclipse Persistence Tools
 */

public class Details implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Goods goods;
	private Orders orders;

	// Constructors

	/** default constructor */
	public Details() {
	}

	/** full constructor */
	public Details(Goods goods, Orders orders) {
		this.goods = goods;
		this.orders = orders;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

}