package com.equalinformation.fpps.week2

/**
 * Created by bpupadhyaya on 9/10/15.
 */
object TailRecursiveGenericSum extends App {
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }
  println(sum(x => x * x, 3, 5))
  println(sum(x => x * x * x, 1, 2))
  println(sum(x => (x - 1) * (x - 1) * (x - 1), 2, 3))

/*  def main(args: Array[String]): Unit = {
    println(sum(x => x * x, 3, 5))
  }*/
}
