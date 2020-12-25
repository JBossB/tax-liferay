package com.liferay.tax.constant.model;

public class ItemTemp {

	private long itemId;
	private long shopBasketId;
	private long amount = 1L;
	private String name;
	private boolean isImported;
	private boolean isExempt;
	private double price;
	private boolean active;
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public long getShopBasketId() {
		return shopBasketId;
	}
	public void setShopBasketId(long shopBasketId) {
		this.shopBasketId = shopBasketId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isImported() {
		return isImported;
	}
	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isExempt() {
		return isExempt;
	}
	public void setExempt(boolean isExempt) {
		this.isExempt = isExempt;
	}
	
	/**
	 * @param itemId
	 * @param shopCartId
	 * @param name
	 * @param isImported
	 * @param isExempt
	 * @param price
	 * @param active
	 */
	public ItemTemp(long itemId, long shopBasketId, String name, boolean isImported, boolean isExempt, double price,
			boolean active) {
		super();
		this.itemId = itemId;
		this.shopBasketId = shopBasketId;
		this.name = name;
		this.isImported = isImported;
		this.isExempt = isExempt;
		this.price = price;
		this.active = active;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	
}
