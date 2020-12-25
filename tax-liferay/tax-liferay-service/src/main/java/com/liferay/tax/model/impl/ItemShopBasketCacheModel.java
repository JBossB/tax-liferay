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

package com.liferay.tax.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.tax.model.ItemShopBasket;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ItemShopBasket in entity cache.
 *
 * @author jbaeza
 * @generated
 */
public class ItemShopBasketCacheModel
	implements CacheModel<ItemShopBasket>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ItemShopBasketCacheModel)) {
			return false;
		}

		ItemShopBasketCacheModel itemShopBasketCacheModel =
			(ItemShopBasketCacheModel)object;

		if (itemShopBasketId == itemShopBasketCacheModel.itemShopBasketId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, itemShopBasketId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{itemShopBasketId=");
		sb.append(itemShopBasketId);
		sb.append(", shopBasketId=");
		sb.append(shopBasketId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", imported=");
		sb.append(imported);
		sb.append(", exempt=");
		sb.append(exempt);
		sb.append(", price=");
		sb.append(price);
		sb.append(", active=");
		sb.append(active);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", tax=");
		sb.append(tax);
		sb.append(", total=");
		sb.append(total);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ItemShopBasket toEntityModel() {
		ItemShopBasketImpl itemShopBasketImpl = new ItemShopBasketImpl();

		itemShopBasketImpl.setItemShopBasketId(itemShopBasketId);
		itemShopBasketImpl.setShopBasketId(shopBasketId);

		if (name == null) {
			itemShopBasketImpl.setName("");
		}
		else {
			itemShopBasketImpl.setName(name);
		}

		itemShopBasketImpl.setImported(imported);
		itemShopBasketImpl.setExempt(exempt);
		itemShopBasketImpl.setPrice(price);
		itemShopBasketImpl.setActive(active);
		itemShopBasketImpl.setAmount(amount);
		itemShopBasketImpl.setTax(tax);
		itemShopBasketImpl.setTotal(total);

		itemShopBasketImpl.resetOriginalValues();

		return itemShopBasketImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemShopBasketId = objectInput.readLong();

		shopBasketId = objectInput.readLong();
		name = objectInput.readUTF();

		imported = objectInput.readBoolean();

		exempt = objectInput.readBoolean();

		price = objectInput.readDouble();

		active = objectInput.readBoolean();

		amount = objectInput.readLong();

		tax = objectInput.readDouble();

		total = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(itemShopBasketId);

		objectOutput.writeLong(shopBasketId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeBoolean(imported);

		objectOutput.writeBoolean(exempt);

		objectOutput.writeDouble(price);

		objectOutput.writeBoolean(active);

		objectOutput.writeLong(amount);

		objectOutput.writeDouble(tax);

		objectOutput.writeDouble(total);
	}

	public long itemShopBasketId;
	public long shopBasketId;
	public String name;
	public boolean imported;
	public boolean exempt;
	public double price;
	public boolean active;
	public long amount;
	public double tax;
	public double total;

}