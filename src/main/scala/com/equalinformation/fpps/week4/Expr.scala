package com.equalinformation.fpps.week4

/**
 * Created by bpupadhyaya on 10/1/15.
 * Write small interpreter for arithmetic expressions
 * Scope: numbers and additions only
 */
trait Expr {
  def isNumber: Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
}

class Number(n: Int) extends Expr {
  def isNumber: Boolean = true
  def isSum: Boolean = true
  def numValue: Int = n
  def leftOp: Expr = throw new Error("Number.leftOp")
  def rightOp: Expr = throw new Error("Number.rightOp")
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def isNumber: Boolean = false
  def isSum: Boolean = false
  def numValue: Int = throw new Error("Sum.numValue")
  def leftOp: Expr = e1
  def rightOp: Expr = e2

//  def eval(e: Expr): Int = {
//    if(e.isNumber) e.numValue
//    else if (e.isSum) eval(e.leftOp) + eval(e.rightOp)
//    else throw new Error("Unknown expression "+e)
//  }
}


