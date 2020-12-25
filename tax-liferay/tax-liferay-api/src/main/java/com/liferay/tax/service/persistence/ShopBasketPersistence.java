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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.tax.exception.NoSuchShopBasketException;
import com.liferay.tax.model.ShopBasket;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the shop basket service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jbaeza
 * @see ShopBasketUtil
 * @generated
 */
@ProviderType
public interface ShopBasketPersistence extends BasePersistence<ShopBasket> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ShopBasketUtil} to access the shop basket persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the shop baskets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching shop baskets
	 */
	public java.util.List<ShopBasket> findByUuid(String uuid);

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
	public java.util.List<ShopBasket> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ShopBasket> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShopBasket>
			orderByComparator);

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
	public java.util.List<ShopBasket> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShopBasket>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shop basket
	 * @throws NoSuchShopBasketException if a matching shop basket could not be found
	 */
	public ShopBasket findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ShopBasket>
				orderByComparator)
		throws NoSuchShopBasketException;

	/**
	 * Returns the first shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shop basket, or <code>null</code> if a matching shop basket could not be found
	 */
	public ShopBasket fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ShopBasket>
			orderByComparator);

	/**
	 * Returns the last shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shop basket
	 * @throws NoSuchShopBasketException if a matching shop basket could not be found
	 */
	public ShopBasket findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ShopBasket>
				orderByComparator)
		throws NoSuchShopBasketException;

	/**
	 * Returns the last shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shop basket, or <code>null</code> if a matching shop basket could not be found
	 */
	public ShopBasket fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ShopBasket>
			orderByComparator);

	/**
	 * Returns the shop baskets before and after the current shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param shopBasketId the primary key of the current shop basket
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shop basket
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	public ShopBasket[] findByUuid_PrevAndNext(
			long shopBasketId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ShopBasket>
				orderByComparator)
		throws NoSuchShopBasketException;

	/**
	 * Removes all the shop baskets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of shop baskets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching shop baskets
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the shop basket in the entity cache if it is enabled.
	 *
	 * @param shopBasket the shop basket
	 */
	public void cacheResult(ShopBasket shopBasket);

	/**
	 * Caches the shop baskets in the entity cache if it is enabled.
	 *
	 * @param shopBaskets the shop baskets
	 */
	public void cacheResult(java.util.List<ShopBasket> shopBaskets);

	/**
	 * Creates a new shop basket with the primary key. Does not add the shop basket to the database.
	 *
	 * @param shopBasketId the primary key for the new shop basket
	 * @return the new shop basket
	 */
	public ShopBasket create(long shopBasketId);

	/**
	 * Removes the shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket that was removed
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	public ShopBasket remove(long shopBasketId)
		throws NoSuchShopBasketException;

	public ShopBasket updateImpl(ShopBasket shopBasket);

	/**
	 * Returns the shop basket with the primary key or throws a <code>NoSuchShopBasketException</code> if it could not be found.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	public ShopBasket findByPrimaryKey(long shopBasketId)
		throws NoSuchShopBasketException;

	/**
	 * Returns the shop basket with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket, or <code>null</code> if a shop basket with the primary key could not be found
	 */
	public ShopBasket fetchByPrimaryKey(long shopBasketId);

	/**
	 * Returns all the shop baskets.
	 *
	 * @return the shop baskets
	 */
	public java.util.List<ShopBasket> findAll();

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
	public java.util.List<ShopBasket> findAll(int start, int end);

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
	public java.util.List<ShopBasket> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShopBasket>
			orderByComparator);

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
	public java.util.List<ShopBasket> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShopBasket>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the shop baskets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of shop baskets.
	 *
	 * @return the number of shop baskets
	 */
	public int countAll();

}