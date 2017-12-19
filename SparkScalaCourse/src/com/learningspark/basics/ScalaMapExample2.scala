package com.learningspark.basics

object ScalaMapExample2 {
  
  import org.apache.spark.SparkContext 
  
  val sc = new SparkContext()
  
  val input = sc.parallelize(List(1,2,3,4))
  val result = input.map(x => x * x)
  
  println(result)
  
  
}