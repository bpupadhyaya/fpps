package com.equalinformation.fpps.week4

/**
 * Created by bpupadhyaya on 10/1/15.
 *
 * Write a function show that uses pattern matching to return the
 * representation of a given expression as a string
 */
trait ExprShow {
  case class Number(n: Int) extends ExprShow
  case class Sum(e1: ExprShow, e2: ExprShow) extends ExprShow
  
}
