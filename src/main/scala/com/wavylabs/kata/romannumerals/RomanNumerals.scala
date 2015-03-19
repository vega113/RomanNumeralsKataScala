package com.wavylabs.kata.romannumerals

/**
 * Created by vega on 3/19/15.
 */
object RomanNumerals {
  def arabicToRoman(arabic: Int): String = {
    1.to(arabic).map(_ => "I").mkString("")
  }

}
