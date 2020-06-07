package basic

object Function {
  def main(args: Array[String]): Unit = {
//    def play = 1
    def play1(a1:Int, a2:Int): String = {
      String.valueOf(a1+a2)
    }
    def shout3(content: String) = {
      if (content.length >= 3)
        content + "喵喵喵~"
      else
        3
    }
    println(shout3(" "))
  }
}
