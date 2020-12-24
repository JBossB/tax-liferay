package com.liferay.tax.main;

import com.liferay.tax.decorator.ItemShopBasketTaxDecorator;
import com.liferay.tax.decorator.ItemShopBasketTaxImportedDecorator;
import com.liferay.tax.interf.IItemShopBasket;
import com.liferay.tax.util.FunctionsUtil;
import com.liferay.tax.util.ItemShopBasketDummyServiceUtil;

import java.util.List;

public class ShopBasketApp {

	final static int LIST1 = 1;
	final static int LIST2 = 2;
	final static int LIST3 = 3;
	
	public static void main(String[] args) {
		if(args.length == 0)
		{
			System.out.println("welcome tax-liferay-tax");
			System.out.println("usage is: java -jar tax-liferay-java %s where %s is 1,2 or 3");
			System.out.println("example: java -jar tax-liferay-java 1");
			System.exit(0);
		}
		else {
			int key = Integer.valueOf(args[0]);
			List<IItemShopBasket> items = ItemShopBasketDummyServiceUtil.getList(key);
			if(null != items) {
				printInput(key, items);
				printOutput(key, items);
			}
			else {
				System.out.println("this method is not implemented, please usage argument 1, 2 or 3");
				System.out.println("bye!");
				System.exit(0);
			}
		}
		
	}

	private static void printOutput(int key, List<IItemShopBasket> items) {
		System.out.println("Output "+key+":");
		
		double taxSum = 0D;
		double totalSum = 0D;
		for(IItemShopBasket item:items) {
			if(item.isImported()) 	item = new ItemShopBasketTaxImportedDecorator(item);
			if(!item.isExempt())	item = new ItemShopBasketTaxDecorator(item);
			
			taxSum += (item.getTotalPrice()-item.getPrice());
			totalSum += item.getTotalPrice();
			System.out.println(item.getQuantity() + " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getTotalPrice()));
		}
		System.out.println("Sales taxes: "+ FunctionsUtil.formatDecimal(taxSum));
		System.out.println("Total: "+ FunctionsUtil.formatDecimal(totalSum));
	}

	private static void printInput(int key, List<IItemShopBasket> items) {
		System.out.println("Input "+key+":");
		for(IItemShopBasket item:items) {
			System.out.println(item.getQuantity() + " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getPrice()));
		}
	}

}
