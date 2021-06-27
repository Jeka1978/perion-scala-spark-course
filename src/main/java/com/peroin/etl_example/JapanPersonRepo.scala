package com.peroin.etl_example

import com.peroin.Person

import scala.util.Random

/**
 * @author Evgeny Borisov
 */
class JapanPersonRepo extends PersonRepository {
  override def findPerson(): Person = {
    if (Random.nextInt(10) == 5) {
      new Person(name = "Lee", age = 18)
    }
    else {
      new Person(name = "Chang", age = 38)
    }
  }
}
