package com.equalinformation.fpps.test.scala

import com.equalinformation.fpps.LogicalAndClass

import collection.mutable.Stack

/**
 * Created by bpupadhyaya on 9/8/15.
 * Unit testing for operations in LogicalAndClass
 */
class LogicalAndTest extends UnitSpec {
  def infiniteLoop: Boolean = infiniteLoop

  "and" should "produce result similar to that of logical &&" in {
    val andOperation = new LogicalAndClass
    andOperation.and(true,true) should be (true)
    andOperation.and(false,true) should be (false)
    andOperation.and(true,false) should be (false)
    andOperation.and(false,infiniteLoop) should be (false)

  }

}
