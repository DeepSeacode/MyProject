package number

object ExcelSheetColumnTitle {
  def convertToTitle(n: Int): String = {
    var cur = n
    var res = ""
    while ((cur-1)/26 > 0){
      res = ((cur-1) % 26 + 'A').toChar.toString + res
      cur /= 26
    }
    res = ((cur-1) % 26 + 'A').toChar.toString + res
    res
  }

  def main(args: Array[String]): Unit = {
    println(65.toChar)
  }
}
