package com.zoo_in_scala

/**
 * @author Evgeny Borisov
 */
class Container[E] {
  def add(element: E): Unit = {

    println(s"$element was added")
  }


}
