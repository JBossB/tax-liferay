package com.liferay.tax.interf;

public interface IItemShopBasket {
	
	String getName();
	double getPrice();
	boolean isImported();
	boolean isExempt();
	double getTotalPrice();
	double getTax();
	int getQuantity();
}
