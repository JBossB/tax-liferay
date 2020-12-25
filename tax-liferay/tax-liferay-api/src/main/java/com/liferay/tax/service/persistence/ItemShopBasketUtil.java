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

package com.liferay.tax.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.tax.model.ItemShopBasket;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the item shop basket service. This utility wraps <code>com.liferay.tax.service.persistence.impl.ItemShopBasketPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jbaeza
 * @see ItemShopBasketPersistence
 * @generated
 */
public class ItemShopBasketUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ItemShopBasket itemShopBasket) {
		getPersistence().clearCache(itemShopBasket);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ItemShopBasket> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ItemShopBasket> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ItemShopBasket> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ItemShopBasket> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ItemShopBasket> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ItemShopBasket update(ItemShopBasket itemShopBasket) {
		return getPersistence().update(itemShopBasket);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ItemShopBasket update(
		ItemShopBasket itemShopBasket, ServiceContext serviceContext) {

		return getPersistence().update(itemShopBasket, serviceContext);
	}

	/**
	 * Caches the item shop basket in the entity cache if it is enabled.
	 *
	 * @param itemShopBasket the item shop basket
	 */
	public static void cacheResult(ItemShopBasket itemShopBasket) {
		getPersistence().cacheResult(itemShopBasket);
	}

	/**
	 * Caches the item shop baskets in the entity cache if it is enabled.
	 *
	 * @param itemShopBaskets the item shop baskets
	 */
	public static void cacheResult(List<ItemShopBasket> itemShopBaskets) {
		getPersistence().cacheResult(itemShopBaskets);
	}

	/**
	 * Creates a new item shop basket with the primary key. Does not add the item shop basket to the database.
	 *
	 * @param itemShopBasketId the primary key for the new item shop basket
	 * @return the new item shop basket
	 */
	public static ItemShopBasket create(long itemShopBasketId) {
		return getPersistence().create(itemShopBasketId);
	}

	/**
	 * Removes the item shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket that was removed
	 * @throws NoSuchItemShopBasketException if a item shop basket with the primary key could not be found
	 */
	public static ItemShopBasket remove(long itemShopBasketId)
		throws com.liferay.tax.exception.NoSuchItemShopBasketException {

		return getPersistence().remove(itemShopBasketId);
	}

	public static ItemShopBasket updateImpl(ItemShopBasket itemShopBasket) {
		return getPersistence().updateImpl(itemShopBasket);
	}

	/**
	 * Returns the item shop basket with the primary key or throws a <code>NoSuchItemShopBasketException</code> if it could not be found.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket
	 * @throws NoSuchItemShopBasketException if a item shop basket with the primary key could not be found
	 */
	public static ItemShopBasket findByPrimaryKey(long itemShopBasketId)
		throws com.liferay.tax.exception.NoSuchItemShopBasketException {

		return getPersistence().findByPrimaryKey(itemShopBasketId);
	}

	/**
	 * Returns the item shop basket with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket, or <code>null</code> if a item shop basket with the primary key could not be found
	 */
	public static ItemShopBasket fetchByPrimaryKey(long itemShopBasketId) {
		return getPersistence().fetchByPrimaryKey(itemShopBasketId);
	}

	/**
	 * Returns all the item shop baskets.
	 *
	 * @return the item shop baskets
	 */
	public static List<ItemShopBasket> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the item shop baskets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item shop baskets
	 * @param end the upper bound of the range of item shop baskets (not inclusive)
	 * @return the range of item shop baskets
	 */
	public static List<ItemShopBasket> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the item shop baskets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item shop baskets
	 * @param end the upper bound of the range of item shop baskets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of item shop baskets
	 */
	public static List<ItemShopBasket> findAll(
		int start, int end,
		OrderByComparator<ItemShopBasket> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item shop baskets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item shop baskets
	 * @param end the upper bound of the range of item shop baskets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of item shop baskets
	 */
	public static List<ItemShopBasket> findAll(
		int start, int end, OrderByComparator<ItemShopBasket> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the item shop baskets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of item shop baskets.
	 *
	 * @return the number of item shop baskets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ItemShopBasketPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ItemShopBasketPersistence, ItemShopBasketPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			ItemShopBasketPersistence.class);

		ServiceTracker<ItemShopBasketPersistence, ItemShopBasketPersistence>
			serviceTracker =
				new ServiceTracker
					<ItemShopBasketPersistence, ItemShopBasketPersistence>(
						bundle.getBundleContext(),
						ItemShopBasketPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}