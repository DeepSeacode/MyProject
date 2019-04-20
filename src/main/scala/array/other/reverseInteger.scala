package array.other

object reverseInteger {
  def reverse(x: Int): Int = {
    val str = x.toString
    if(str.charAt(0) == '-')
      '-'+str.substring(1).reverse.toInt
    else x.toString.reverse.toInt
  }
}
