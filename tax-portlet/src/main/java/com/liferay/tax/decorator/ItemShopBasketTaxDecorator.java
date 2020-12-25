package com.liferay.tax.decorator;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.tax.model.ItemShopBasket;

import java.io.Serializable;
import java.util.Map;

public class ItemShopBasketTaxDecorator extends ItemShopBasketDecorator{

	final double fee = 0.1;
	
	public ItemShopBasketTaxDecorator(ItemShopBasket item) {
		super(item);
		this.productDecorated = item;
	}
	
	@Override
	double getFee() {
		return this.fee;
	}

	@Override
	public long getPrimaryKey() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getItemShopBasketId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setItemShopBasketId(long itemShopBasketId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getShopBasketId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setShopBasketId(long shopBasketId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setImported(boolean imported) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setExempt(boolean exempt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPrice(Double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setActive(boolean active) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAmount(long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTax(Double tax) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setTotal(Double total) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCachedModel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEscapedModel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetOriginalValues() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNew(boolean n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CacheModel<ItemShopBasket> toCacheModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemShopBasket toEscapedModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemShopBasket toUnescapedModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toXmlString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getModelClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getModelClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(ItemShopBasket o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void persist() {
		// TODO Auto-generated method stub
		
	}

}
