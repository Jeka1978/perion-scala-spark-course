package com.peroin.implicits_examples

/**
 * @author Evgeny Borisov
 */
object StamService {

  def printNumber(implicit x:Int):Unit=println(x)
  def printNumber2(implicit x:Int):Unit=println(x*10)
  def printNumber3(implicit x:Int):Unit=println(x*100)

}
