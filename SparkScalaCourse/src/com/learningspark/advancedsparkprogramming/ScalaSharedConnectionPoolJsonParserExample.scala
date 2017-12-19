package com.learningspark.advancedsparkprogramming

/**
 * 
 * Working with data on a per-partition basis allows us to avoid redoing setup work for each data item. 
 * Operations like opening a database connection or creating a random number generator are examples of setup 
 * steps that we wish to avoid doing for each element. Spark has per-partition versions of map and foreach to 
 * help reduce the cost of these operations, by letting you run code only once for each partition of an RDD.
 * 
 * Going back to our example with call signs, there is an on-line database of HAM radio call signs we can 
 * query for a public list of their logged contacts. By using partition based operations, we can share a connection 
 * pool to this database to avoid setting up many connections, and re-use our JSON parser. We use the mapPartitions function, 
 * which gives us an iterator of the elements in each partition of the input RDD and expects us to return an iterator of our results.
 * 
 * 
 * 
 * 
 */
object ScalaSharedConnectionPoolJsonParserExample {
  
  val contactsContactLists = validSigns.distinct().mapPartitions{
    signs =>
      val mapper = createMapper()
      val client = new HttpClient()
      client.start()
      //create http request ...
      signs.map { sign =>
        createExchangeForSign(sign)
      //fetch responses
      }.map{ case (sign, exchange) =>
        (sign, readExchangecallLog(mapper, exchange))
      }.filter(x => x._2 != null) // remove empty calllogs
  }
  
  
  
}