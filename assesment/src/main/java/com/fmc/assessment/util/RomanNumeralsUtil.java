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

	/**
	 * <p>
	 * This method receives an int value and using the CommonValues ENUM generates
	 * the roman numeral based on the next assumptions: - If input number is >=
	 * highest roman numeral, add it to the string builder and reduce its
	 * corresponding value from the input number. - If input number is < highest
	 * roman numeral, then check with next highest roman numerals. Repeat the
	 * process above till the input number becomes 0.
	 * </p>
	 * 
	 * @param arabicN the int value user wants to be converted into roman numeral
	 * @return roman numeral.
	 * @throws IllegalArgumentException if the number requested is not into the
	 *                                  1-4000 range.
	 */
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

	/**
	 * <p>
	 * This method receives a String value that represents a roman numeral, then
	 * populates a Map with all the different roman numeral symbols. The method
	 * iterate all the symbols received and sum their corresponding value (contained
	 * in the MAP).
	 * </p>
	 * 
	 * @param romanNum the roman numeral user wants to convert into arabic number.
	 * @return an int value that represents the arabic value of the roman numeral
	 *         received.
	 */
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
