package com.peroin.static_without_static

/**
 * @author Evgeny Borisov
 */
class AmazonServiceImpl extends AmazonService {


  println("amazon service was created")


  override def doWork(): Unit = {
    println("Work")
  }
}
object AmazonServiceImpl{
  authenticate()

  def authenticate(): Unit = {
    println("authenticated!!!")
  }

  def apply():AmazonServiceImpl={
    new AmazonServiceImpl
  }
}
