package com.learningspark.advancedsparkprogramming

/**
 *  
 *  Driver program, written in Scala, designed to be able to pipe to
 *  another program, written in R, that finds the distance between two points.
 * 
 * 
 * 
 */
object ScalaDriverProgramPipe {
  
  import org.apache.spark.SparkContext
  
  val sc = new SparkContext()
  
  // Computer the distance of each call using an external R program 
  // adds our script to a list of files for each node to download with this job 
  val distScript = "./src/R/finddistance.R" 
  val distScriptName = "finddistance.R" 
  sc.addFile(distScript)
  val distances = contactsContactLists.values.flatMap(x => x.map(y => 
    s"$y.contactlay,$y.contactlong,$y.mylat,$y.mylong")).pipe(Seq(
   SparkFiles.get(distScriptName))) 
  println(distances.collect().toList)
  
  
}