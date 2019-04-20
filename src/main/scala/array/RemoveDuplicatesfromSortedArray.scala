package array

object RemoveDuplicatesfromSortedArray {
  def removeDuplicates(nums: Array[Int]): Int = {
    if(nums.length <= 1) return nums.length
    var i = 0
    var j = 1
    while (j < nums.length){
      if(nums(j) != nums(i)){
        i+=1
        nums(i) = nums(j)

      }
      j += 1
    }
    i+1
  }
}
