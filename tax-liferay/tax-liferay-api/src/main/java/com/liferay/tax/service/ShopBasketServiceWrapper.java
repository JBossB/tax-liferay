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
 * Provides a wrapper for {@link ShopBasketService}.
 *
 * @author jbaeza
 * @see ShopBasketService
 * @generated
 */
public class ShopBasketServiceWrapper
	implements ServiceWrapper<ShopBasketService>, ShopBasketService {

	public ShopBasketServiceWrapper(ShopBasketService shopBasketService) {
		_shopBasketService = shopBasketService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _shopBasketService.getOSGiServiceIdentifier();
	}

	@Override
	public ShopBasketService getWrappedService() {
		return _shopBasketService;
	}

	@Override
	public void setWrappedService(ShopBasketService shopBasketService) {
		_shopBasketService = shopBasketService;
	}

	private ShopBasketService _shopBasketService;

}