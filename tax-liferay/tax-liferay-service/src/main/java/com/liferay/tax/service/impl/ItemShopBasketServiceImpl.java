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
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.tax.constant.EnumConstant;
import com.liferay.tax.model.ItemShopBasket;
import com.liferay.tax.service.ItemShopBasketLocalServiceUtil;
import com.liferay.tax.service.base.ItemShopBasketServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the item shop basket remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.tax.service.ItemShopBasketService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author jbaeza
 * @see ItemShopBasketServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=jb",
		"json.web.service.context.path=ItemShopBasket"
	},
	service = AopService.class
)
public class ItemShopBasketServiceImpl extends ItemShopBasketServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.tax.service.ItemShopBasketServiceUtil</code> to access the item shop basket remote service.
	 */
	
private Log log = LogFactoryUtil.getLog(this.getClass());
	
	@AccessControlled(guestAccessEnabled = true)
	public List<ItemShopBasket> getAll(String name, long shopBasketId){
		try {
			return ItemShopBasketLocalServiceUtil.getAll(name,shopBasketId);
		} catch (Exception e) {
		}
		return null;
	}
	@AccessControlled(guestAccessEnabled = true)
	public List<ItemShopBasket> getAllItemShopBasketActive(String name){
		return ItemShopBasketLocalServiceUtil.getAllItemShopBasketActive(name);
	}
}