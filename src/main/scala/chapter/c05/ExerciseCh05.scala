package chapter.c05

object ExerciseCh05 extends App {
  e04

  def e01: Unit = {
    class Counter {
      private var value = Int.MaxValue

      def increment() {
        if (value == Int.MaxValue) value = 0 else value += 1
      }

      def current = value
    }
    val counter = new Counter
    counter.increment()
    println(counter.current)

    counter.increment()
    println(counter.current)
  }

  def e02: Unit = {
    class BankAccount {
      private var balance = 0.0

      def current = balance

      def deposit(amount: Double): Unit = {
        balance += amount
      }

      def withdraw(amount: Double): Unit = {
        balance -= amount
      }
    }

    val account = new BankAccount
    account.deposit(100)
    println(account.current)

    account.withdraw(44.57)
    println(account.current)
  }

  def e03: Unit = {
    class Time(val hours: Int, val minutes: Int) {
      require(hours >= 0 && hours < 24, s"Hours must be between 0 and 23. Hour `${hours}` is invalid.")
      require(minutes >= 0 && minutes < 60, s"Minutes must be between 0 and 59. Minute `${minutes}` is invalid.")

      def before(other: Time): Boolean = {
        other.hours > hours || (other.hours == hours && other.minutes > minutes)
      }
    }

    val time1230 = new Time(12, 30)
    val time1445 = new Time(14, 45)
    println(time1230.before(time1445))
    println(time1230.before(time1230))
    println(time1445.before(time1230))

    val invalidTime = new Time(25, 45)
  }

  def e04: Unit ={

  }
}
