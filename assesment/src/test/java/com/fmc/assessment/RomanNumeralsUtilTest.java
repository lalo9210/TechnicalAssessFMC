package com.fmc.assessment;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.fmc.assessment.util.RomanNumeralsUtil;

/**
 * 
 * Java class to validate functionality of RomanNumeralsUtil using unit tests
 * with JUnit Juppiter
 * 
 * @author EHG
 *
 */
class RomanNumeralsUtilTest {

	@Test
	void given1898Arabic_WhenConvertingToRoman_ThenReturnMDCCCXCVIII() {

		int arabic1898 = 1898;

		String result = RomanNumeralsUtil.arabicToRoman(arabic1898);

		assertThat(result).isEqualTo("MDCCCXCVIII");
	}
	
	@Test
	void given3944Arabic_WhenConvertingToRoman_ThenReturnMMMCMXLIV() {

		int arabic3944 = 3944;

		String result = RomanNumeralsUtil.arabicToRoman(arabic3944);

		assertThat(result).isEqualTo("MMMCMXLIV");
	}
	
	@Test
	void givenMDCCCXCVIIIRoman_WhenConvertingToArabic_ThenReturn1898() {

		String roman = "MDCCCXCVIII";

		int result = RomanNumeralsUtil.romanToArabic(roman);

		assertThat(result).isEqualTo(1898);
	}

}
