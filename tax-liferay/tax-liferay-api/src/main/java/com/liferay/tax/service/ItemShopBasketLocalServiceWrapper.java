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
 * Provides a wrapper for {@link ItemShopBasketLocalService}.
 *
 * @author jbaeza
 * @see ItemShopBasketLocalService
 * @generated
 */
public class ItemShopBasketLocalServiceWrapper
	implements ItemShopBasketLocalService,
			   ServiceWrapper<ItemShopBasketLocalService> {

	public ItemShopBasketLocalServiceWrapper(
		ItemShopBasketLocalService itemShopBasketLocalService) {

		_itemShopBasketLocalService = itemShopBasketLocalService;
	}

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
	@Override
	public com.liferay.tax.model.ItemShopBasket addItemShopBasket(
		com.liferay.tax.model.ItemShopBasket itemShopBasket) {

		return _itemShopBasketLocalService.addItemShopBasket(itemShopBasket);
	}

	/**
	 * Creates a new item shop basket with the primary key. Does not add the item shop basket to the database.
	 *
	 * @param itemShopBasketId the primary key for the new item shop basket
	 * @return the new item shop basket
	 */
	@Override
	public com.liferay.tax.model.ItemShopBasket createItemShopBasket(
		long itemShopBasketId) {

		return _itemShopBasketLocalService.createItemShopBasket(
			itemShopBasketId);
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
	@Override
	public com.liferay.tax.model.ItemShopBasket deleteItemShopBasket(
		com.liferay.tax.model.ItemShopBasket itemShopBasket) {

		return _itemShopBasketLocalService.deleteItemShopBasket(itemShopBasket);
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
	@Override
	public com.liferay.tax.model.ItemShopBasket deleteItemShopBasket(
			long itemShopBasketId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemShopBasketLocalService.deleteItemShopBasket(
			itemShopBasketId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemShopBasketLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _itemShopBasketLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _itemShopBasketLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _itemShopBasketLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _itemShopBasketLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _itemShopBasketLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _itemShopBasketLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.tax.model.ItemShopBasket fetchItemShopBasket(
		long itemShopBasketId) {

		return _itemShopBasketLocalService.fetchItemShopBasket(
			itemShopBasketId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _itemShopBasketLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.liferay.tax.model.ItemShopBasket> getAll(
		String name, long shopBasketId) {

		return _itemShopBasketLocalService.getAll(name, shopBasketId);
	}

	@Override
	public java.util.List<com.liferay.tax.model.ItemShopBasket>
		getAllItemShopBasketActive(String name) {

		return _itemShopBasketLocalService.getAllItemShopBasketActive(name);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _itemShopBasketLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the item shop basket with the primary key.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket
	 * @throws PortalException if a item shop basket with the primary key could not be found
	 */
	@Override
	public com.liferay.tax.model.ItemShopBasket getItemShopBasket(
			long itemShopBasketId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemShopBasketLocalService.getItemShopBasket(itemShopBasketId);
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
	@Override
	public java.util.List<com.liferay.tax.model.ItemShopBasket>
		getItemShopBaskets(int start, int end) {

		return _itemShopBasketLocalService.getItemShopBaskets(start, end);
	}

	/**
	 * Returns the number of item shop baskets.
	 *
	 * @return the number of item shop baskets
	 */
	@Override
	public int getItemShopBasketsCount() {
		return _itemShopBasketLocalService.getItemShopBasketsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _itemShopBasketLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemShopBasketLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public void initDefaultData() {
		_itemShopBasketLocalService.initDefaultData();
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
	@Override
	public com.liferay.tax.model.ItemShopBasket updateItemShopBasket(
		com.liferay.tax.model.ItemShopBasket itemShopBasket) {

		return _itemShopBasketLocalService.updateItemShopBasket(itemShopBasket);
	}

	@Override
	public ItemShopBasketLocalService getWrappedService() {
		return _itemShopBasketLocalService;
	}

	@Override
	public void setWrappedService(
		ItemShopBasketLocalService itemShopBasketLocalService) {

		_itemShopBasketLocalService = itemShopBasketLocalService;
	}

	private ItemShopBasketLocalService _itemShopBasketLocalService;

}