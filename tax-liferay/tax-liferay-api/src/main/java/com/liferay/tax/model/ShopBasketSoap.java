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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.tax.service.http.ShopBasketServiceSoap}.
 *
 * @author jbaeza
 * @generated
 */
public class ShopBasketSoap implements Serializable {

	public static ShopBasketSoap toSoapModel(ShopBasket model) {
		ShopBasketSoap soapModel = new ShopBasketSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setShopBasketId(model.getShopBasketId());
		soapModel.setActive(model.isActive());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static ShopBasketSoap[] toSoapModels(ShopBasket[] models) {
		ShopBasketSoap[] soapModels = new ShopBasketSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ShopBasketSoap[][] toSoapModels(ShopBasket[][] models) {
		ShopBasketSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ShopBasketSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ShopBasketSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ShopBasketSoap[] toSoapModels(List<ShopBasket> models) {
		List<ShopBasketSoap> soapModels = new ArrayList<ShopBasketSoap>(
			models.size());

		for (ShopBasket model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ShopBasketSoap[soapModels.size()]);
	}

	public ShopBasketSoap() {
	}

	public long getPrimaryKey() {
		return _shopBasketId;
	}

	public void setPrimaryKey(long pk) {
		setShopBasketId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getShopBasketId() {
		return _shopBasketId;
	}

	public void setShopBasketId(long shopBasketId) {
		_shopBasketId = shopBasketId;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private String _uuid;
	private long _shopBasketId;
	private boolean _active;
	private Date _createDate;

}