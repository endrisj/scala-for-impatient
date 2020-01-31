package chapter.c04

import scala.jdk.CollectionConverters

object ExerciseCh04 {

  def main(args: Array[String]): Unit = {
    e10
  }

  def e01: Unit = {
    val gizmosPrices = Map("Phone" -> 300, "watch" -> 200, "IPad" -> 200)
    val discount = 0.1
    val discountedGizmos = for ((k, v) <- gizmosPrices) yield (k, v - v * discount)
    println(discountedGizmos)
  }

  def e02: Unit = {
    val in = new java.util.Scanner(new java.io.File("src/main/scala/chapter/c03/ExerciseCh03.scala"))
    var wordCounter = collection.mutable.Map[String, Int]()
    while (in.hasNext()) {
      val word = in.next()
      if (wordCounter.contains(word)) wordCounter(word) += 1 else wordCounter += (word -> 1)
    }
    println(wordCounter.mkString("\n"))
  }

  def e03: Unit = {
    val in = new java.util.Scanner(new java.io.File("src/main/scala/chapter/c03/ExerciseCh03.scala"))
    var wordCounter = Map[String, Int]()
    while (in.hasNext()) {
      val word = in.next()
      if (wordCounter.contains(word)) {
        wordCounter += (word -> (wordCounter(word) + 1))
      } else {
        wordCounter += (word -> 1)
      }
    }
    println(wordCounter.mkString("\n"))
  }

  def e04: Unit = {
    val in = new java.util.Scanner(new java.io.File("src/main/scala/chapter/c03/ExerciseCh03.scala"))
    var wordCounter = collection.mutable.SortedMap[String, Int]()
    while (in.hasNext()) {
      val word = in.next()
      if (wordCounter.contains(word)) wordCounter(word) += 1 else wordCounter += (word -> 1)
    }
    println(wordCounter.mkString("\n"))
  }

  def e07: Unit = {
    val properties = CollectionConverters.PropertiesHasAsScala(java.lang.System.getProperties).asScala
    var longest: Int = 0
    for (k <- properties.keys if k.length > longest) longest = k.length
    val padding = s"%1$$-${longest + 1}s | %2$$s"
    for ((k, v) <- properties) println(padding.format(k, v))
  }

  def e08: Unit = {
    def minmax(values: Array[Int]): (Int, Int) = {
      var res = (Int.MaxValue, Int.MinValue)
      for (v <- values if v > res._2) res = (res._1, v)
      for (v <- values if v < res._1) res = (v, res._2)
      res
    }

    println(minmax(Array(10, 456, 2, 78, -4765)))
  }

  def e09: Unit = {
    def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
      var res = (0, 0, 0)
      for (item <- values if item < v) res = (res._1 + 1, res._2, res._3)
      for (item <- values if item == v) res = (res._1, res._2 + 1, res._3)
      for (item <- values if item > v) res = (res._1, res._2, res._3 + 1)
      res
    }
    println(lteqgt(Array(123, 234, 345, 12, 22, 66, -23423), 66))
    println(lteqgt(Array(123, 234, 345, 12, 22, 66, -23423), 67))
  }

  def e10: Unit = {
    println("Hello".zip("World"))
  }
}
