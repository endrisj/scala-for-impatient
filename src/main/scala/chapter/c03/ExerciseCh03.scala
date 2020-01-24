package chapter.c03

import scala.collection.mutable.ArrayBuffer

object ExerciseCh03 {

  def main(args: Array[String]): Unit = {
    e8()
  }

  def e1(): Unit = {
    val n = 12
    val a = new Array[Int](n)
    for (i <- 0 until n) a(i) = i
    println(a.mkString(", "))
  }

  def e2(): Unit = {
    val a = Array(1, 2, 3, 4, 5, 6)
    for (i <- 0 until a.length / 2) {
      val firstPosition = i * 2
      val secondPosition = i * 2 + 1
      val tmp = a(firstPosition)
      a(firstPosition) = a(secondPosition)
      a(secondPosition) = tmp
    }
    println(a.mkString(", "))
  }

  def e3(): Unit = {
    val a = Array(1, 2, 3, 4, 5, 6)
    val b = for (i <- 0 to a.length / 2; j <- (0 to 1).reverse if i * 2 + j < a.length) yield a(i * 2 + j)
    println(a.mkString(", "))
    println(b.mkString(", "))
  }

  def e4(): Unit = {
    val a = Array(0, 1, -5, 4, 88, -89, 456, 0, -5555)
    val b = new ArrayBuffer[Int]()
    for (i <- a.indices if a(i) > 0) b += a(i)
    for (i <- a.indices if a(i) <= 0) b += a(i)
    println(b.mkString(", "))
  }

  def e5(): Unit = {
    val a = Array(0.5, 0.75, 1, 1.25)
    println(a.sum / a.length)
  }

  def e6(): Unit = {
    val a = Array(0, 1, -5, 4, 88, -89, 456, 0, -5555)
    val b = ArrayBuffer(0, 1, -5, 4, 88, -89, 456, 0, -5555)
    a.sortInPlaceWith(_ > _)
    b.sortInPlaceWith(_ > _)

    println(a.mkString(", "))
    println(b.mkString(", "))
  }

  def e7(): Unit = {
    val a = Array(0, 1, -5, 4, 88, -89, 456, 0, -5555)
    println(a.distinct.mkString(", "))
  }

  def e8(): Unit = {

  }
}
