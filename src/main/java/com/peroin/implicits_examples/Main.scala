package com.peroin.implicits_examples


import ImplicitConstants._
/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {


    StamService.printNumber
    StamService.printNumber2
    StamService.printNumber3
  }

  def x():Unit={
    StamService.printNumber
  }
}
