package com.learningspark.databaseinteractions

/**
 * Spark can both read and write data from Elasticsearch using ElasticSearch-Hadoop.
 * Elasticsearch is a new open source Lucene based search system. 
 * Most of the connectors we have looked at so far have written out to files, this connector instead wraps RPCs to the Elasticsearch cluster. 
 * The elastic search connector is a bit different than the other connectors we have examined, since it ignores the path information we 
 * provide instead depends on setting up configuration on our Spark context. The Elasticsearch OutputFormat connector also doesn’t quite have the types to use Spark’s wrappers, 
 * so we instead use saveAsHadoop DataSet which means we need to set more properties by hand. Lets look at how to read/ write some simple data out to Elastic Search.
 * 
 */
object ScalaElasticSearchOutputExample {
  
  import org.apache.hadoop.mapred.JobConf
  
  val jobConf = new JobConf(sc.hadoopConfiguration)
  jobConf.set("mapred.output.format.class", "org.elasticsearch.hadoop.mr.EsOutputFormat")
  joConf.setOutputCommitter(classOf[FileOutputCommitter])
  jobConf.set(ConfigurationOptions.ES_RESOURCE_WRITE, "twitter/tweets")
  jobConf.set(ConfigurationOptions.ES_NODES, "localhost")
  FileOutputFormat.setOutputPath(jobConf, new Path("-"))
  output.saveAsHadoopDataset(jobConf)
  
}