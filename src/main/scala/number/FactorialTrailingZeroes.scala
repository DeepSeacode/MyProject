package number

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Note: Your solution should be in logarithmic time complexity.
 */
object FactorialTrailingZeroes {
  def trailingZeroes(n: Int): Int = {
    (1 to n).takeWhile( i => n >= math.pow(5,i))
      .map(n/math.pow(5,_).toInt).sum
  }
}
