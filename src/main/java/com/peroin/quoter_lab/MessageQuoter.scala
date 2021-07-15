package com.peroin.quoter_lab

/**
 * @author Evgeny Borisov
 */
case class MessageQuoter(msg:String) extends Quoter {
  override def printMsg(): Unit = println(msg)
}
