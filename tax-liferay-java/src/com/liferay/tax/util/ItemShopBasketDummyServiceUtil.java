package com.liferay.tax.util;


import com.liferay.tax.interf.IItemShopBasket;
import com.liferay.tax.interf.imp.ItemShopBasket;

import java.util.ArrayList;
import java.util.List;

public class ItemShopBasketDummyServiceUtil {
	private final static boolean IS_IMPORTED 	= Boolean.TRUE;
	private final static boolean NOT_IMPORTED 	= Boolean.FALSE;
	private final static boolean IS_EXEMPT 		= Boolean.TRUE;
	private final static boolean NOT_EXEMPT 	= Boolean.FALSE;
	
	private static IItemShopBasket i1 = new ItemShopBasket(1L, 1, "book ", NOT_IMPORTED, IS_EXEMPT, Double.valueOf("12.49"));
	private static IItemShopBasket i2 = new ItemShopBasket(2L, 1, "music CD", NOT_IMPORTED, NOT_EXEMPT, Double.valueOf("14.99"));
	private static IItemShopBasket i3 = new ItemShopBasket(3L, 1,  "chocolate bar", NOT_IMPORTED, IS_EXEMPT, Double.valueOf("0.85"));
	private static IItemShopBasket i4 = new ItemShopBasket(4L, 1, "imported box of chocolates", IS_IMPORTED, IS_EXEMPT, Double.valueOf("10.00"));
	private static IItemShopBasket i5 = new ItemShopBasket(5L, 1, "imported bottle of perfume", IS_IMPORTED, NOT_EXEMPT, Double.valueOf("47.50"));
	private static IItemShopBasket i6 = new ItemShopBasket(6L, 1, "imported bottle of perfume", IS_IMPORTED, NOT_EXEMPT, Double.valueOf("27.99"));
	private static IItemShopBasket i7 = new ItemShopBasket(7L, 1, "bottle of perfume", NOT_IMPORTED, NOT_EXEMPT, Double.valueOf("18.99"));
	private static IItemShopBasket i8 = new ItemShopBasket(8L, 1, "packet of headache pills", NOT_IMPORTED, IS_EXEMPT, Double.valueOf("9.75"));
	private static IItemShopBasket i9 = new ItemShopBasket(9L, 1, "imported bottle of perfume", IS_IMPORTED, IS_EXEMPT, Double.valueOf("11.25"));
	
	
	public static List<IItemShopBasket> getListAll() {
		List<IItemShopBasket> list = new ArrayList<IItemShopBasket>();
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		list.add(i6);
		list.add(i7);
		list.add(i8);
		list.add(i9);
		return list;
	}
	private static List<IItemShopBasket> getListCart1() {
		List<IItemShopBasket> list = new ArrayList<IItemShopBasket>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		return list;
	}
	private static List<IItemShopBasket> getListCart2() {
		List<IItemShopBasket> list = new ArrayList<IItemShopBasket>();
		list.add(i4);
		list.add(i5);
		return list;
	}
	private static List<IItemShopBasket> getListCart3() {
		List<IItemShopBasket> list = new ArrayList<IItemShopBasket>();
		list.add(i6);
		list.add(i7);
		list.add(i8);
		list.add(i9);
		return list;
	}
	
	public static List<IItemShopBasket> getList(int key){
		switch (key) {
		case 1:
			return getListCart1();
		case 2:
			return getListCart2();
		case 3:
			return getListCart3();
		default:
			break;
		}
		return null;
	}
}
