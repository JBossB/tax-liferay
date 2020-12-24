package com.liferay.tax.decorator;

import com.liferay.tax.interf.IItemShopBasket;

public class ItemShopBasketTaxImportedDecorator extends ItemShopBasketDecorator{

	final double fee = 0.05;
	
	public ItemShopBasketTaxImportedDecorator(IItemShopBasket item) {
		super(item);
	}
	
	@Override
	double getFee() {
		return this.fee;
	}
}
