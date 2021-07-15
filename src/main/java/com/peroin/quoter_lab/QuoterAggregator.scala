package com.peroin.quoter_lab

/**
 * @author Evgeny Borisov
 */
class QuoterAggregator(list: List[Quoter]) {

  def printAll(): Unit ={
    list.foreach(_.printMsg())
  }
}
