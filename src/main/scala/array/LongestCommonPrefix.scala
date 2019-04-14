package array

object LongestCommonPrefix {
  def longestCommonPrefix(strs: Array[String]): String = {
    if(strs.length == 0) return ""
    if(strs.length == 1) return strs.head
    val gobal = strs.head
    if(strs.head.length == 0) return ""
    var cur = gobal.length-1
    strs.tail.foreach(str =>{
      if(str.length == 0) return ""
      var i = 0
      var break = true
      while (cur >= i&&i<str.length&&break){
        if(gobal.charAt(i) != str.charAt(i)){
            cur = i-1
          break = false
        }
        i+=1
      }
      if(break)
        cur = i-1
    })
    gobal.substring(0,cur+1)
  }
  def main(args: Array[String]): Unit = {
    println(longestCommonPrefix(Array("aaa", "aa", "aaa")))
    println("aaa".substring(0, 2))
  }
}
