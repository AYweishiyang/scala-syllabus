package basic

object Demo02 {
  def main(args: Array[String]): Unit = {
    val f = 1
    def fbn(n:Int): Int ={
      if(n==1&&n==2){
        1
      }else{
        fbn(n-1)+fbn(n-2)//when n=3,
      }

    }
  }

}
