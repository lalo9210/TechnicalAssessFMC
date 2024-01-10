package com.fmc.assessment.util;

import java.util.List;

/**
 * Utility class that contains the methods to convert arabics numbers to roman
 * numerals and viceversa.
 * 
 * @author EHG
 * 
 */
public class RomanNumeralsUtil {

	public static String arabicToRoman(int arabicN) {
		if ((arabicN <= 0) || (arabicN > 4000)) {
			throw new IllegalArgumentException(arabicN + " is not in the 0-4000 range");
		}

		List<CommonValues> romanNums = CommonValues.getReverseSortedValues();

		int i = 0;
		StringBuilder sb = new StringBuilder();

		while ((arabicN > 0) && (i < romanNums.size())) {
			CommonValues symbol = romanNums.get(i);
			if (symbol.getValue() <= arabicN) {
				sb.append(symbol.name());
				arabicN -= symbol.getValue();
			} else {
				i++;
			}
		}

		return sb.toString();
	}

	public static int romanToArabic(String romanNum) {
		return 0;
	}

}
