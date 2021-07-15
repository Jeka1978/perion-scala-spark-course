package com.peroin.object_methods

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val hero = new Hero("Vladimir", 10)
    println(hero)

    val hero2 =new Hero("Vladimir", 10)

    println(hero==hero2)

    val h = hero.copy(power = 11)



    val h1 = Hero
    println(h1)

  }
}

