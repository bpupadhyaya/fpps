package com.equalinformation.fpps

/**
 * Created by bpupadhyaya on 9/8/15.
 */
class LogicalAndClass {
  def and(x: Boolean, y: => Boolean): Boolean = {
    if(x) y else false
  }
}
