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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.tax.exception.NoSuchItemShopBasketException;
import com.liferay.tax.model.ItemShopBasket;
import com.liferay.tax.model.impl.ItemShopBasketImpl;
import com.liferay.tax.model.impl.ItemShopBasketModelImpl;
import com.liferay.tax.service.persistence.ItemShopBasketPersistence;
import com.liferay.tax.service.persistence.impl.constants.jbPersistenceConstants;

import java.io.Serializable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the item shop basket service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jbaeza
 * @generated
 */
@Component(service = ItemShopBasketPersistence.class)
public class ItemShopBasketPersistenceImpl
	extends BasePersistenceImpl<ItemShopBasket>
	implements ItemShopBasketPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ItemShopBasketUtil</code> to access the item shop basket persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ItemShopBasketImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public ItemShopBasketPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("active", "active_");

		setDBColumnNames(dbColumnNames);

		setModelClass(ItemShopBasket.class);

		setModelImplClass(ItemShopBasketImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the item shop basket in the entity cache if it is enabled.
	 *
	 * @param itemShopBasket the item shop basket
	 */
	@Override
	public void cacheResult(ItemShopBasket itemShopBasket) {
		entityCache.putResult(
			entityCacheEnabled, ItemShopBasketImpl.class,
			itemShopBasket.getPrimaryKey(), itemShopBasket);

		itemShopBasket.resetOriginalValues();
	}

	/**
	 * Caches the item shop baskets in the entity cache if it is enabled.
	 *
	 * @param itemShopBaskets the item shop baskets
	 */
	@Override
	public void cacheResult(List<ItemShopBasket> itemShopBaskets) {
		for (ItemShopBasket itemShopBasket : itemShopBaskets) {
			if (entityCache.getResult(
					entityCacheEnabled, ItemShopBasketImpl.class,
					itemShopBasket.getPrimaryKey()) == null) {

				cacheResult(itemShopBasket);
			}
			else {
				itemShopBasket.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all item shop baskets.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ItemShopBasketImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the item shop basket.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ItemShopBasket itemShopBasket) {
		entityCache.removeResult(
			entityCacheEnabled, ItemShopBasketImpl.class,
			itemShopBasket.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ItemShopBasket> itemShopBaskets) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ItemShopBasket itemShopBasket : itemShopBaskets) {
			entityCache.removeResult(
				entityCacheEnabled, ItemShopBasketImpl.class,
				itemShopBasket.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, ItemShopBasketImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new item shop basket with the primary key. Does not add the item shop basket to the database.
	 *
	 * @param itemShopBasketId the primary key for the new item shop basket
	 * @return the new item shop basket
	 */
	@Override
	public ItemShopBasket create(long itemShopBasketId) {
		ItemShopBasket itemShopBasket = new ItemShopBasketImpl();

		itemShopBasket.setNew(true);
		itemShopBasket.setPrimaryKey(itemShopBasketId);

		return itemShopBasket;
	}

	/**
	 * Removes the item shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket that was removed
	 * @throws NoSuchItemShopBasketException if a item shop basket with the primary key could not be found
	 */
	@Override
	public ItemShopBasket remove(long itemShopBasketId)
		throws NoSuchItemShopBasketException {

		return remove((Serializable)itemShopBasketId);
	}

	/**
	 * Removes the item shop basket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the item shop basket
	 * @return the item shop basket that was removed
	 * @throws NoSuchItemShopBasketException if a item shop basket with the primary key could not be found
	 */
	@Override
	public ItemShopBasket remove(Serializable primaryKey)
		throws NoSuchItemShopBasketException {

		Session session = null;

		try {
			session = openSession();

			ItemShopBasket itemShopBasket = (ItemShopBasket)session.get(
				ItemShopBasketImpl.class, primaryKey);

			if (itemShopBasket == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchItemShopBasketException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(itemShopBasket);
		}
		catch (NoSuchItemShopBasketException noSuchEntityException) {
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
	protected ItemShopBasket removeImpl(ItemShopBasket itemShopBasket) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(itemShopBasket)) {
				itemShopBasket = (ItemShopBasket)session.get(
					ItemShopBasketImpl.class,
					itemShopBasket.getPrimaryKeyObj());
			}

			if (itemShopBasket != null) {
				session.delete(itemShopBasket);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (itemShopBasket != null) {
			clearCache(itemShopBasket);
		}

		return itemShopBasket;
	}

	@Override
	public ItemShopBasket updateImpl(ItemShopBasket itemShopBasket) {
		boolean isNew = itemShopBasket.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(itemShopBasket);

				itemShopBasket.setNew(false);
			}
			else {
				itemShopBasket = (ItemShopBasket)session.merge(itemShopBasket);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			entityCacheEnabled, ItemShopBasketImpl.class,
			itemShopBasket.getPrimaryKey(), itemShopBasket, false);

		itemShopBasket.resetOriginalValues();

		return itemShopBasket;
	}

	/**
	 * Returns the item shop basket with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the item shop basket
	 * @return the item shop basket
	 * @throws NoSuchItemShopBasketException if a item shop basket with the primary key could not be found
	 */
	@Override
	public ItemShopBasket findByPrimaryKey(Serializable primaryKey)
		throws NoSuchItemShopBasketException {

		ItemShopBasket itemShopBasket = fetchByPrimaryKey(primaryKey);

		if (itemShopBasket == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchItemShopBasketException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return itemShopBasket;
	}

	/**
	 * Returns the item shop basket with the primary key or throws a <code>NoSuchItemShopBasketException</code> if it could not be found.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket
	 * @throws NoSuchItemShopBasketException if a item shop basket with the primary key could not be found
	 */
	@Override
	public ItemShopBasket findByPrimaryKey(long itemShopBasketId)
		throws NoSuchItemShopBasketException {

		return findByPrimaryKey((Serializable)itemShopBasketId);
	}

	/**
	 * Returns the item shop basket with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemShopBasketId the primary key of the item shop basket
	 * @return the item shop basket, or <code>null</code> if a item shop basket with the primary key could not be found
	 */
	@Override
	public ItemShopBasket fetchByPrimaryKey(long itemShopBasketId) {
		return fetchByPrimaryKey((Serializable)itemShopBasketId);
	}

	/**
	 * Returns all the item shop baskets.
	 *
	 * @return the item shop baskets
	 */
	@Override
	public List<ItemShopBasket> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemShopBasket> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ItemShopBasket> findAll(
		int start, int end,
		OrderByComparator<ItemShopBasket> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ItemShopBasket> findAll(
		int start, int end, OrderByComparator<ItemShopBasket> orderByComparator,
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

		List<ItemShopBasket> list = null;

		if (useFinderCache) {
			list = (List<ItemShopBasket>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ITEMSHOPBASKET);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ITEMSHOPBASKET;

				sql = sql.concat(ItemShopBasketModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ItemShopBasket>)QueryUtil.list(
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
	 * Removes all the item shop baskets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ItemShopBasket itemShopBasket : findAll()) {
			remove(itemShopBasket);
		}
	}

	/**
	 * Returns the number of item shop baskets.
	 *
	 * @return the number of item shop baskets
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ITEMSHOPBASKET);

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
		return "itemShopBasketId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ITEMSHOPBASKET;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ItemShopBasketModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the item shop basket persistence.
	 */
	@Activate
	public void activate() {
		ItemShopBasketModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		ItemShopBasketModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ItemShopBasketImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ItemShopBasketImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(ItemShopBasketImpl.class.getName());

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
				"value.object.column.bitmask.enabled.com.liferay.tax.model.ItemShopBasket"),
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

	private static final String _SQL_SELECT_ITEMSHOPBASKET =
		"SELECT itemShopBasket FROM ItemShopBasket itemShopBasket";

	private static final String _SQL_COUNT_ITEMSHOPBASKET =
		"SELECT COUNT(itemShopBasket) FROM ItemShopBasket itemShopBasket";

	private static final String _ORDER_BY_ENTITY_ALIAS = "itemShopBasket.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ItemShopBasket exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		ItemShopBasketPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"active"});

	static {
		try {
			Class.forName(jbPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}