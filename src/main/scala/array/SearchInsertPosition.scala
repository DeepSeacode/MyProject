package array

object SearchInsertPosition {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    if(nums.length == 0) return 0
    var i = 0
    while (i < nums.length){
      if(nums(i) >= target)
        return i
      i += 1
    }
    i
  }
  def main(args: Array[String]): Unit = {

  }
}
