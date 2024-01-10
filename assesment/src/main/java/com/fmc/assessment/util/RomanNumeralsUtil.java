package com.fmc.assessment.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Utility class that contains the methods to convert arabics numbers to roman
 * numerals and viceversa.
 * 
 * @author EHG
 * 
 */
public class RomanNumeralsUtil {

	static Map<Character, Integer> romanNumeralMap = new HashMap<Character, Integer>();

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
		romanNumeralMap.put('I', 1);
		romanNumeralMap.put('V', 5);
		romanNumeralMap.put('X', 10);
		romanNumeralMap.put('L', 50);
		romanNumeralMap.put('C', 100);
		romanNumeralMap.put('D', 500);
		romanNumeralMap.put('M', 1000);

		int result = 0;

		for (int i = 0; i < romanNum.length(); i++) {
			if (i < romanNum.length() - 1
					&& romanNumeralMap.get(romanNum.charAt(i + 1)) > romanNumeralMap.get(romanNum.charAt(i)))
				result -= romanNumeralMap.get(romanNum.charAt(i));
			else
				result += romanNumeralMap.get(romanNum.charAt(i));
		}

		return result;
	}

}
