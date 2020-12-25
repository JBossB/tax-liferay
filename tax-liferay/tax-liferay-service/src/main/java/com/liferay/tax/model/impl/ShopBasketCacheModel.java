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
import com.liferay.tax.model.ShopBasket;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ShopBasket in entity cache.
 *
 * @author jbaeza
 * @generated
 */
public class ShopBasketCacheModel
	implements CacheModel<ShopBasket>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ShopBasketCacheModel)) {
			return false;
		}

		ShopBasketCacheModel shopBasketCacheModel =
			(ShopBasketCacheModel)object;

		if (shopBasketId == shopBasketCacheModel.shopBasketId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, shopBasketId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", shopBasketId=");
		sb.append(shopBasketId);
		sb.append(", active=");
		sb.append(active);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ShopBasket toEntityModel() {
		ShopBasketImpl shopBasketImpl = new ShopBasketImpl();

		if (uuid == null) {
			shopBasketImpl.setUuid("");
		}
		else {
			shopBasketImpl.setUuid(uuid);
		}

		shopBasketImpl.setShopBasketId(shopBasketId);
		shopBasketImpl.setActive(active);

		if (createDate == Long.MIN_VALUE) {
			shopBasketImpl.setCreateDate(null);
		}
		else {
			shopBasketImpl.setCreateDate(new Date(createDate));
		}

		shopBasketImpl.resetOriginalValues();

		return shopBasketImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		shopBasketId = objectInput.readLong();

		active = objectInput.readBoolean();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(shopBasketId);

		objectOutput.writeBoolean(active);
		objectOutput.writeLong(createDate);
	}

	public String uuid;
	public long shopBasketId;
	public boolean active;
	public long createDate;

}