package com.peroin.method_apply

/**
 * @author Evgeny Borisov
 */
class Point(var x: Int, var y: Int) {

  val z:Int=5

  def printSum(): Unit = println(x + y)

  def getSum(): Int = x + y

}

object Point {
  def apply(): Point = {
    new Point(1, 2)
  }

  def apply(a: Int): Point = {
    new Point(a, a)
  }

  def apply(a: Int, b: Int): Point = {
    new Point(a, b)
  }
}