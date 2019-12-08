package number

import scala.collection.mutable

/**
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
object HappyNumber {
  def isHappy(n: Int): Boolean = {
    var richNumber = n.toString
    var cur = n
    var alreadySet = new mutable.HashSet[Int]()
    alreadySet.add(n)
    while (cur != 1){
      cur = richNumber.map(_.toString.toInt).foldLeft(0)((acc,a2) => acc + a2 * a2)
      if(alreadySet.contains(cur)){
        return false
      }
      alreadySet.add(cur)
      richNumber = cur.toString
    }
    true

  }

  def isHappy2(n: Int): Boolean = {
    var richNumber = n.toString
    var cur = n
    while (cur != 1){
      cur = richNumber.map(_.toString.toInt).foldLeft(0)((acc,a2) => acc + a2 * a2)
      if(cur == 4){
        return false
      }
      richNumber = cur.toString
    }
    true

  }

  def main(args: Array[String]): Unit = {
    val d = (1 to 100).map(t => (t,isHappy(t),isHappy2(t))).filter(t => t._2!= t._3)
      .foreach(print)
  }
}
