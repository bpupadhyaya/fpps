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
