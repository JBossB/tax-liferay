package com.liferay.tax.decorator;

import com.liferay.tax.interf.IItemShopBasket;
import com.liferay.tax.util.FunctionsUtil;

public abstract class ItemShopBasketDecorator implements IItemShopBasket{

	protected IItemShopBasket productDecorated;
	
	protected double fee;
	abstract double getFee();
	
	public ItemShopBasketDecorator(IItemShopBasket item){
		this.productDecorated = item;
	}
	
	public double getTotalPrice(){
		return FunctionsUtil.roundPrice(this.productDecorated.getTotalPrice() + getTax());
	}
	
	public double getTax() {
		return FunctionsUtil.nearest5Percent(this.productDecorated.getPrice() * this.getFee());
	}
	
	
	public boolean isImported() {
		return this.productDecorated.isImported();
	}

	public String getName() {
		return this.productDecorated.getName();
	}

	public double getPrice() {
		return this.productDecorated.getPrice();
	}

	public boolean isExempt() {
		return this.productDecorated.isExempt();
	}

	public int getQuantity() {
		return this.productDecorated.getQuantity();
	}
	
}
