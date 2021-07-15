package com.peroin.quoter_lab

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val aggregator = new QuoterAggregator(List(new ShakespeareQuoter(), MessageQuoter("good to die for our country"), RandomQuoter))
    aggregator.printAll()
  }
}
