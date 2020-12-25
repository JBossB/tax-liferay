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
import com.liferay.tax.model.ShopBasket;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the shop basket service. This utility wraps <code>com.liferay.tax.service.persistence.impl.ShopBasketPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jbaeza
 * @see ShopBasketPersistence
 * @generated
 */
public class ShopBasketUtil {

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
	public static void clearCache(ShopBasket shopBasket) {
		getPersistence().clearCache(shopBasket);
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
	public static Map<Serializable, ShopBasket> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ShopBasket> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ShopBasket> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ShopBasket> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ShopBasket> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ShopBasket update(ShopBasket shopBasket) {
		return getPersistence().update(shopBasket);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ShopBasket update(
		ShopBasket shopBasket, ServiceContext serviceContext) {

		return getPersistence().update(shopBasket, serviceContext);
	}

	/**
	 * Returns all the shop baskets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching shop baskets
	 */
	public static List<ShopBasket> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the shop baskets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of shop baskets
	 * @param end the upper bound of the range of shop baskets (not inclusive)
	 * @return the range of matching shop baskets
	 */
	public static List<ShopBasket> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the shop baskets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of shop baskets
	 * @param end the upper bound of the range of shop baskets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shop baskets
	 */
	public static List<ShopBasket> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ShopBasket> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the shop baskets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of shop baskets
	 * @param end the upper bound of the range of shop baskets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching shop baskets
	 */
	public static List<ShopBasket> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ShopBasket> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shop basket
	 * @throws NoSuchShopBasketException if a matching shop basket could not be found
	 */
	public static ShopBasket findByUuid_First(
			String uuid, OrderByComparator<ShopBasket> orderByComparator)
		throws com.liferay.tax.exception.NoSuchShopBasketException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shop basket, or <code>null</code> if a matching shop basket could not be found
	 */
	public static ShopBasket fetchByUuid_First(
		String uuid, OrderByComparator<ShopBasket> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shop basket
	 * @throws NoSuchShopBasketException if a matching shop basket could not be found
	 */
	public static ShopBasket findByUuid_Last(
			String uuid, OrderByComparator<ShopBasket> orderByComparator)
		throws com.liferay.tax.exception.NoSuchShopBasketException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shop basket, or <code>null</code> if a matching shop basket could not be found
	 */
	public static ShopBasket fetchByUuid_Last(
		String uuid, OrderByComparator<ShopBasket> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the shop baskets before and after the current shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param shopBasketId the primary key of the current shop basket
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shop basket
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	public static ShopBasket[] findByUuid_PrevAndNext(
			long shopBasketId, String uuid,
			OrderByComparator<ShopBasket> orderByComparator)
		throws com.liferay.tax.exception.NoSuchShopBasketException {

		return getPersistence().findByUuid_PrevAndNext(
			shopBasketId, uuid, orderByComparator);
	}

	/**
	 * Removes all the shop baskets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of shop baskets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching shop baskets
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the shop basket in the entity cache if it is enabled.
	 *
	 * @param shopBasket the shop basket
	 */
	public static void cacheResult(ShopBasket shopBasket) {
		getPersistence().cacheResult(shopBasket);
	}

	/**
	 * Caches the shop baskets in the entity cache if it is enabled.
	 *
	 * @param shopBaskets the shop baskets
	 */
	public static void cacheResult(List<ShopBasket> shopBaskets) {
		getPersistence().cacheResult(shopBaskets);
	}

	/**
	 * Creates a new shop basket with the primary key. Does not add the shop basket to the database.
	 *
	 * @param shopBasketId the primary key for the new shop basket
	 * @return the new shop basket
	 */
	public static ShopBasket create(long shopBasketId) {
		return getPersistence().create(shopBasketId);
	}

	/**
	 * Removes the shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket that was removed
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	public static ShopBasket remove(long shopBasketId)
		throws com.liferay.tax.exception.NoSuchShopBasketException {

		return getPersistence().remove(shopBasketId);
	}

	public static ShopBasket updateImpl(ShopBasket shopBasket) {
		return getPersistence().updateImpl(shopBasket);
	}

	/**
	 * Returns the shop basket with the primary key or throws a <code>NoSuchShopBasketException</code> if it could not be found.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	public static ShopBasket findByPrimaryKey(long shopBasketId)
		throws com.liferay.tax.exception.NoSuchShopBasketException {

		return getPersistence().findByPrimaryKey(shopBasketId);
	}

	/**
	 * Returns the shop basket with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket, or <code>null</code> if a shop basket with the primary key could not be found
	 */
	public static ShopBasket fetchByPrimaryKey(long shopBasketId) {
		return getPersistence().fetchByPrimaryKey(shopBasketId);
	}

	/**
	 * Returns all the shop baskets.
	 *
	 * @return the shop baskets
	 */
	public static List<ShopBasket> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the shop baskets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shop baskets
	 * @param end the upper bound of the range of shop baskets (not inclusive)
	 * @return the range of shop baskets
	 */
	public static List<ShopBasket> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the shop baskets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shop baskets
	 * @param end the upper bound of the range of shop baskets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of shop baskets
	 */
	public static List<ShopBasket> findAll(
		int start, int end, OrderByComparator<ShopBasket> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the shop baskets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shop baskets
	 * @param end the upper bound of the range of shop baskets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of shop baskets
	 */
	public static List<ShopBasket> findAll(
		int start, int end, OrderByComparator<ShopBasket> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the shop baskets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of shop baskets.
	 *
	 * @return the number of shop baskets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ShopBasketPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ShopBasketPersistence, ShopBasketPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ShopBasketPersistence.class);

		ServiceTracker<ShopBasketPersistence, ShopBasketPersistence>
			serviceTracker =
				new ServiceTracker
					<ShopBasketPersistence, ShopBasketPersistence>(
						bundle.getBundleContext(), ShopBasketPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}