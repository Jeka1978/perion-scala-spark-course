package com.peroin.pattern_matching

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val login = Login("admin2", "123a", "123a")
    LoginValidator.validate(login)
  }
}
