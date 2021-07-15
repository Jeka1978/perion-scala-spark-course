package com.peroin.implicits_examples.implcit_function

import com.peroin.implicits_examples.implcit_function.ImplicitConversions._

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val str: String = "Masha"
    str.printMyName

    "jhgkhgdkSHD".printMyName()
  }
}
