package com.wavylabs.kata.romannumerals


/**
 * Created by vega on 3/19/15.
 */
object RomanNumeralsConverter {

  case class Numeral(arabic: Int, roman: String)

  type AccArabicRoman = (Int, String)

  val numerals: List[Numeral] = List(Numeral(1, "I"),
    Numeral(4, "IV"),
    Numeral(5, "V"),
    Numeral(9, "IX"),
    Numeral(40, "XL"),
    Numeral(50, "L"),
    Numeral(90, "XC"),
    Numeral(100, "C"),
    Numeral(400, "CD"),
    Numeral(500, "D"),
    Numeral(900, "CM"),
    Numeral(1000, "M")
  ).reverse

  def romanToArabic(roman: String): Int = {
    foldArabicRoman((0, roman),
      (a, b) => b._2.startsWith(a.roman),
      (a, b) => b._1 + a.arabic,
      (a, b) => b._2.replaceFirst(a.roman, ""))._1
  }

  def arabicToRoman(arabic: Int): String = {
    foldArabicRoman((arabic, ""),
      _.arabic <= _._1,
      (a, b) => b._1 - a.arabic,
      (a, b) => b._2 + a.roman)._2
  }

  private def foldArabicRoman(acc: AccArabicRoman, predicate: (Numeral, AccArabicRoman) => Boolean,
                              arabicCombine: (Numeral, AccArabicRoman) => Int,
                              romanCombine: (Numeral, AccArabicRoman) => String): AccArabicRoman = {
    numerals.foldLeft[AccArabicRoman](acc)((a, b) => convertAcc(predicate.curried(b),
      arabicCombine.curried(b),
      romanCombine.curried(b))(a))
  }

  private[romannumerals] def convertAcc(predicate: (AccArabicRoman) => Boolean,
                                        arabicCombine: (AccArabicRoman) => Int,
                                        romanCombine: (AccArabicRoman) => String)
                                       (acc: AccArabicRoman): AccArabicRoman = {
    if (predicate(acc)) {
      convertAcc(predicate, arabicCombine, romanCombine)((arabicCombine(acc), romanCombine(acc)))
    } else {
      acc
    }
  }
}
