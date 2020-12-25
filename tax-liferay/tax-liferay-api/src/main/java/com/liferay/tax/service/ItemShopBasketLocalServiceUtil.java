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
 * Provides the local service utility for ItemShopBasket. This utility wraps
 * <code>com.liferay.tax.service.impl.ItemShopBasketLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author jbaeza
 * @see ItemShopBasketLocalService
 * @generated
 */
public class ItemShopBasketLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.tax.service.impl.ItemShopBasketLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the item shop basket to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemShopBasketLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param itemShopBasket the item shop basket
	 * @return the item shop basket that was added
	 */
	public static com.liferay.tax.model.ItemShopBasket addItemShopBasket(
		com.liferay.tax.model.ItemShopBasket itemShopBasket) {

		return getService().addItemShopBasket(itemShopBasket);
	}

	/**
	 * Creates a new item shop basket with the primary key. Does not add the item shop basket to the database.
	 *
	 * @param itemShopBasketId the primary key for the new item shop basket
	 * @return the new item shop basket
	 */
	public static com.liferay.tax.model.ItemShopBasket createItemShopBasket(
		long itemShopBasketId) {

		return getService().createItemShopBasket(itemShopBasketId);
	}

	/**
	 * Deletes the item shop basket from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemShopBasketLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param itemShopBasket the item shop basket
	 * @return the item shop basket that was removed
	 */
	public static com.liferay.tax.model.ItemShopBasket deleteItemShopBasket(
		com.liferay.tax.model.ItemShopBasket itemShopBasket) {

		return getService().deleteItemShopBasket(itemShopBasket);
	}

	/**
	 * Deletes the item shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemShopBasketLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket that was removed
	 * @throws PortalException if a item shop basket with the primary key could not be found
	 */
	public static com.liferay.tax.model.ItemShopBasket deleteItemShopBasket(
			long itemShopBasketId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteItemShopBasket(itemShopBasketId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.tax.model.impl.ItemShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.tax.model.impl.ItemShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.tax.model.ItemShopBasket fetchItemShopBasket(
		long itemShopBasketId) {

		return getService().fetchItemShopBasket(itemShopBasketId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<com.liferay.tax.model.ItemShopBasket> getAll(
		String name, long shopBasketId) {

		return getService().getAll(name, shopBasketId);
	}

	public static java.util.List<com.liferay.tax.model.ItemShopBasket>
		getAllItemShopBasketActive(String name) {

		return getService().getAllItemShopBasketActive(name);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the item shop basket with the primary key.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket
	 * @throws PortalException if a item shop basket with the primary key could not be found
	 */
	public static com.liferay.tax.model.ItemShopBasket getItemShopBasket(
			long itemShopBasketId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getItemShopBasket(itemShopBasketId);
	}

	/**
	 * Returns a range of all the item shop baskets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.tax.model.impl.ItemShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item shop baskets
	 * @param end the upper bound of the range of item shop baskets (not inclusive)
	 * @return the range of item shop baskets
	 */
	public static java.util.List<com.liferay.tax.model.ItemShopBasket>
		getItemShopBaskets(int start, int end) {

		return getService().getItemShopBaskets(start, end);
	}

	/**
	 * Returns the number of item shop baskets.
	 *
	 * @return the number of item shop baskets
	 */
	public static int getItemShopBasketsCount() {
		return getService().getItemShopBasketsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static void initDefaultData() {
		getService().initDefaultData();
	}

	/**
	 * Updates the item shop basket in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemShopBasketLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param itemShopBasket the item shop basket
	 * @return the item shop basket that was updated
	 */
	public static com.liferay.tax.model.ItemShopBasket updateItemShopBasket(
		com.liferay.tax.model.ItemShopBasket itemShopBasket) {

		return getService().updateItemShopBasket(itemShopBasket);
	}

	public static ItemShopBasketLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ItemShopBasketLocalService, ItemShopBasketLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			ItemShopBasketLocalService.class);

		ServiceTracker<ItemShopBasketLocalService, ItemShopBasketLocalService>
			serviceTracker =
				new ServiceTracker
					<ItemShopBasketLocalService, ItemShopBasketLocalService>(
						bundle.getBundleContext(),
						ItemShopBasketLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}