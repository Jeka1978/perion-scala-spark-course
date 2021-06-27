package com.peroin.etl_example

import com.peroin.Person

import scala.util.Random

/**
 * @author Evgeny Borisov
 */
trait PersonRepository {

  def findPerson(): Person={
    new Person("",666)
  }
}
