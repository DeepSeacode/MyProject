package array.other

import scala.collection.mutable

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
object SingleNumber {
  def singleNumber(nums: Array[Int]): Int = {
    nums.reduce(_ ^ _)
  }

  def main(args: Array[String]): Unit = {
    println(4 ^ 0)
  }
}
