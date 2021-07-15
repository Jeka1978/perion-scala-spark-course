package com.peroin.inheritance

/**
 * @author Evgeny Borisov
 */
class Guitarist extends Musician with Serializable {
  override val experience: Int = 12

  override def play(): Unit = {
    println("playing the pink floyd guitar")
  }
}
