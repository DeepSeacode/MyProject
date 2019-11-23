package dp

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 */
object ClimbStairs {
  def climbStairs(n: Int): Int = {

    val res = new Array[Int](n+1)
    dp(res,n)
  }
  def dp(res:Array[Int],n:Int):Int = {
    if(n == 0)
      return 1
    if(n < 0)
      return 0
    if(res(n) > 0)
      return res(n)
    res(n) = dp(res,n-1) + dp(res,n-2)
    res(n)
  }

  def main(args: Array[String]): Unit = {
    println(climbStairs(3))
  }
}
