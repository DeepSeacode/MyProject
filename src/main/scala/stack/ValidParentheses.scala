package stack

object ValidParentheses {
  def isValid(s: String): Boolean = {
    if(s.length == 0) return true
    if(s.length % 2 == 1) return false
    var i = 1
    var j = 0
    val stk = new Array[Char](s.length/2+1)
    stk(i) = s(j)
    j+=1
    while (j < s.length){
      s(j) match {
        case ')' if stk(i) != '(' => return false
        case ']' if stk(i) != '[' => return false
        case '}' if stk(i) != '{' => return false
        case ')' if stk(i) == '(' => i -= 1
        case ']' if stk(i) == '[' => i -= 1
        case '}' if stk(i) == '{' => i -= 1
        case _ if i == stk.length - 1 => return false
        case _ => i += 1; stk(i) = s(j)
      }
      j+=1
    }
    i == 0
  }
}
