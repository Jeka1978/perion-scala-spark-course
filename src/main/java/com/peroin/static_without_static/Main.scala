package com.peroin.static_without_static

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {


    new AmazonServiceImpl
    new AmazonServiceImpl
    new AmazonServiceImpl
    new AmazonServiceImpl
    val amazonServiceImpl = AmazonServiceImpl.apply()
    val amazonServiceImpl2 = AmazonServiceImpl()
    val amazonServiceImpl3 = AmazonServiceImpl()
    val amazonServiceImpl4 = AmazonServiceImpl()
    val amazonServiceImpl5 = AmazonServiceImpl()
    amazonServiceImpl.doWork()
    amazonServiceImpl2.doWork()
    amazonServiceImpl5.doWork()
  }
}
