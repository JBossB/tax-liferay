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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.tax.service.http.ItemShopBasketServiceSoap}.
 *
 * @author jbaeza
 * @generated
 */
public class ItemShopBasketSoap implements Serializable {

	public static ItemShopBasketSoap toSoapModel(ItemShopBasket model) {
		ItemShopBasketSoap soapModel = new ItemShopBasketSoap();

		soapModel.setItemShopBasketId(model.getItemShopBasketId());
		soapModel.setShopBasketId(model.getShopBasketId());
		soapModel.setName(model.getName());
		soapModel.setIsImported(model.isIsImported());
		soapModel.setIsExempt(model.isIsExempt());
		soapModel.setPrice(model.getPrice());
		soapModel.setActive(model.isActive());
		soapModel.setAmount(model.getAmount());
		soapModel.setTax(model.getTax());
		soapModel.setTotal(model.getTotal());

		return soapModel;
	}

	public static ItemShopBasketSoap[] toSoapModels(ItemShopBasket[] models) {
		ItemShopBasketSoap[] soapModels = new ItemShopBasketSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ItemShopBasketSoap[][] toSoapModels(
		ItemShopBasket[][] models) {

		ItemShopBasketSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new ItemShopBasketSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ItemShopBasketSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ItemShopBasketSoap[] toSoapModels(
		List<ItemShopBasket> models) {

		List<ItemShopBasketSoap> soapModels = new ArrayList<ItemShopBasketSoap>(
			models.size());

		for (ItemShopBasket model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ItemShopBasketSoap[soapModels.size()]);
	}

	public ItemShopBasketSoap() {
	}

	public long getPrimaryKey() {
		return _itemShopBasketId;
	}

	public void setPrimaryKey(long pk) {
		setItemShopBasketId(pk);
	}

	public long getItemShopBasketId() {
		return _itemShopBasketId;
	}

	public void setItemShopBasketId(long itemShopBasketId) {
		_itemShopBasketId = itemShopBasketId;
	}

	public long getShopBasketId() {
		return _shopBasketId;
	}

	public void setShopBasketId(long shopBasketId) {
		_shopBasketId = shopBasketId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public boolean getIsImported() {
		return _isImported;
	}

	public boolean isIsImported() {
		return _isImported;
	}

	public void setIsImported(boolean isImported) {
		_isImported = isImported;
	}

	public boolean getIsExempt() {
		return _isExempt;
	}

	public boolean isIsExempt() {
		return _isExempt;
	}

	public void setIsExempt(boolean isExempt) {
		_isExempt = isExempt;
	}

	public Double getPrice() {
		return _price;
	}

	public void setPrice(Double price) {
		_price = price;
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

	public Double getAmount() {
		return _amount;
	}

	public void setAmount(Double amount) {
		_amount = amount;
	}

	public Double getTax() {
		return _tax;
	}

	public void setTax(Double tax) {
		_tax = tax;
	}

	public Double getTotal() {
		return _total;
	}

	public void setTotal(Double total) {
		_total = total;
	}

	private long _itemShopBasketId;
	private long _shopBasketId;
	private String _name;
	private boolean _isImported;
	private boolean _isExempt;
	private Double _price;
	private boolean _active;
	private Double _amount;
	private Double _tax;
	private Double _total;

}