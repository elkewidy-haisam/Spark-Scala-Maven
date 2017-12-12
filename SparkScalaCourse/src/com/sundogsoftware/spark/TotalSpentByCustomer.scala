package com.sundogsoftware.spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object TotalSpentByCustomer {
  
  def parseLine(line: String) = {
    
    //split line into fields by commas
    val fields = line.split(",")
    
    //extract the customer id, item id, and amount spent on item, and convert to integers
    val customerId = fields(0).toInt
    val amountSpentOnItem = fields(2).toFloat
    
    //Create a tuple that is our result.
    (customerId, amountSpentOnItem)
    
  }
  
  def main(args: Array[String]) {
    
    //set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
    //create a SparkContext using every core of the local machine
    val sc = new SparkContext("local[*]", "TotalNumerSpentOnItemByCustomer")
    
    //load each line of the source data into an RDD
    val lines = sc.textFile("../customer-orders.csv")
    
    //use our parseLines function to convert to (customerId, itemId, amountSpentOnItem) tuples
    val rdd = lines.map(parseLine)
    
    val totalsByCustomer = rdd.reduceByKey( (x,y) => x + y )
    
    val results = totalsByCustomer.collect()
    
    results.sorted.foreach(println)
    
  }
  
  
}