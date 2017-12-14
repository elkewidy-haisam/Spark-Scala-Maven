package com.learningspark.filesystems

/**
 * 
 *  To read in a file using the new Hadoop API, Spark needs to know a few things:
 *  
 *  The newAPIHadoopFile takes a path, and three classes. The first class is the "format" class,
 *  this is the class representing our input format. The next class is the class for out, and the final
 *  class is the class for value. If we need to specify additional Hadoop configuration properties we can also
 *  pass in a conf object.
 *  
 *  
 * 
 */
object ScalaLoadKeyValueTextInputFormatFromHadoop {
  
  val input = sc.hadoopFile[Text, Text, KeyValueTextInputFormat](inputFile).map{
    
    case (x, y) => (x.toString, y.toString)
    
  }
  
  
  //LzoJsonInput Format:
  val input2 = sc.newHadoopFile(inputFile, classOf[LzoJsonInputFormat], classOf[LongWritable], classOf[MapWritable], conf)
  
  
  
  
}