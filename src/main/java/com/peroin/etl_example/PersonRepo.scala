package com.peroin.etl_example

import com.peroin.Person

import scala.util.Random

/**
 * @author Evgeny Borisov
 */
class PersonRepo extends PersonRepository {
  override def findPerson(): Person = {
    if (Random.nextInt(10) == 5) {
      new Person(name = "Alla", age = 18)
    }
    else {
      new Person(name = "Elad", age = 38)
    }
  }
}
