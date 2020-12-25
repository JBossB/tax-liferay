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

package com.liferay.tax.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.tax.service.base.ShopBasketServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the shop basket remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.tax.service.ShopBasketService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author jbaeza
 * @see ShopBasketServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=jb",
		"json.web.service.context.path=ShopBasket"
	},
	service = AopService.class
)
public class ShopBasketServiceImpl extends ShopBasketServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.tax.service.ShopBasketServiceUtil</code> to access the shop basket remote service.
	 */
	
}