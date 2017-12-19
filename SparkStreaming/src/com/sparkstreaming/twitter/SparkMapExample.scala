package com.sparkstreaming.twitter

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object SparkMapExample {
  
  def main(args: Array[String]) {
  
    val conf = new SparkConf().setAppName("SparkMapExample")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)
    
    val input = sc.parallelize(List(1,2,3,4))
    val result = input.map(x => x * x)
    
    result.foreach(println)
    
  }
  
  
}