package bco.romannumerals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class convertNormalToRomanNumeralsTest {

  private static final RomanNumber maxRomanNumeral = new RomanM();

  @ParameterizedTest
  @CsvSource({"1,I", "2,II", "3,III"})
  void roman_numeral_of_I_is_1(final int normalNumber, final String romanNumeral) {
    assertThat(maxRomanNumeral.of(normalNumber)).isEqualTo(romanNumeral);
  }

  @ParameterizedTest
  @CsvSource({"5,V", "6,VI", "8,VIII"})
  void roman_numeral_of_V_is_5(final int normalNumber, final String romanNumeral) {
    assertThat(maxRomanNumeral.of(normalNumber)).isEqualTo(romanNumeral);
  }

  @Test
  void roman_number_of_four_is_IV() {
    assertThat(maxRomanNumeral.of(4)).isEqualTo("IV");
  }

  @ParameterizedTest
  @CsvSource({"10,X", "11,XI", "13,XIII"})
  void roman_numeral_of_X_is_10(final int normalNumber, final String romanNumeral) {
    assertThat(maxRomanNumeral.of(normalNumber)).isEqualTo(romanNumeral);
  }

  @Test
  void roman_number_of_nine_is_IX() {
    assertThat(maxRomanNumeral.of(9)).isEqualTo("IX");
  }

  @ParameterizedTest
  @CsvSource({"50,L", "55,LV", "78,LXXVIII"})
  void roman_numeral_of_L_is_50(final int normalNumber, final String romanNumeral) {
    assertThat(maxRomanNumeral.of(normalNumber)).isEqualTo(romanNumeral);
  }

  @Test
  void roman_number_of_forty_is_XL() {
    assertThat(maxRomanNumeral.of(40)).isEqualTo("XL");
  }

  @ParameterizedTest
  @CsvSource({"100,C", "144,CXLIV", "188,CLXXXVIII"})
  void roman_numeral_of_C_is_100(final int normalNumber, final String romanNumeral) {
    assertThat(maxRomanNumeral.of(normalNumber)).isEqualTo(romanNumeral);
  }

  @Test
  void roman_number_of_ninety_is_XC() {
    assertThat(maxRomanNumeral.of(90)).isEqualTo("XC");
  }

  @ParameterizedTest
  @CsvSource({"500,D", "448,CDXLVIII", "856,DCCCLVI"})
  void roman_numeral_of_D_is_500(final int normalNumber, final String romanNumeral) {
    assertThat(maxRomanNumeral.of(normalNumber)).isEqualTo(romanNumeral);
  }

  @ParameterizedTest
  @CsvSource({"1000,M", "987,CMLXXXVII", "2751,MMDCCLI"})
  void roman_numeral_of_M_is_1000(final int normalNumber, final String romanNumeral) {
    assertThat(maxRomanNumeral.of(normalNumber)).isEqualTo(romanNumeral);
  }
}
