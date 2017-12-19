package com.learningspark.basics

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object SparkMapExample {
  
  def main(args: Array[String]) {
  
    val sc = new SparkContext()
    
    val input = sc.parallelize(List(1,2,3,4))
    val result = input.map(x => x * x)
    
    println(result)
  
  }
  
  
}