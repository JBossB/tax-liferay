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
import com.liferay.tax.exception.NoSuchItemShopBasketException;
import com.liferay.tax.model.ItemShopBasket;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the item shop basket service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jbaeza
 * @see ItemShopBasketUtil
 * @generated
 */
@ProviderType
public interface ItemShopBasketPersistence
	extends BasePersistence<ItemShopBasket> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ItemShopBasketUtil} to access the item shop basket persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the item shop basket in the entity cache if it is enabled.
	 *
	 * @param itemShopBasket the item shop basket
	 */
	public void cacheResult(ItemShopBasket itemShopBasket);

	/**
	 * Caches the item shop baskets in the entity cache if it is enabled.
	 *
	 * @param itemShopBaskets the item shop baskets
	 */
	public void cacheResult(java.util.List<ItemShopBasket> itemShopBaskets);

	/**
	 * Creates a new item shop basket with the primary key. Does not add the item shop basket to the database.
	 *
	 * @param itemShopBasketId the primary key for the new item shop basket
	 * @return the new item shop basket
	 */
	public ItemShopBasket create(long itemShopBasketId);

	/**
	 * Removes the item shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket that was removed
	 * @throws NoSuchItemShopBasketException if a item shop basket with the primary key could not be found
	 */
	public ItemShopBasket remove(long itemShopBasketId)
		throws NoSuchItemShopBasketException;

	public ItemShopBasket updateImpl(ItemShopBasket itemShopBasket);

	/**
	 * Returns the item shop basket with the primary key or throws a <code>NoSuchItemShopBasketException</code> if it could not be found.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket
	 * @throws NoSuchItemShopBasketException if a item shop basket with the primary key could not be found
	 */
	public ItemShopBasket findByPrimaryKey(long itemShopBasketId)
		throws NoSuchItemShopBasketException;

	/**
	 * Returns the item shop basket with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket, or <code>null</code> if a item shop basket with the primary key could not be found
	 */
	public ItemShopBasket fetchByPrimaryKey(long itemShopBasketId);

	/**
	 * Returns all the item shop baskets.
	 *
	 * @return the item shop baskets
	 */
	public java.util.List<ItemShopBasket> findAll();

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
	public java.util.List<ItemShopBasket> findAll(int start, int end);

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
	public java.util.List<ItemShopBasket> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemShopBasket>
			orderByComparator);

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
	public java.util.List<ItemShopBasket> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemShopBasket>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the item shop baskets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of item shop baskets.
	 *
	 * @return the number of item shop baskets
	 */
	public int countAll();

}