package com.equalinformation.fpps.test.scala

import scala.collection.mutable.Stack

/**
 * Created by bpupadhyaya on 9/7/15.
 */
class TempTestCl extends UnitSpec {
  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[Int]
    a [NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    }
  }

}
