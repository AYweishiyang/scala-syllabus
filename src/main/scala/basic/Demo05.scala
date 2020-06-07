package basic

object Demo05 {
  def main(args: Array[String]): Unit = {
    val a = 8
    a match {
      case _ if a > 2 => println("a>2")
      case _ if a > 3 => println("a>3")
    }
  }

}
