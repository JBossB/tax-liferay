package com.liferay.tax.decorator;

import com.liferay.tax.interf.IItemShopBasket;

public class ItemShopBasketTaxDecorator extends ItemShopBasketDecorator{

	final double fee = 0.1;
	
	public ItemShopBasketTaxDecorator(IItemShopBasket item) {
		super(item);
	}
	
	@Override
	double getFee() {
		return this.fee;
	}

}
