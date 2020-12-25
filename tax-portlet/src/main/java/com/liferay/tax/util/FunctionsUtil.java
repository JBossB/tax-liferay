package com.liferay.tax.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FunctionsUtil {
	static public double nearest5Percent(double amount) {
		return new BigDecimal(Math.ceil(amount * 20)/20).setScale(2,RoundingMode.HALF_UP).doubleValue();
	}

	public static double roundPrice(double amount) {
		return new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	
	public static DecimalFormat df = new DecimalFormat("##0.00");
	
	public static String formatDecimal(double value) {
		return df.format(value);
	}
}
