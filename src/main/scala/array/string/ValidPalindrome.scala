package array.string

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
object ValidPalindrome {
  def isPalindrome(s: String): Boolean = {
    if(s == null || s.length <= 1) return true
    var i = 0
    var j = s.length - 1
    while (i < j){
      while (i < j && !s(i).isLetterOrDigit){
        i += 1
      }
      while (i < j && !s(j).isLetterOrDigit){
        j -= 1
      }
      if(i == j) return true
      if(i > j) return false
      if(s(i).toLower != s(j).toLower){
        return false
      }
      i += 1
      j -= 1
    }

    true

  }

  def main(args: Array[String]): Unit = {
    val s = ".."
    println(isPalindrome(s))
  }
}
