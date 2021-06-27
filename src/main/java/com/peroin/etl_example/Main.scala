package com.peroin.etl_example

import com.peroin.Person

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {

    val personService = new PersonServiceImpl(new JapanPersonRepo)
    personService.processPerson()

    val person = new PersonRepo().findPerson()

   new Person(salary = 200,name = "sadas",age = 12)
  }
}
