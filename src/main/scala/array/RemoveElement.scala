package array

object RemoveElement {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    if(nums.length == 0) return 0
    var i = 0
    var j = 0
    while (j < nums.length){
      if(nums(j) != `val`){
        nums(i) = nums(j)
        i += 1
      }
      j += 1
    }
    i
  }
}
