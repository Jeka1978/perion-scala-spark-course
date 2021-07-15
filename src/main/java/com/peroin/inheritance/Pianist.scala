package com.peroin.inheritance

/**
 * @author Evgeny Borisov
 */
class Pianist(val experience: Int) extends Musician {

    override def play(): Unit = {
      this.playPiano()

  }
}
