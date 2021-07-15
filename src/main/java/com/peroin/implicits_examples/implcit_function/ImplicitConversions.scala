package com.peroin.implicits_examples.implcit_function

/**
 * @author Evgeny Borisov
 */
object ImplicitConversions {

  implicit def convertToPerson(name:String)=Person(name)

}
