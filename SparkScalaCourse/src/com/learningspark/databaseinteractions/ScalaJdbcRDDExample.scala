package com.learningspark.databaseinteractions

object ScalaJdbcRDDExample {
  
  def createConnection() = {
    
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    DriverManager.getConnection("a jdbc connection would go here");
    
  }
  
  def extractValues(r: ResultSet) = {
    
    (r.getInt(1), r.getString(2))
    
  }
  
  val data = new JdbcRDD(sc,
      createConnection, "SELECT * FROM panda WHERE ? <= id AND ID <= ?",
      lowerBound = 1, upperBound = 3, numPartitions = 2, mapRow = extractValues)
  
  println(data.collect().toList)
  
  
}