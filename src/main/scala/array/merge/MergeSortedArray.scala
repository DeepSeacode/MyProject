package array.merge

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
object MergeSortedArray{
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return
    if(nums1.length < nums2.length) return
    if(nums1.length == nums2.length) {nums2.copyToArray(nums1) ; return }
    val diff = nums1.length - nums2.length
    var i = diff - 1
    var j = nums2.length - 1
    var curr = nums1.length - 1
    while (j >= 0 && i >= 0){
      if(nums1(i) > nums2(j)){
        nums1(curr) = nums1(i)
        i -= 1
      }else{
        nums1(curr) = nums2(j)
        j -= 1
      }
      curr -= 1
    }
    while (j >= 0){
      nums1(j) = nums2(j)
      j -= 1
    }
  }

  def main(args: Array[String]): Unit = {
    val n1 = Array(2, 0)
    val n2 = Array(1)
    println(merge(n1, 1, n2, 1),n1.mkString(","))
  }
}
