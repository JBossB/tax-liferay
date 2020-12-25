package com.liferay.tax.constant.model;

public class ItemTemp {

	private Long itemId;
	private Long shopBasketId;
	private String name;
	private boolean isImported;
	private boolean isExempt;
	private Double price;
	private boolean active;
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getShopBasketId() {
		return shopBasketId;
	}
	public void setShopBasketId(Long shopBasketId) {
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
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
	public ItemTemp(Long itemId, Long shopBasketId, String name, boolean isImported, boolean isExempt, Double price,
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
	
	
	
}
