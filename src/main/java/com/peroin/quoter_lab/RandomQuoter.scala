package com.peroin.quoter_lab

import com.github.javafaker.Faker

/**
 * @author Evgeny Borisov
 */
object RandomQuoter extends Quoter {

  private val faker = new Faker()

  override def printMsg(): Unit = {
    val msg:String = faker.chuckNorris().fact()
    println(msg)
  }
}
