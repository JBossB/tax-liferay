package com.liferay.tax.constant;


import com.liferay.tax.constant.model.ItemTemp;

import java.util.ArrayList;
import java.util.List;

public class DefaultData {
	
	private final static boolean IS_IMPORTED 	= Boolean.TRUE;
	private final static boolean NOT_IMPORTED 	= Boolean.FALSE;
	private final static boolean IS_FREE 		= Boolean.TRUE;
	private final static boolean NOT_FREE 		= Boolean.FALSE;
	
	private static ItemTemp i1 = new ItemTemp(1L, 1L, "book ", NOT_IMPORTED, IS_FREE, Double.valueOf("12.49"), true);
	private static ItemTemp i2 = new ItemTemp(2L, 1L, "music CD", NOT_IMPORTED, NOT_FREE, Double.valueOf("14.99"), true);
	private static ItemTemp i3 = new ItemTemp(3L, 1L, "chocolate bar", NOT_IMPORTED, IS_FREE, Double.valueOf("0.85"), true);
	private static ItemTemp i4 = new ItemTemp(4L, 2L, "imported box of chocolates", IS_IMPORTED, IS_FREE, Double.valueOf("10.00"), true);
	private static ItemTemp i5 = new ItemTemp(5L, 2L, "imported bottle of perfume", IS_IMPORTED, NOT_FREE, Double.valueOf("47.50"), true);
	private static ItemTemp i6 = new ItemTemp(6L, 3L, "imported bottle of perfume", IS_IMPORTED, NOT_FREE, Double.valueOf("27.99"), true);
	private static ItemTemp i7 = new ItemTemp(7L, 3L, "bottle of perfume", NOT_IMPORTED, NOT_FREE, Double.valueOf("18.99"), true);
	private static ItemTemp i8 = new ItemTemp(8L, 3L, "packet of headache pills", NOT_IMPORTED, IS_FREE, Double.valueOf("9.75"), true);
	private static ItemTemp i9 = new ItemTemp(9L, 3L, "imported bottle of perfume", IS_IMPORTED, NOT_FREE, Double.valueOf("11.25"), true);
	
	
	public static List<ItemTemp> getListAll() {
		List<ItemTemp> list = new ArrayList<ItemTemp>();
		
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
	private static List<ItemTemp> getListCart1() {
		List<ItemTemp> list = new ArrayList<ItemTemp>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		return list;
	}
	private static List<ItemTemp> getListCart2() {
		List<ItemTemp> list = new ArrayList<ItemTemp>();
		list.add(i4);
		list.add(i5);
		return list;
	}
	private static List<ItemTemp> getListCart3() {
		List<ItemTemp> list = new ArrayList<ItemTemp>();
		list.add(i6);
		list.add(i7);
		list.add(i8);
		list.add(i9);
		return list;
	}
	
	public static List<ItemTemp> getList(String key){
		switch (key) {
		case "1":
			return getListCart1();
		case "2":
			return getListCart2();
		case "3":
			return getListCart3();
		default:
			break;
		}
		return null;
	}

}
