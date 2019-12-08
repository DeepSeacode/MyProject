package array.string

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 */
object ExcelSheetColumnNumber {
  def titleToNumber(s: String): Int = {
    if(s.isEmpty) return 0
    s.map(_ - 64).zipWithIndex.foldLeft(0)((acc,a2) => acc + a2._1 * math.pow(26,s.length - 1  - a2._2).toInt)
  }

  def main(args: Array[String]): Unit = {
    println(titleToNumber("AB"))
  }
}
