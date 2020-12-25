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

package com.liferay.tax.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ItemShopBasketService}.
 *
 * @author jbaeza
 * @see ItemShopBasketService
 * @generated
 */
public class ItemShopBasketServiceWrapper
	implements ItemShopBasketService, ServiceWrapper<ItemShopBasketService> {

	public ItemShopBasketServiceWrapper(
		ItemShopBasketService itemShopBasketService) {

		_itemShopBasketService = itemShopBasketService;
	}

	@Override
	public java.util.List<com.liferay.tax.model.ItemShopBasket> getAll(
		String name, long shopBasketId) {

		return _itemShopBasketService.getAll(name, shopBasketId);
	}

	@Override
	public java.util.List<com.liferay.tax.model.ItemShopBasket>
		getAllItemShopBasketActive(String name) {

		return _itemShopBasketService.getAllItemShopBasketActive(name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _itemShopBasketService.getOSGiServiceIdentifier();
	}

	@Override
	public ItemShopBasketService getWrappedService() {
		return _itemShopBasketService;
	}

	@Override
	public void setWrappedService(ItemShopBasketService itemShopBasketService) {
		_itemShopBasketService = itemShopBasketService;
	}

	private ItemShopBasketService _itemShopBasketService;

}