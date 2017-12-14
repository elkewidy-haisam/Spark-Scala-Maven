package com.learningspark.filesystems

/**
 * 
 *  Scala code for loading a sequence file and mapping propeties into an immutable constant.
 *  
 *  Scala has a unique API for loading sequence files. On the Spark Context we can call sequenceFile(path, KeyClass, valueClass, minPartitions).
 *  
 *  Sequence files also work with Writable classes.
 * 
 * 
 */
object ScalaLoadSequenceFileExample {
  
  
  // load sequence files into values
  val data = sc.sequenceFile(inFile, classOf[Text], classOf[IntWritable]).
    map{case (x, y) => (x.toString, y.get())}
  
  
  
}