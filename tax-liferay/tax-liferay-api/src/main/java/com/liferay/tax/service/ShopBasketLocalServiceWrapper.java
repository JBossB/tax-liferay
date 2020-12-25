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
 * Provides a wrapper for {@link ShopBasketLocalService}.
 *
 * @author jbaeza
 * @see ShopBasketLocalService
 * @generated
 */
public class ShopBasketLocalServiceWrapper
	implements ServiceWrapper<ShopBasketLocalService>, ShopBasketLocalService {

	public ShopBasketLocalServiceWrapper(
		ShopBasketLocalService shopBasketLocalService) {

		_shopBasketLocalService = shopBasketLocalService;
	}

	/**
	 * Adds the shop basket to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShopBasketLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shopBasket the shop basket
	 * @return the shop basket that was added
	 */
	@Override
	public com.liferay.tax.model.ShopBasket addShopBasket(
		com.liferay.tax.model.ShopBasket shopBasket) {

		return _shopBasketLocalService.addShopBasket(shopBasket);
	}

	/**
	 * Creates a new shop basket with the primary key. Does not add the shop basket to the database.
	 *
	 * @param shopBasketId the primary key for the new shop basket
	 * @return the new shop basket
	 */
	@Override
	public com.liferay.tax.model.ShopBasket createShopBasket(
		long shopBasketId) {

		return _shopBasketLocalService.createShopBasket(shopBasketId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shopBasketLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShopBasketLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket that was removed
	 * @throws PortalException if a shop basket with the primary key could not be found
	 */
	@Override
	public com.liferay.tax.model.ShopBasket deleteShopBasket(long shopBasketId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shopBasketLocalService.deleteShopBasket(shopBasketId);
	}

	/**
	 * Deletes the shop basket from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShopBasketLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shopBasket the shop basket
	 * @return the shop basket that was removed
	 */
	@Override
	public com.liferay.tax.model.ShopBasket deleteShopBasket(
		com.liferay.tax.model.ShopBasket shopBasket) {

		return _shopBasketLocalService.deleteShopBasket(shopBasket);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shopBasketLocalService.dynamicQuery();
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

		return _shopBasketLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.tax.model.impl.ShopBasketModelImpl</code>.
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

		return _shopBasketLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.tax.model.impl.ShopBasketModelImpl</code>.
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

		return _shopBasketLocalService.dynamicQuery(
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

		return _shopBasketLocalService.dynamicQueryCount(dynamicQuery);
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

		return _shopBasketLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.tax.model.ShopBasket fetchShopBasket(long shopBasketId) {
		return _shopBasketLocalService.fetchShopBasket(shopBasketId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _shopBasketLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _shopBasketLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _shopBasketLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shopBasketLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the shop basket with the primary key.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket
	 * @throws PortalException if a shop basket with the primary key could not be found
	 */
	@Override
	public com.liferay.tax.model.ShopBasket getShopBasket(long shopBasketId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shopBasketLocalService.getShopBasket(shopBasketId);
	}

	/**
	 * Returns a range of all the shop baskets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.tax.model.impl.ShopBasketModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shop baskets
	 * @param end the upper bound of the range of shop baskets (not inclusive)
	 * @return the range of shop baskets
	 */
	@Override
	public java.util.List<com.liferay.tax.model.ShopBasket> getShopBaskets(
		int start, int end) {

		return _shopBasketLocalService.getShopBaskets(start, end);
	}

	/**
	 * Returns the number of shop baskets.
	 *
	 * @return the number of shop baskets
	 */
	@Override
	public int getShopBasketsCount() {
		return _shopBasketLocalService.getShopBasketsCount();
	}

	/**
	 * Updates the shop basket in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShopBasketLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shopBasket the shop basket
	 * @return the shop basket that was updated
	 */
	@Override
	public com.liferay.tax.model.ShopBasket updateShopBasket(
		com.liferay.tax.model.ShopBasket shopBasket) {

		return _shopBasketLocalService.updateShopBasket(shopBasket);
	}

	@Override
	public ShopBasketLocalService getWrappedService() {
		return _shopBasketLocalService;
	}

	@Override
	public void setWrappedService(
		ShopBasketLocalService shopBasketLocalService) {

		_shopBasketLocalService = shopBasketLocalService;
	}

	private ShopBasketLocalService _shopBasketLocalService;

}