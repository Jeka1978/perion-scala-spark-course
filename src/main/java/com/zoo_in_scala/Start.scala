package com.zoo_in_scala

import com.peroin.Person

/**
 * @author Evgeny Borisov
 */
object Start {
  def main(args: Array[String]): Unit = {
    val animals: List[Object] = List(new Cat, new Dog, new Cat)


    val container: Container[Person] = new Container[Person]

    container.add(new Person(name = "Adi", age = 29))

  }
}
