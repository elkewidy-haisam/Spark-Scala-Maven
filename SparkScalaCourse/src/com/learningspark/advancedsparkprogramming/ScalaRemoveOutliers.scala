package com.learningspark.advancedsparkprogramming

object ScalaRemoveOutliers {
  
  // Now we can go ahead and remove outliers since those may have misreported locations 
  // first we need to take our RDD of strings and turn it into doubles. 
  
  val distanceDouble = distance.map(string => string.toDouble)
  val stats = distanceDouble.stats()
  val stddev = stats.stdev
  val mean = stats.mean
  val reasonableDistances = distanceDouble.filter(x => math.abs(x-mean) < 3 * stddev)
  println(reasonableDistances.collect().toList)
  
  
}