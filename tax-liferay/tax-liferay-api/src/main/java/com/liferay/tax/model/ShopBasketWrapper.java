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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ShopBasket}.
 * </p>
 *
 * @author jbaeza
 * @see ShopBasket
 * @generated
 */
public class ShopBasketWrapper
	extends BaseModelWrapper<ShopBasket>
	implements ModelWrapper<ShopBasket>, ShopBasket {

	public ShopBasketWrapper(ShopBasket shopBasket) {
		super(shopBasket);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("shopBasketId", getShopBasketId());
		attributes.put("active", isActive());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long shopBasketId = (Long)attributes.get("shopBasketId");

		if (shopBasketId != null) {
			setShopBasketId(shopBasketId);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	/**
	 * Returns the active of this shop basket.
	 *
	 * @return the active of this shop basket
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the create date of this shop basket.
	 *
	 * @return the create date of this shop basket
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the primary key of this shop basket.
	 *
	 * @return the primary key of this shop basket
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the shop basket ID of this shop basket.
	 *
	 * @return the shop basket ID of this shop basket
	 */
	@Override
	public long getShopBasketId() {
		return model.getShopBasketId();
	}

	/**
	 * Returns the uuid of this shop basket.
	 *
	 * @return the uuid of this shop basket
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this shop basket is active.
	 *
	 * @return <code>true</code> if this shop basket is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this shop basket is active.
	 *
	 * @param active the active of this shop basket
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the create date of this shop basket.
	 *
	 * @param createDate the create date of this shop basket
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the primary key of this shop basket.
	 *
	 * @param primaryKey the primary key of this shop basket
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the shop basket ID of this shop basket.
	 *
	 * @param shopBasketId the shop basket ID of this shop basket
	 */
	@Override
	public void setShopBasketId(long shopBasketId) {
		model.setShopBasketId(shopBasketId);
	}

	/**
	 * Sets the uuid of this shop basket.
	 *
	 * @param uuid the uuid of this shop basket
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected ShopBasketWrapper wrap(ShopBasket shopBasket) {
		return new ShopBasketWrapper(shopBasket);
	}

}