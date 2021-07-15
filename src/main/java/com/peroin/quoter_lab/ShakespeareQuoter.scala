package com.peroin.quoter_lab

/**
 * @author Evgeny Borisov
 */
class ShakespeareQuoter(msg:String="2 B || ! 2 B") extends Quoter {
  override def printMsg(): Unit = println(msg)
}
