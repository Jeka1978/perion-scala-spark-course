package com.peroin.etl_example

/**
 * @author Evgeny Borisov
 */
class PersonServiceImpl(personRepo: PersonRepository) extends PersonService {

  override def processPerson(): Unit = {
    val person = personRepo.findPerson()
    println(person)
  }
}
