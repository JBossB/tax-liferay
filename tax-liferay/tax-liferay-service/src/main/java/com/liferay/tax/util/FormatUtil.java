package com.liferay.tax.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class FormatUtil {
	
	public static SimpleDateFormat sdfull 	= new SimpleDateFormat("dd-MM-yyyy HH:mm");
	public static SimpleDateFormat sdf2		= new SimpleDateFormat("dd-MM-yyyy");
	public static DecimalFormat df = new DecimalFormat("###.00");
	
	static public double rountPercent(double amount) {
		return new BigDecimal(Math.ceil(amount * 20)/20).setScale(2,RoundingMode.HALF_UP).doubleValue();
	}

	public static double roundPrice(double amount) {
		return new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
}
