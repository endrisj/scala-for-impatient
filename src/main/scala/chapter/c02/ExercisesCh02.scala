package chapter.c02

object ExercisesCh02 {

  def main(args: Array[String]): Unit = {
    e11()
  }

  def e1(): Unit = {
    def signum(x: Int) = if (x >= 0) 1 else -1

    println(signum(5))
    println(signum(-15))
  }

  def e2(): Unit = {
    println({})
    println({}.getClass)
  }

  def e3(): Unit = {
    var x: Unit = null
    var y = 11

    x = y = 1

    println(x)
    println(y)
  }

  def e4(): Unit = {
    for (i <- (0 to 10).reverse) println(i)
  }

  def e5(n: Int) {
    for (i <- (0 to n).reverse) println(i)
  }

  def e6(): Unit = {
    val ch = "Hello"
    ch.chars().forEach(println(_))
    //    var i: Int = ch
    //    println(ch.to)
  }

  def e10(x: Int, n: Int): Double = {
    if (n > 0 && n % 2 == 0) {
      Math.pow(x, n / 2) * Math.pow(x, n / 2)
    } else if (n > 0 && n % 2 == 1) {
      x * Math.pow(x, n - 1)
    } else if (n == 0) {
      1
    } else {
      1 / Math.pow(x, -n)
    }
  }

  def e11(): Unit = {
    def dateInterpolator(sc: StringContext) {
      sc.parts.foreach(println(_))
    }
    dateInterpolator(new StringContext("2020", "01", "24"))
  }
}
