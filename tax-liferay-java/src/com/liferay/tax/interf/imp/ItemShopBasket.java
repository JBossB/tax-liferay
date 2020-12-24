package com.liferay.tax.interf.imp;

import com.liferay.tax.interf.IItemShopBasket;

public class ItemShopBasket implements IItemShopBasket{

	private long 	productId;
	private String 	name;
	private double 	price;
	private boolean isImported;
	private boolean isExempt;
	private int quantity;
	
	public ItemShopBasket() {
	}
	
	
	/**
	 * @param productId
	 * @param name
	 * @param price
	 * @param isImported
	 * @param isExempt
	 */
	public ItemShopBasket(long productId, int quantity, String name, boolean isImported, boolean isExempt,  Double price) {
		this.productId = productId;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		this.isImported=isImported;
		this.isExempt=isExempt;
	}

	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isImported() {
		return isImported;
	}
	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	public boolean isExempt() {
		return isExempt;
	}
	public void setExempt(boolean isExempt) {
		this.isExempt = isExempt;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public double getTotalPrice() {
		return this.price;
	}

	@Override
	public double getTax() {
		return 0;
	}
}
