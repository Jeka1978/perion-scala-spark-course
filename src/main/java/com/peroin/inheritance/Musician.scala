package com.peroin.inheritance

/**
 * @author Evgeny Borisov
 */
trait Musician {

  init()

  val experience:Int




  def init(): Unit ={
    MusicansManager.addMusican(this)
    println(s"musican was born and he has $experience years of expirience")
    play()
  }


  def playPiano(): Unit = {
    println("do re mi fa...")
  }

  def play(): Unit

}
