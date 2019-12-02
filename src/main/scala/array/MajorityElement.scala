package array

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
object MajorityElement {
  def majorityElement(nums: Array[Int]): Int = {
    nums.groupBy[Int](t => t).map(m => m._1 -> m._2.length).find(_._2 > nums.length/2).get._1
  }
}
