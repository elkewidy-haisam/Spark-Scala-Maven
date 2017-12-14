package com.learningspark.filesystems

object ScalaLoadJsonExample {
  
  import com.fasterxml.jackson.module.scala.DefaultScalaModule
  import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper
  import com.fasterxml.jackson.databind.ObjectMapper
  import com.fasterxml.jackson.databind.DeserializationFeature
  
  case class Person(name: String, lovesPandas: Boolean) //note: must be a top level class
  
  // Parse it into a specific case class. We use flatMap to handle errors
  // by returning an empty list (None) if we encounter an issue and a
  // list with one element if everything is okay (Some(_)).
  val result = input.flatMap( record => {
    
    try {
      Some(mapper.readValue(record, classOf[Person]))
    } catch {
      case e: Exception => None
    }})
    
   //this will allow you to save the JSON file as a text file
   result.filter(_.lovesPandas).map(mapper.writeValueAsString(_))
     .saveTextFile(outputFile)
    
 }