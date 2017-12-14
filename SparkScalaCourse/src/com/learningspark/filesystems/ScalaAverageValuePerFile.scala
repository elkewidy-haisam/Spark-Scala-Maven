package com.learningspark.filesystems

object ScalaAverageValuePerFile {
  
  
  val input = sc.wholeTextFiles(some file)
  val result = input.mapValues{ y =>
    val nums = y.split(" ").map(x => x.toDouble)
    nums.sum / nums.size.toDouble
  }
  
  result.saveTextAsFile(outputFile)
  
}