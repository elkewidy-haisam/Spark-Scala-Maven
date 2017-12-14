package com.learningspark.databaseinteractions

/**
 * 
 *  Spark's Cassandra support has improved greatly with the introduction of the open
 *  source Spark Cassandra connector from DataStax. Since the connector is not currently
 *  part of Spark, you will need to add some additional dependencies to your build file.
 *  Cassandra isn't exactly park of SparkSQL but it returns RDDs of CassandraRow objects,
 *  which have some of the same methods as SparkSQL's Row object.
 * 
 *  Much like with Elastic Search, the Cassandra connector reads a job property to determine which cluster to connect to. 
 *  We set the spark.cassandra.connection.host to point to our Cassandra cluster and if we have a username and password we 
 *  can set them with spark.cassandra.auth.username and spark.cassandra.auth.password. Assuming you only have a single Cassandra
 *  cluster to connect to we can set this up when we are creating our Spark context. 
 * 
 *  The Datastax Cassandra connector uses implicits in Scala to provide some additional functions on top of the SparkContext and RDDs. 
 *  Lets import the implicit conversions and try loading some data.
 *  
 *  In addition to loading an entire table we can also query subsets of our data. 
 *  We can restrict our data by adding a where clause to the cassandraTable call e.g. sc.cassan draTable(…).where("key=?", "panda").
 *  The Cassandra connector supports saving to Cassandra from a variety of RDD types. We can directly save RDDs of CassandraRow objects, which is useful for copying data between tables. 
 *  For saving RDDs that aren’t in Row form we can save RDDs of tuples and lists by specifying the column mapping. 
 * 
 */
object ScalaCassandra {
  
  /**
   * 
   * Scala set Cassandra property.
   * 
   */
  val conf = new SparkConf(true).set("spark.cassandra.connection.host", "hostname")
  
  val sc = new SparkContext(conf)
  
  /**
   * 
   * Scala load entire table as an RDD with key/value data 
   * 
   */
  //Implicits that add functions to the SparkContext & RDDs
  import com.datastax.spark.connector._
  
  // entire table as an RDD
  // assumes your table test was created as CREATE TABLE test.kv(key text PRIMARY KEY, value int); 
  val data = sc.cassandraTable("test", "kv")
  //print some basic stats on the value element
  data.map(row => row.getInt("value")).stats()
  
  //Scala save to Cassandra
  val rdd = sc.parallelize(List(Seq("moremagic", 1)))
  rdd.saveToCassandra("test", "kv", SomeColumns("key", "value"))
  
  
}