package com.liferay.tax.decorator;

import com.liferay.tax.model.ItemShopBasket;
import com.liferay.tax.util.FunctionsUtil;

@SuppressWarnings("serial")
public abstract class ItemShopBasketDecorator implements ItemShopBasket{

	protected ItemShopBasket productDecorated;
	
	protected double fee;
	abstract double getFee();
	public Object clone() { return productDecorated; }
	
	public ItemShopBasketDecorator(ItemShopBasket item){
		this.productDecorated = item;
	}
	
	
	public Double getTax() {
		return FunctionsUtil.nearest5Percent(this.getPrice() * this.getFee());
	}
	
	public Double getTotal(){
		Double total = (this.productDecorated.getTotal()==0D?this.productDecorated.getPrice():this.productDecorated.getTotal());
		return  FunctionsUtil.roundPrice(total + getTax());
	}
	
	public Double getPrice() {
		return this.productDecorated.getPrice();
	}
	
	public boolean isImported() {
		return this.productDecorated.isImported();
	}

	public String getName() {
		return this.productDecorated.getName();
	}

	public boolean isExempt() {
		return this.productDecorated.isExempt();
	}

	public long getAmount() {
		return this.productDecorated.getAmount();
	}
	
	public boolean getImported() {
		return this.productDecorated.isImported();
	}

	public boolean getExempt() {
		return this.productDecorated.isExempt();
	}
	
}
