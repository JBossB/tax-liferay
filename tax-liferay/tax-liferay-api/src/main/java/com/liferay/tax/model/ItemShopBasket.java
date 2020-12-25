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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ItemShopBasket service. Represents a row in the &quot;jb_ItemShopBasket&quot; database table, with each column mapped to a property of this class.
 *
 * @author jbaeza
 * @see ItemShopBasketModel
 * @generated
 */
@ImplementationClassName("com.liferay.tax.model.impl.ItemShopBasketImpl")
@ProviderType
public interface ItemShopBasket extends ItemShopBasketModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.tax.model.impl.ItemShopBasketImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ItemShopBasket, Long>
		ITEM_SHOP_BASKET_ID_ACCESSOR = new Accessor<ItemShopBasket, Long>() {

			@Override
			public Long get(ItemShopBasket itemShopBasket) {
				return itemShopBasket.getItemShopBasketId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ItemShopBasket> getTypeClass() {
				return ItemShopBasket.class;
			}

		};

}