package com.learningspark.filesystems

/**
 *  
 * Writing the data to a sequence file in Scala:
 * 
 * Sequence files are key-value pairs, we need a PairDD with types that our sequence file can write out. Implicit conversions between Scala
 * types and Hadoop Writables exist for many native types, so if you are writing out a native type you can just save your PairRDD by calling
 * saveAsSequenceFile(path) and it will write out the data for you. If there isn't an automatic conversion from out key and value to Writable, 
 * or we want to use VarInts we can just map over the data and convert it before saving.
 *  
 */
object ScalaSaveSequenceFileExample {
  
  val data = sc.parallelize(List(("Panda", 3), ("Kay", 6), "Snail", 2)))
  data.saveAsSequenceFile(outputFile)
  
}