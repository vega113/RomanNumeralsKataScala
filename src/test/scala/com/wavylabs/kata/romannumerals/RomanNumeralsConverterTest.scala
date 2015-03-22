package com.wavylabs.kata.romannumerals

import org.scalatest.FunSuite

/**
 * Created by vega on 3/19/15.
 */
class RomanNumeralsConverterTest extends FunSuite {

  test("arabic to roman one") {
    assert("I" == RomanNumeralsConverter.arabicToRoman(1))
    assert("II" == RomanNumeralsConverter.arabicToRoman(2))
    assert("III" == RomanNumeralsConverter.arabicToRoman(3))
  }

  test("arabic to roman four") {
    assert("IV" == RomanNumeralsConverter.arabicToRoman(4))
  }

  test("arabic to roman five") {
    assert("V" == RomanNumeralsConverter.arabicToRoman(5))
  }

  test("arabic to roman nine") {
    assert("IX" == RomanNumeralsConverter.arabicToRoman(9))
  }

  test("arabic to roman ten") {
    assert("X" == RomanNumeralsConverter.arabicToRoman(10))
  }

  test("arabic to roman eleven") {
    assert("XI" == RomanNumeralsConverter.arabicToRoman(11))
  }

  test("arabic to roman fifteen") {
    assert("XV" == RomanNumeralsConverter.arabicToRoman(15))
  }

  test("arabic to roman thirty") {
    assert("XXX" == RomanNumeralsConverter.arabicToRoman(30))
  }

  test("roman to arabic one") {
    assert(1 == RomanNumeralsConverter.romanToArabic("I"))
  }
  test("roman to arabic four") {
    assert(4 == RomanNumeralsConverter.romanToArabic("IV"))
  }

  test("roman to arabic thirty one") {
    assert(31 == RomanNumeralsConverter.romanToArabic("XXXI"))
  }
}
