package com.peroin.inheritance

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {

    val pianist = new Pianist(10)
    new Guitarist
    new Guitarist
    new Guitarist

    val size = MusicansManager.numberOfMusisians()
    println(size)
  }
}
