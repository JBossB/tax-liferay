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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for ItemShopBasket. This utility wraps
 * <code>com.liferay.tax.service.impl.ItemShopBasketServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author jbaeza
 * @see ItemShopBasketService
 * @generated
 */
public class ItemShopBasketServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.tax.service.impl.ItemShopBasketServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static java.util.List<com.liferay.tax.model.ItemShopBasket> getAll(
		String name, long shopBasketId) {

		return getService().getAll(name, shopBasketId);
	}

	public static java.util.List<com.liferay.tax.model.ItemShopBasket>
		getAllItemShopBasketActive(String name) {

		return getService().getAllItemShopBasketActive(name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static ItemShopBasketService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ItemShopBasketService, ItemShopBasketService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ItemShopBasketService.class);

		ServiceTracker<ItemShopBasketService, ItemShopBasketService>
			serviceTracker =
				new ServiceTracker
					<ItemShopBasketService, ItemShopBasketService>(
						bundle.getBundleContext(), ItemShopBasketService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}