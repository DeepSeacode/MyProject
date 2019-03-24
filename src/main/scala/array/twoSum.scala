

object twoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    if(nums.length == 0 || nums.isEmpty) return null
    val hashmap = collection.mutable.HashMap[Int,Int]()
    for(i <- nums.indices){
      if(hashmap.contains(target - nums(i)))
        return Array[Int](hashmap(target - nums(i)),i)
      hashmap += (nums(i) -> i)
    }
    null
  }

  def main(args: Array[String]): Unit = {
    println(twoSum(Array[Int](1, 2, 3, 4), 3).mkString(","))
  }
}