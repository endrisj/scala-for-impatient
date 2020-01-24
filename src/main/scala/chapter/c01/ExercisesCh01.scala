package chapter.c01

import math._
import scala.math.BigDecimal.int2bigDecimal
import scala.math.BigInt.probablePrime
import scala.util.Random

object ExercisesCh01 {

  def main(args: Array[String]): Unit = {
    e10
  }

  def e2(): Unit = {
    val a = sqrt(3)
    val b = a * a

    println(a)
    println(b)
    println(sqrt(3))
  }

  def e4(): Unit = {
    println("crazy" * 3)
  }

  def e5(): Unit = {
    println(10 max 2)
  }

  def e6(): Unit = {
    println(2.toBigInt.pow(1024))
  }

  def e7(): Unit = {
    println(probablePrime(100, Random))
  }

  def e9(): Unit = {
    println("123123"(0))
    val a = "123123"
    println(a(a.length - 1))
  }

  def e10(): Unit = {
    val a = "abcdef"
    println(a.take(1))
    println(a.takeRight(1))
    println(a.dropRight(1))
    println(a)
  }
}
