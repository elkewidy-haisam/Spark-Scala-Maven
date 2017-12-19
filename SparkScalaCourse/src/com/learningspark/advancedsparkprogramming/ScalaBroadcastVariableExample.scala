package com.learningspark.advancedsparkprogramming

/**
 * 
 *  Broadcast variables allow the Spark program to efficiently send a large,
 *  read-only value to all the worker nodes for use in one or more Spark operations.
 *  They come in handy, for example, if your application needs to send a large read-only
 *  lookp table to all the nodes, or even a large feature vector in a machine learning algorithm.
 *  
 *  A broadcast variable is simply an object of type spark.broadcast.Broadcast[T], which wraps a
 *  value of type T. We can access this value by calling value on the Broadcast object in our tasks. The
 *  value is sent to each node only once, using an efficient, BitTorrent-like communication mechanism.
 *  
 *  The following example demonstrates how you can lookup countries with Broadcast values.
 */
object ScalaBroadcastVariableExample {
  
  import org.apache.spark.SparkContext
  import org.apache.spark.broadcast.Broadcast
  
  
  // Lookup the countries for each call sign for the
  // contactCounts RDD.  We load an array of call sign 
  // prefixes to country code to support this lookup. 
  val signPrefixes = sc.broadcast(loadCallSignTable()) 
  val countryContactCounts = contactCounts.map{case (sign, count) => 
      val country = lookupInArray(sign, signPrefixes.value) 
      (country, count)
  }.reduceByKey((x, y) => x + y) 
  countryContactCounts.saveAsTextFile(outputDir + "/countries.txt") 
  
  
}