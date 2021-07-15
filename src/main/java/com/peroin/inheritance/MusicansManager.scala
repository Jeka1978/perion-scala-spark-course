package com.peroin.inheritance

import scala.collection.mutable.ListBuffer

/**
 * @author Evgeny Borisov
 */
object MusicansManager {


  private val list: ListBuffer[Musician] = new ListBuffer[Musician]

  def addMusican(musician: Musician): Unit = {
    this.list.append(musician)
  }

  def numberOfMusisians(): Int = list.size

}
