package com.learningspark.advancedsparkprogramming

/**
 * 
 *  Accumulators provide a syntax for aggregating values from worker nodes back
 *  to the driver program. One of the mot common uses of accumulators is to count events that
 *  occur during job execution for debugging purposes.
 *  
 *  For example, say that we are loading a list of all of the call signs we want to retrieve
 *  logs for from a file, but we are also interested in how many lines of the input file were blank
 *  (perhaps we do not expect to see many such lines in valid input).
 * 
 *  In this example, an Accumulator[Int] called blankLines is created, and then add 1 to it
 *  whenever we see a blank line in the input. After evaluation of the transformation, we
 *  print the value of thecounter. Note that we will only see the right count after we run the
 *  saveAsTextfile action, because the transformation above it, map, is lazy, so the side-effect
 *  incrementing of the accumulator will only happen when the lazy map transformation is forced to occur
 *  by the saveAsTextFile action.
 * 
 */
object ScalaAccumulatorExample {
  
  
  import org.apache.spark.SparkContext
  
  val sc = new SparkContext()
  val file = sc.textFile("file.txt")
  
  //Create an accumulator[int] initialized to 0
  val blanklines = sc.accumulator(0)
  
  val callSigns = file.flatMap(line => {
    if (line == "") {
      blanklines += 1 //add to the accumulator
    }
    line.split(" ")
    
  })
  
  callSigns.saveAsTextFile("output.txt")
  println("Blank lines: " + blankLines.value)
  
  
  
  
}