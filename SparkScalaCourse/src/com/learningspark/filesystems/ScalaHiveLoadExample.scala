package com.learningspark.filesystems

/**
 *  To connect Spark SQL to an existing Hive installation, you need to provide a Hive
 *  configuration. This is done by copying your hive-site.xml to Spark's conf/directory.
 *  If you want to just explore, a local Hive metastore will be used if no hive-site.xml is set,
 *  and we can easily load data into a Hive table to query later on. Spark has an example
 *  file we can load into our Hive table.
 *  
 *  
 *  NOTE: HiveContext has been deprecated. Use SparkSession.builder.enableHiveSupport instead. Since 2.0.0
 *  NOTE: If you are using a Spark version below 2.0.0, this works fine. Otherwise, replace with recommended suggestion.
 */
object ScalaHiveLoadExample {
  
  import org.apache.spark.sql.hive.HiveContext
  
  val hiveCtx = new org.apache.spark.sql.hive.HiveContext(sc)
  val rows = hiveCtx.hql("SELECT key, value FROM src")
  val keys = input.map(row => row.getInt(0))
  
  
}