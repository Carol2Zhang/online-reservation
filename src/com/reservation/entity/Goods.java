package com.reservation.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private Category category;
	private Shop shop;
	private String goodsName;
	private String goodsPicture;
	private String goodsPrice;
	private String goodsDescription;
	private Set commentses = new HashSet(0);
	private Set detailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(Category category, Shop shop, String goodsName,
			String goodsPicture, String goodsPrice, String goodsDescription,
			Set commentses, Set detailses) {
		this.category = category;
		this.shop = shop;
		this.goodsName = goodsName;
		this.goodsPicture = goodsPicture;
		this.goodsPrice = goodsPrice;
		this.goodsDescription = goodsDescription;
		this.commentses = commentses;
		this.detailses = detailses;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPicture() {
		return this.goodsPicture;
	}

	public void setGoodsPicture(String goodsPicture) {
		this.goodsPicture = goodsPicture;
	}

	public String getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsDescription() {
		return this.goodsDescription;
	}

	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}

	public Set getCommentses() {
		return this.commentses;
	}

	public void setCommentses(Set commentses) {
		this.commentses = commentses;
	}

	public Set getDetailses() {
		return this.detailses;
	}

	public void setDetailses(Set detailses) {
		this.detailses = detailses;
	}

}