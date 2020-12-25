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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.tax.constant.DefaultData;
import com.liferay.tax.constant.model.ItemTemp;
import com.liferay.tax.model.ItemShopBasket;
import com.liferay.tax.model.ShopBasket;
import com.liferay.tax.service.ItemShopBasketLocalServiceUtil;
import com.liferay.tax.service.ShopBasketLocalServiceUtil;
import com.liferay.tax.service.base.ItemShopBasketLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the item shop basket local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.tax.service.ItemShopBasketLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author jbaeza
 * @see ItemShopBasketLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.tax.model.ItemShopBasket",
	service = AopService.class
)
public class ItemShopBasketLocalServiceImpl
	extends ItemShopBasketLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.tax.service.ItemShopBasketLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.tax.service.ItemShopBasketLocalServiceUtil</code>.
	 */
	
	private Log log = LogFactoryUtil.getLog(this.getClass());
	
	public List<ItemShopBasket> getAll(String name, long shopBasketId){
		List<ItemShopBasket> list = null;
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(ItemShopBasket.class,classLoader);
			dq.add(RestrictionsFactoryUtil.eq("active", true));
			if(name.length() > 0) {
				dq.add(RestrictionsFactoryUtil.like("name", "%" + name + "%" ));
			}
			if(shopBasketId > 0) {
				dq.add(RestrictionsFactoryUtil.eq("shopBasketId", shopBasketId ));
			}
			
			dq.addOrder(OrderFactoryUtil.asc("itemShopBasketId"));
			
			list = ItemShopBasketLocalServiceUtil.dynamicQuery(dq);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<ItemShopBasket> getAllItemShopBasketActive(String name){
		List<ItemShopBasket> list = new ArrayList<ItemShopBasket>();
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			DynamicQuery dq = DynamicQueryFactoryUtil.forClass(ItemShopBasket.class,classLoader);
			dq.add(RestrictionsFactoryUtil.eq("active", true));
			if(name.length() > 0) {
				dq = dq.add(RestrictionsFactoryUtil.like("name", "%" + name + "%" ));
			}
			dq.addOrder(OrderFactoryUtil.asc("itemShopBasketId"));
			list = ItemShopBasketLocalServiceUtil.dynamicQuery(dq);
			
		} catch (Exception e) {
			list = new ArrayList<ItemShopBasket>();
			e.printStackTrace();
		}
		return list;
	}
	
	
	public void initDefaultData() {
		
		for(int j=1;j<4;j++) {
			ShopBasket sb= ShopBasketLocalServiceUtil.createShopBasket(j);
			sb.setActive(true);
			sb.setShopBasketId(Long.valueOf(j));
			sb = ShopBasketLocalServiceUtil.addShopBasket(sb);
		}
		
		
		List<ItemTemp> defaultDataList = DefaultData.getListAll();
		for(ItemTemp it:defaultDataList) {
			try {
				ItemShopBasket i = ItemShopBasketLocalServiceUtil.createItemShopBasket(0);
				i.setItemShopBasketId(it.getItemId());
				i.setShopBasketId(it.getShopBasketId());
				i.setName(it.getName());
				i.setPrice(it.getPrice());
				i.setAmount(it.getAmount());
				i.setIsImported(it.isImported());
				i.setIsExempt(it.isExempt());
				i.setActive(it.isActive());
				
				i = ItemShopBasketLocalServiceUtil.addItemShopBasket(i);
				
				log.info("Add item to table:"+i.toString());
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}