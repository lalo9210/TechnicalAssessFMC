package com.fmc.assessment.util;

public class Test {

	public static void main(String[] args) {

		System.out.println(RomanNumeralsUtil.romanToArabic("MDCCCXCVIII"));
		System.out.println(RomanNumeralsUtil.arabicToRoman(1898));
		
		System.out.println(RomanNumeralsUtil.romanToArabic("MMMCMXLIV"));
		System.out.println(RomanNumeralsUtil.arabicToRoman(3944));
		
		System.out.println(RomanNumeralsUtil.romanToArabic("XXXVIII"));
		System.out.println(RomanNumeralsUtil.arabicToRoman(38));

	}

}
