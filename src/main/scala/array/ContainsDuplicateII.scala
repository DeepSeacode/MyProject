package array

import scala.collection.mutable

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
object ContainsDuplicateII {
  def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
    val m = new mutable.HashMap[Int,Int]()
    for(i <- nums.indices){
      if(m.contains(nums(i))) {
        if(math.abs(m(nums(i)) - i) <= k)
          return true
        else
          m(nums(i)) = i
      }else{
        m += nums(i) -> i
      }
    }
    false
  }
}
