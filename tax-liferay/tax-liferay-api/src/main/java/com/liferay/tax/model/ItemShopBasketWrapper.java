/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.tax.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ItemShopBasket}.
 * </p>
 *
 * @author jbaeza
 * @see ItemShopBasket
 * @generated
 */
public class ItemShopBasketWrapper
	extends BaseModelWrapper<ItemShopBasket>
	implements ItemShopBasket, ModelWrapper<ItemShopBasket> {

	public ItemShopBasketWrapper(ItemShopBasket itemShopBasket) {
		super(itemShopBasket);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemShopBasketId", getItemShopBasketId());
		attributes.put("shopBasketId", getShopBasketId());
		attributes.put("name", getName());
		attributes.put("isImported", isIsImported());
		attributes.put("isExempt", isIsExempt());
		attributes.put("price", getPrice());
		attributes.put("active", isActive());
		attributes.put("amount", getAmount());
		attributes.put("tax", getTax());
		attributes.put("total", getTotal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemShopBasketId = (Long)attributes.get("itemShopBasketId");

		if (itemShopBasketId != null) {
			setItemShopBasketId(itemShopBasketId);
		}

		Long shopBasketId = (Long)attributes.get("shopBasketId");

		if (shopBasketId != null) {
			setShopBasketId(shopBasketId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Boolean isImported = (Boolean)attributes.get("isImported");

		if (isImported != null) {
			setIsImported(isImported);
		}

		Boolean isExempt = (Boolean)attributes.get("isExempt");

		if (isExempt != null) {
			setIsExempt(isExempt);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Long amount = (Long)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		Double tax = (Double)attributes.get("tax");

		if (tax != null) {
			setTax(tax);
		}

		Double total = (Double)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}
	}

	/**
	 * Returns the active of this item shop basket.
	 *
	 * @return the active of this item shop basket
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the amount of this item shop basket.
	 *
	 * @return the amount of this item shop basket
	 */
	@Override
	public long getAmount() {
		return model.getAmount();
	}

	/**
	 * Returns the is exempt of this item shop basket.
	 *
	 * @return the is exempt of this item shop basket
	 */
	@Override
	public boolean getIsExempt() {
		return model.getIsExempt();
	}

	/**
	 * Returns the is imported of this item shop basket.
	 *
	 * @return the is imported of this item shop basket
	 */
	@Override
	public boolean getIsImported() {
		return model.getIsImported();
	}

	/**
	 * Returns the item shop basket ID of this item shop basket.
	 *
	 * @return the item shop basket ID of this item shop basket
	 */
	@Override
	public long getItemShopBasketId() {
		return model.getItemShopBasketId();
	}

	/**
	 * Returns the name of this item shop basket.
	 *
	 * @return the name of this item shop basket
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the price of this item shop basket.
	 *
	 * @return the price of this item shop basket
	 */
	@Override
	public double getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this item shop basket.
	 *
	 * @return the primary key of this item shop basket
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the shop basket ID of this item shop basket.
	 *
	 * @return the shop basket ID of this item shop basket
	 */
	@Override
	public long getShopBasketId() {
		return model.getShopBasketId();
	}

	/**
	 * Returns the tax of this item shop basket.
	 *
	 * @return the tax of this item shop basket
	 */
	@Override
	public double getTax() {
		return model.getTax();
	}

	/**
	 * Returns the total of this item shop basket.
	 *
	 * @return the total of this item shop basket
	 */
	@Override
	public double getTotal() {
		return model.getTotal();
	}

	/**
	 * Returns <code>true</code> if this item shop basket is active.
	 *
	 * @return <code>true</code> if this item shop basket is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	/**
	 * Returns <code>true</code> if this item shop basket is is exempt.
	 *
	 * @return <code>true</code> if this item shop basket is is exempt; <code>false</code> otherwise
	 */
	@Override
	public boolean isIsExempt() {
		return model.isIsExempt();
	}

	/**
	 * Returns <code>true</code> if this item shop basket is is imported.
	 *
	 * @return <code>true</code> if this item shop basket is is imported; <code>false</code> otherwise
	 */
	@Override
	public boolean isIsImported() {
		return model.isIsImported();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this item shop basket is active.
	 *
	 * @param active the active of this item shop basket
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the amount of this item shop basket.
	 *
	 * @param amount the amount of this item shop basket
	 */
	@Override
	public void setAmount(long amount) {
		model.setAmount(amount);
	}

	/**
	 * Sets whether this item shop basket is is exempt.
	 *
	 * @param isExempt the is exempt of this item shop basket
	 */
	@Override
	public void setIsExempt(boolean isExempt) {
		model.setIsExempt(isExempt);
	}

	/**
	 * Sets whether this item shop basket is is imported.
	 *
	 * @param isImported the is imported of this item shop basket
	 */
	@Override
	public void setIsImported(boolean isImported) {
		model.setIsImported(isImported);
	}

	/**
	 * Sets the item shop basket ID of this item shop basket.
	 *
	 * @param itemShopBasketId the item shop basket ID of this item shop basket
	 */
	@Override
	public void setItemShopBasketId(long itemShopBasketId) {
		model.setItemShopBasketId(itemShopBasketId);
	}

	/**
	 * Sets the name of this item shop basket.
	 *
	 * @param name the name of this item shop basket
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the price of this item shop basket.
	 *
	 * @param price the price of this item shop basket
	 */
	@Override
	public void setPrice(double price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this item shop basket.
	 *
	 * @param primaryKey the primary key of this item shop basket
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the shop basket ID of this item shop basket.
	 *
	 * @param shopBasketId the shop basket ID of this item shop basket
	 */
	@Override
	public void setShopBasketId(long shopBasketId) {
		model.setShopBasketId(shopBasketId);
	}

	/**
	 * Sets the tax of this item shop basket.
	 *
	 * @param tax the tax of this item shop basket
	 */
	@Override
	public void setTax(double tax) {
		model.setTax(tax);
	}

	/**
	 * Sets the total of this item shop basket.
	 *
	 * @param total the total of this item shop basket
	 */
	@Override
	public void setTotal(double total) {
		model.setTotal(total);
	}

	@Override
	protected ItemShopBasketWrapper wrap(ItemShopBasket itemShopBasket) {
		return new ItemShopBasketWrapper(itemShopBasket);
	}

}