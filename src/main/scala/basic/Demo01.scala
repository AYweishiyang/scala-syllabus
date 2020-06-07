package basic

import scala.io.StdIn

object Demo01 {
  def main(args: Array[String]): Unit = {
//    println("shuru")
//    val name = StdIn.readLine()
//    println(name)

    val res = for(i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      }else {
        "不是偶数"
      }
    }
    val num = 9
    for (i <- 1 to num) { //确定行数
      for (j <- 1 to i) {//确定列数
        printf("%d * %d = %d\t" , j , i , i * j)
      }
      println()
    }

    println(res)
  }
}
