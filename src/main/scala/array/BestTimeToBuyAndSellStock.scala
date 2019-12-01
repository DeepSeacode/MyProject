package array

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
object BestTimeToBuyAndSellStock {
  def maxProfit(prices: Array[Int]): Int = {
    if (prices == null || prices.length < 2) return 0
    var res = 0

    var i = prices.length - 2
    while (i >= 0) {
      var j = i + 1
      var tmp = res
      while (j < prices.length) {
        tmp = math.max(tmp, -prices(i) + prices(j))
        j += 1
      }
      res = tmp
      i -= 1
    }
    res
  }

  def main(args: Array[String]): Unit = {
    val arr = Array[Int](7, 1, 5, 3, 6, 4)
    println(maxProfit(arr))
  }
}
