package com.learningspark.filesystems

/*
 * 
 *  This only works provided that we know all of hte fields that we will be outputting.
 *  However, if some of the field names are determined at runtime from user input we need to take a different approach.
 *  The simplest approach is going over all of our data and extracting the distinct keys. 
 * 
 */
object ScalaWriteCSVFileExample {
  
  import au.com.bytecode.opencsv.CSVWriter
  
  pandaLovers.map(person => List(person.name, person.favoriteAnimal). toArray)
    .mapPartitions{people =>
      val stringWriter = new StringWriter();
      val csvWriter = new CSVWriter(stringWriter);
      csvWriter.writeAll(people.toList)
      Iterator(stringWriter.toString)
  }.saveAsTextFile(outFile)
      
  
  
  
}