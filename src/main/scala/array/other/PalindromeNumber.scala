package array.other

object PalindromeNumber {
//  /**
//    * 普通方法进阶版
//    * @param x
//    * @return
//    */
//  def isPalindrome(x: Int): Boolean = {
//    if(x < 0) false
//    else {
//      var pop = x%10
//      var tmp = x / 10
//      while (tmp > 0){
//        pop = pop * 10 + tmp % 10
//        tmp /= 10
//      }
//      if(pop == x) true else false
//    }
//  }
  def isPalindrome(x: Int):Boolean = {
    if(x < 0 || (x%10 == 0&&x!=0)) return false
    else {
      var pop = x
      var bottom = 0
      while (pop > bottom){
        bottom = bottom * 10 + pop % 10
        pop /= 10
      }
      pop == bottom || pop == bottom / 10
    }
  }
}
