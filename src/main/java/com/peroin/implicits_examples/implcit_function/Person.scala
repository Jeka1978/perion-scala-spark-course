package com.peroin.implicits_examples.implcit_function

/**
 * @author Evgeny Borisov
 */
case class Person(name: String) {

  def printMyName():Unit=println(s"my name is: $name")
}
