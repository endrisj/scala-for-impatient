package chapter.c05

object ExerciseCh05 extends App {
  e02

  def e01: Unit = {
    class Counter {
      private var value = Int.MaxValue
      def increment() { if (value == Int.MaxValue) value = 0 else value += 1 }
      def current = value
    }
    val counter = new Counter
    counter.increment()
    println(counter.current)

    counter.increment()
    println(counter.current)
  }

  def e02: Unit = {

  }
}
