package number

/**
  * Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
  */
object RomanToInteger extends App {
  def romanToInt(s: String): Int = {
    val RoManMapping :Char => Int = {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
    }
    var roManInt = 0

    for(e <- 0 until  s.length){
      if((s(e) == 'I' || s(e) == 'X' || s(e) == 'C')&&e+1< s.length &&RoManMapping(s(e)) < RoManMapping(s(e+1))){
          roManInt -=  RoManMapping(s(e))
      }
      else
        roManInt += RoManMapping(s(e))
    }
    roManInt
  }

  0.until(3).foreach(println)
  println(romanToInt("III"))
}
