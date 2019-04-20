package array

/**
  * KMP
  */
object ImplementstrStr {
  def getNext(p:String):Seq[Int] = {
    val next =  new Array[Int](p.length)
    var k = -1
    var i = 0

    while (i < p.length - 1){
      if(k == -1 || p(k) == p(i)){
        k += 1
        i += 1
        next(i) = k
      }
      else{
        k = next(k)
      }
    }
    next.toSeq
  }
  def strStr(haystack: String, needle: String): Int = {
    if(haystack.length == 0 && needle.length == 0) return -1
    if(haystack.length == 0 || needle.length == 0 || haystack.length < needle.length) return -1
    val next = getNext(needle)
    var k = 0
    var j = 0
    while (j < haystack.length && k < needle.length){
      if(haystack(j) == needle(k)){
        j += 1
        k += 1
      }else{
        k = next(k)
      }
    }
    haystack.indexOf(needle)
    if(k!=needle.length)
      -1
    else j - 1
  }
}
