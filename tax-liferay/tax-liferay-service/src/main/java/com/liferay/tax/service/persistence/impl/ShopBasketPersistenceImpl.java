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

package com.liferay.tax.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.tax.exception.NoSuchShopBasketException;
import com.liferay.tax.model.ShopBasket;
import com.liferay.tax.model.impl.ShopBasketImpl;
import com.liferay.tax.model.impl.ShopBasketModelImpl;
import com.liferay.tax.service.persistence.ShopBasketPersistence;
import com.liferay.tax.service.persistence.impl.constants.jbPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the shop basket service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jbaeza
 * @generated
 */
@Component(service = ShopBasketPersistence.class)
public class ShopBasketPersistenceImpl
	extends BasePersistenceImpl<ShopBasket> implements ShopBasketPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ShopBasketUtil</code> to access the shop basket persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ShopBasketImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the shop baskets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching shop baskets
	 */
	@Override
	public List<ShopBasket> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ShopBasket> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<ShopBasket> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ShopBasket> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<ShopBasket> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ShopBasket> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<ShopBasket> list = null;

		if (useFinderCache) {
			list = (List<ShopBasket>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ShopBasket shopBasket : list) {
					if (!uuid.equals(shopBasket.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_SHOPBASKET_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ShopBasketModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<ShopBasket>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shop basket
	 * @throws NoSuchShopBasketException if a matching shop basket could not be found
	 */
	@Override
	public ShopBasket findByUuid_First(
			String uuid, OrderByComparator<ShopBasket> orderByComparator)
		throws NoSuchShopBasketException {

		ShopBasket shopBasket = fetchByUuid_First(uuid, orderByComparator);

		if (shopBasket != null) {
			return shopBasket;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchShopBasketException(sb.toString());
	}

	/**
	 * Returns the first shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shop basket, or <code>null</code> if a matching shop basket could not be found
	 */
	@Override
	public ShopBasket fetchByUuid_First(
		String uuid, OrderByComparator<ShopBasket> orderByComparator) {

		List<ShopBasket> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shop basket
	 * @throws NoSuchShopBasketException if a matching shop basket could not be found
	 */
	@Override
	public ShopBasket findByUuid_Last(
			String uuid, OrderByComparator<ShopBasket> orderByComparator)
		throws NoSuchShopBasketException {

		ShopBasket shopBasket = fetchByUuid_Last(uuid, orderByComparator);

		if (shopBasket != null) {
			return shopBasket;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchShopBasketException(sb.toString());
	}

	/**
	 * Returns the last shop basket in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shop basket, or <code>null</code> if a matching shop basket could not be found
	 */
	@Override
	public ShopBasket fetchByUuid_Last(
		String uuid, OrderByComparator<ShopBasket> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ShopBasket> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ShopBasket[] findByUuid_PrevAndNext(
			long shopBasketId, String uuid,
			OrderByComparator<ShopBasket> orderByComparator)
		throws NoSuchShopBasketException {

		uuid = Objects.toString(uuid, "");

		ShopBasket shopBasket = findByPrimaryKey(shopBasketId);

		Session session = null;

		try {
			session = openSession();

			ShopBasket[] array = new ShopBasketImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, shopBasket, uuid, orderByComparator, true);

			array[1] = shopBasket;

			array[2] = getByUuid_PrevAndNext(
				session, shopBasket, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ShopBasket getByUuid_PrevAndNext(
		Session session, ShopBasket shopBasket, String uuid,
		OrderByComparator<ShopBasket> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SHOPBASKET_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ShopBasketModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(shopBasket)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ShopBasket> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shop baskets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ShopBasket shopBasket :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(shopBasket);
		}
	}

	/**
	 * Returns the number of shop baskets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching shop baskets
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SHOPBASKET_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"shopBasket.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(shopBasket.uuid IS NULL OR shopBasket.uuid = '')";

	public ShopBasketPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("active", "active_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ShopBasket.class);

		setModelImplClass(ShopBasketImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the shop basket in the entity cache if it is enabled.
	 *
	 * @param shopBasket the shop basket
	 */
	@Override
	public void cacheResult(ShopBasket shopBasket) {
		entityCache.putResult(
			entityCacheEnabled, ShopBasketImpl.class,
			shopBasket.getPrimaryKey(), shopBasket);

		shopBasket.resetOriginalValues();
	}

	/**
	 * Caches the shop baskets in the entity cache if it is enabled.
	 *
	 * @param shopBaskets the shop baskets
	 */
	@Override
	public void cacheResult(List<ShopBasket> shopBaskets) {
		for (ShopBasket shopBasket : shopBaskets) {
			if (entityCache.getResult(
					entityCacheEnabled, ShopBasketImpl.class,
					shopBasket.getPrimaryKey()) == null) {

				cacheResult(shopBasket);
			}
			else {
				shopBasket.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all shop baskets.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ShopBasketImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the shop basket.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ShopBasket shopBasket) {
		entityCache.removeResult(
			entityCacheEnabled, ShopBasketImpl.class,
			shopBasket.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ShopBasket> shopBaskets) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ShopBasket shopBasket : shopBaskets) {
			entityCache.removeResult(
				entityCacheEnabled, ShopBasketImpl.class,
				shopBasket.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, ShopBasketImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new shop basket with the primary key. Does not add the shop basket to the database.
	 *
	 * @param shopBasketId the primary key for the new shop basket
	 * @return the new shop basket
	 */
	@Override
	public ShopBasket create(long shopBasketId) {
		ShopBasket shopBasket = new ShopBasketImpl();

		shopBasket.setNew(true);
		shopBasket.setPrimaryKey(shopBasketId);

		String uuid = PortalUUIDUtil.generate();

		shopBasket.setUuid(uuid);

		return shopBasket;
	}

	/**
	 * Removes the shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket that was removed
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	@Override
	public ShopBasket remove(long shopBasketId)
		throws NoSuchShopBasketException {

		return remove((Serializable)shopBasketId);
	}

	/**
	 * Removes the shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the shop basket
	 * @return the shop basket that was removed
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	@Override
	public ShopBasket remove(Serializable primaryKey)
		throws NoSuchShopBasketException {

		Session session = null;

		try {
			session = openSession();

			ShopBasket shopBasket = (ShopBasket)session.get(
				ShopBasketImpl.class, primaryKey);

			if (shopBasket == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchShopBasketException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(shopBasket);
		}
		catch (NoSuchShopBasketException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ShopBasket removeImpl(ShopBasket shopBasket) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shopBasket)) {
				shopBasket = (ShopBasket)session.get(
					ShopBasketImpl.class, shopBasket.getPrimaryKeyObj());
			}

			if (shopBasket != null) {
				session.delete(shopBasket);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (shopBasket != null) {
			clearCache(shopBasket);
		}

		return shopBasket;
	}

	@Override
	public ShopBasket updateImpl(ShopBasket shopBasket) {
		boolean isNew = shopBasket.isNew();

		if (!(shopBasket instanceof ShopBasketModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(shopBasket.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(shopBasket);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in shopBasket proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ShopBasket implementation " +
					shopBasket.getClass());
		}

		ShopBasketModelImpl shopBasketModelImpl =
			(ShopBasketModelImpl)shopBasket;

		if (Validator.isNull(shopBasket.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			shopBasket.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(shopBasket);

				shopBasket.setNew(false);
			}
			else {
				shopBasket = (ShopBasket)session.merge(shopBasket);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {shopBasketModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((shopBasketModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					shopBasketModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {shopBasketModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, ShopBasketImpl.class,
			shopBasket.getPrimaryKey(), shopBasket, false);

		shopBasket.resetOriginalValues();

		return shopBasket;
	}

	/**
	 * Returns the shop basket with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the shop basket
	 * @return the shop basket
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	@Override
	public ShopBasket findByPrimaryKey(Serializable primaryKey)
		throws NoSuchShopBasketException {

		ShopBasket shopBasket = fetchByPrimaryKey(primaryKey);

		if (shopBasket == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchShopBasketException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return shopBasket;
	}

	/**
	 * Returns the shop basket with the primary key or throws a <code>NoSuchShopBasketException</code> if it could not be found.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket
	 * @throws NoSuchShopBasketException if a shop basket with the primary key could not be found
	 */
	@Override
	public ShopBasket findByPrimaryKey(long shopBasketId)
		throws NoSuchShopBasketException {

		return findByPrimaryKey((Serializable)shopBasketId);
	}

	/**
	 * Returns the shop basket with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param shopBasketId the primary key of the shop basket
	 * @return the shop basket, or <code>null</code> if a shop basket with the primary key could not be found
	 */
	@Override
	public ShopBasket fetchByPrimaryKey(long shopBasketId) {
		return fetchByPrimaryKey((Serializable)shopBasketId);
	}

	/**
	 * Returns all the shop baskets.
	 *
	 * @return the shop baskets
	 */
	@Override
	public List<ShopBasket> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ShopBasket> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ShopBasket> findAll(
		int start, int end, OrderByComparator<ShopBasket> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ShopBasket> findAll(
		int start, int end, OrderByComparator<ShopBasket> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ShopBasket> list = null;

		if (useFinderCache) {
			list = (List<ShopBasket>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SHOPBASKET);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SHOPBASKET;

				sql = sql.concat(ShopBasketModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ShopBasket>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the shop baskets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ShopBasket shopBasket : findAll()) {
			remove(shopBasket);
		}
	}

	/**
	 * Returns the number of shop baskets.
	 *
	 * @return the number of shop baskets
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SHOPBASKET);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "shopBasketId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SHOPBASKET;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ShopBasketModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the shop basket persistence.
	 */
	@Activate
	public void activate() {
		ShopBasketModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		ShopBasketModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ShopBasketImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ShopBasketImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ShopBasketImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ShopBasketImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			ShopBasketModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(ShopBasketImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = jbPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.liferay.tax.model.ShopBasket"),
			true);
	}

	@Override
	@Reference(
		target = jbPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = jbPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SHOPBASKET =
		"SELECT shopBasket FROM ShopBasket shopBasket";

	private static final String _SQL_SELECT_SHOPBASKET_WHERE =
		"SELECT shopBasket FROM ShopBasket shopBasket WHERE ";

	private static final String _SQL_COUNT_SHOPBASKET =
		"SELECT COUNT(shopBasket) FROM ShopBasket shopBasket";

	private static final String _SQL_COUNT_SHOPBASKET_WHERE =
		"SELECT COUNT(shopBasket) FROM ShopBasket shopBasket WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "shopBasket.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ShopBasket exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ShopBasket exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ShopBasketPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "active"});

	static {
		try {
			Class.forName(jbPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}