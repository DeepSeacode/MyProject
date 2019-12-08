package array.string

import scala.collection.mutable

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 */
object IsomorphicStrings {
  def isIsomorphic(s: String, t: String): Boolean = {
    val m = new mutable.HashMap[Char,Char]()
    for(i <- s.indices){
      if(m.contains(s(i))){
        if(m(s(i))!= t(i))
          return false
      }
      else{
        if(m.values.toSet.contains(t(i)))
          return false
        m += s(i) -> t(i)
      }
    }
    true
  }
}
