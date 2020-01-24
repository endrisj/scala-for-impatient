package chapter.c01

object Chapter01 {

  def main(args: Array[String]): Unit = {
    println("Hello, world!".toUpperCase)
    println(1 to 10)

    val a = "aba".sorted
    val b = "1234567890"
    println(b(1))
    println(b(5))
  }



}
