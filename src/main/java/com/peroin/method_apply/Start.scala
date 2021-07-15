package com.peroin.method_apply

/**
 * @author Evgeny Borisov
 */
object Start {
  def main(args: Array[String]): Unit = {


    val point1 = Point.apply(12,12)
    val point2 = Point(10)
    val point3 = Point(10,12)


    point1.z

    println(point1.getSum())
    println(point2.getSum())
    println(point3.getSum())
  }
}
