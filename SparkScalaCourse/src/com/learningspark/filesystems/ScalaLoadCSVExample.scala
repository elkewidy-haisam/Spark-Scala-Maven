package com.learningspark.filesystems

object ScalaLoadCSVExample {
  
  import au.com.bytecode.opencsv.CSVReader
  
  val input = sc.textFile(inputFile)
  val result = input.map( line =>
    val reader = new CSVReader (new StringReader(line));
    reader.readNext();

  //If there are embedded newlines in fields we will need to load each file in full and parse the entire segment.
  //This is unfortunate as if each file is large this can easily introduce bottlenecks in loading and parsing.
  val input2 = sc.wholeTextFiles(inputFile)
  val result2 = input2.flatMap{ case (_. txt) =>
    val reader = new CSVReader(new StringReader(txt));
    reader.readAll().map(x => Person(x(0), x(1)))
  }
  
  
  
}