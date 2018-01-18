package com.reservation.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Shop entity. @author MyEclipse Persistence Tools
 */

public class Shop implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String shopName;
	private String shopAddress;
	private String shopDescription;
	private Set categories = new HashSet(0);
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Shop() {
	}

	/** full constructor */
	public Shop(String shopName, String shopAddress, String shopDescription,
			Set categories, Set goodses) {
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopDescription = shopDescription;
		this.categories = categories;
		this.goodses = goodses;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopDescription() {
		return this.shopDescription;
	}

	public void setShopDescription(String shopDescription) {
		this.shopDescription = shopDescription;
	}

	public Set getCategories() {
		return this.categories;
	}

	public void setCategories(Set categories) {
		this.categories = categories;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}