package com.peroin.companion_object

import java.util

import scala.util.Random

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val john = Worker("John", 20,39,44)

    val maybeTuple = Worker.unapply(john)


    val strings = new util.ArrayList[String]()



    println()
    while(true){
      val str = "abc " + Random.nextInt(1000)
      if(Random.nextInt(100)==2){

        strings.add(str)
      }
    }
  }
}
