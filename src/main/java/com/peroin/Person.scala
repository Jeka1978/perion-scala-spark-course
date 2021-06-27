package com.peroin

import scala.annotation.tailrec

/**
 * @author Evgeny Borisov
 */
class Person(val name: String,  var age: Int,salary:Int=666) extends Object {

  init


  private def init = {
    println(this.age + " was created")
    println(this.salary + " was created")
  }

  private val lastName: String = null



  def printMyName(): Unit = {


    MathUtils.printPi()

    println(s"my name is ${name}")
  }

  override def toString: String = {


    s"name: ${this.name}, age: ${this.age}"
  }
}
