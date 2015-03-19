package com.wavylabs.kata.romannumerals

import org.scalatest.FunSuite

/**
 * Created by vega on 3/19/15.
 */
class RomanNumeralsTest extends FunSuite {

  test("arabic to roman one") {
    assert("I" == RomanNumerals.arabicToRoman(1))
    assert("II" == RomanNumerals.arabicToRoman(2))
    assert("III" == RomanNumerals.arabicToRoman(3))
  }

  test("arabic to roman four") {
    assert("IV" == RomanNumerals.arabicToRoman(4))
  }
}
