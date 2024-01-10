package com.fmc.assessment.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * CommonValues is an ENUM that contains all the possible values an arabic
 * number can have when converting into the roman one.
 * 
 * These values only work with those arabic numbers between 1-4000.
 * 
 * @author EHG
 * 
 */
enum CommonValues {
	I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

	/**
	 * Integer variable that is going to be used to compare the ENUM values
	 */
	private int val;

	/**
	 * <p>
	 * Class constructor
	 * </p>
	 * 
	 * @param val
	 */
	CommonValues(int val) {
		this.val = val;
	}

	/**
	 * <p>
	 * This method returns the value of val variable
	 * 
	 * @return the values of val variable
	 */
	public int getValue() {
		return val;
	}

	/**
	 * <p>
	 * This method iterates over the ENUM values to create a new list that contain
	 * the same vales but ordered in a reverse way using its int value
	 * 
	 * @return a list with the ENUMS ordered in a reverse way
	 */
	public static List<CommonValues> getReverseSortedValues() {
		return Arrays.stream(values()).sorted(Comparator.comparing((CommonValues e) -> e.val).reversed())
				.collect(Collectors.toList());
	}
}
