package com.equalinformation.fpps.week4

/**
 * Created by bpupadhyaya on 9/30/15.
 */
trait ListVariance[+T] { // Co-variant
  def isEmpty: Boolean
  def head: T
  def tail: ListVariance[T]
}

class Cons[T](val head: T, val tail: ListVariance[T]) extends ListVariance[T] {
  def isEmpty = false
}

object Nil extends ListVariance[Nothing] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

object test {
  val x: ListVariance[String] = Nil
}
