package com.peroin.pattern_matching

/**
 * @author Evgeny Borisov
 */
object LoginValidator {


  def validate(login: Object): Unit = {
    val answer = login match {
      case Login("admin", _, _) => "admin can't be username"
      case Login(_, pass, _) if (pass.startsWith("z")) => s"pass can't be $pass"
      case Login(name, pass, _) if (name == pass) => s"username must not be equal to paswword $pass"
      case Login(_, pass, _) if (pass.forall(letter => letter.isDigit)) => s"your password is only digits: $pass"
      case Login(_, pass, conf) if pass != conf => s" pass: $pass and conf:$conf"
      case x => s"OK your ${x} is good"
    }
    println(answer)
  }
}
