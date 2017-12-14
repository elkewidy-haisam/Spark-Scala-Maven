package com.learningspark.databaseinteractions

object ScalaElasticSearchInputExample {
  
  def mapWritableToInput(in: MapWritable): Map[String, String] = {  
    in.map{case (k, v) => (k.toString, v.toString)}.toMap 
  }
  
  val jobConf = new JobConf(sc.hadoopConfiguration)
  jobConf.set("mapred.output.format.class",  "org.elasticsearch.hadoop.mr.EsOutputFormat")
  jobConf.set(ConfigurationOptions.ES_RESOURCE_READ, args(1))
  jobConf.set(ConfigurationOptions.ES_NODES, args(2))
  val currentTweets = sc.hadoopRDD(jobConf,
      classOf[EsInputFormat[Object, MapWritable]], classOf[Object],  
      classOf[MapWritable])
      
  // Extract only the map 
  // Convert the MapWritable[Text, Text] to Map[String, String] 
  val tweets = currentTweets.map{ case (key, value) => mapWritableToInput(value) } 
  
  
  
}