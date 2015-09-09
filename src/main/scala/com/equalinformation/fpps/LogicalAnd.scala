package com.equalinformation.fpps

/**
 * Created by bpupadhyaya on 9/8/15.
 *
 * Implement logical and without using &&
 */
object LogicalAnd {
  def main(args: Array[String]): Unit = {
    def infiniteLoop: Boolean = infiniteLoop
    def and(x: Boolean, y: => Boolean): Boolean = {
      if(x) y else false
    }
    println("true and true : "+and(true,true))
    println("true and false : "+and(true,false))
    println("false and true : "+and(false,true))
    println("false and false : "+and(false,false))
    println("false and loop : "+and(false,infiniteLoop)) //expected false because of call by name

    //TODO write scala unit tests and refactor the code
  }

}
