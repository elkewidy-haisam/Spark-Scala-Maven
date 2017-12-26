Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> def containsNeg(nums: List[Int]) = nums.exists(_ < 0)
containsNeg: (nums: List[Int])Boolean

scala> def containsLarge(nums: List[Int]) = nums.exists( _ > 0)
containsLarge: (nums: List[Int])Boolean

scala> println("you can write two separate functions in scala which take other functions inside them, also called higher-order functions")
you can write two separate functions in scala which take other functions inside them, also called higher-order functions

scala> :quit
PS C:\Users\Admin> Set-Alias vi notepad
PS C:\Users\Admin> vi withPrintWriter.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load withPrintWriter.scala
Loading withPrintWriter.scala...
import java.io
withPrintWriter.scala:12: error: not found: type File
def withPrintWriter(file: File, fn: PrintWriter => Unit): Unit = {
                          ^
withPrintWriter.scala:12: error: not found: type PrintWriter
def withPrintWriter(file: File, fn: PrintWriter => Unit): Unit = {
                                    ^
withPrintWriter.scala:13: error: not found: type PrintWriter
        val writer = new PrintWriter(file)
                         ^

scala> :quit
PS C:\Users\Admin> vi withPrintWriter.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load withPrintWriter.scala
Loading withPrintWriter.scala...
import java.io._
withPrintWriter: (file: java.io.File, fn: java.io.PrintWriter => Unit)Unit

scala> withPrintWriter(new File("C:/Users/Admin/Shakespeare.txt"), writer => writer.println("To be or not to be?"))

scala> withPrintWriter(new File("C:/Users/Admin/Shakespeare2.txt"), writer => writer.println("That is the question."))

scala> :quit
PS C:\Users\Admin> cat Shakespeare.txt
To be or not to be?
PS C:\Users\Admin> cat Shakespeare2.txt
That is the question.
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> def plainOldSum(a: Int, b: Int): Int = a + b
plainOldSum: (a: Int, b: Int)Int

scala> plainOldSum(2, 3)
res0: Int = 5

scala> def curriedSum(a: Int)(b: Int): Int = a + b
curriedSum: (a: Int)(b: Int)Int

scala> curriedSum(2, 3)
<console>:13: error: too many arguments (2) for method curriedSum: (a: Int)(b: Int)Int
       curriedSum(2, 3)
                     ^

scala> curriedSum(2)(3)
res2: Int = 5

scala> curriedSum(2)_
res3: Int => Int = $$Lambda$1102/1822323955@813ab53

scala> res2(3)
<console>:13: error: Int does not take parameters
       res2(3)
           ^

scala> res2(5)
<console>:13: error: Int does not take parameters
       res2(5)
           ^

scala> res3(4)
res6: Int = 6

scala> def first(x: Int) = { (y: Int) => x + y }
first: (x: Int)Int => Int

scala> println("currying is building the result as a sequence of functions")
currying is building the result as a sequence of functions

scala> first(10)
res8: Int => Int = $$Lambda$1121/941702906@73c1dda3

scala> res8(11)
res9: Int = 21

scala> res9(100)
<console>:13: error: Int does not take parameters
       res9(100)
           ^

scala> res8(100)
res11: Int = 110

scala> res8(2000)
res12: Int = 2010

scala> :load withPrintWriter.scala
Loading withPrintWriter.scala...
import java.io._
withPrintWriter: (file: java.io.File)(fn: java.io.PrintWriter => Unit)Unit

scala> withPrintWriter(new File("C:/Users/Admin/Shakespeare3.txt")) { writer =>
     |   writer.println("Beware!")
     |   writer.println("The Ides of March!")
     | }

scala> :quit
PS C:\Users\Admin> cat Shakespeare3.txt
Beware!
The Ides of March!
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load assertion.scala
warning: File `assertion.scala' does not exist.

scala> :load assertions.scala
Loading assertions.scala...
assertionsEnabled: Boolean = true
myAssert: (predicate: () => Boolean)Unit

scala> myAssert(() => 1 > 2)
java.lang.AssertionError
  at .myAssert(assertions.scala:14)
  ... 28 elided

scala> assertionsEnabled = false
assertionsEnabled: Boolean = false

scala> myAssert(() => 1 > 2)

scala> :quit
PS C:\Users\Admin> Set-Alias vi notepad
PS C:\Users\Admin> vi RecursionLoop.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load RecursionLoop.scala
Loading RecursionLoop.scala...
import scala.annotation.tailrec
fruit: (cond: => Boolean)(body: => Unit)Unit

scala> var x = 0
x: Int = 0

scala> while (x < 10) {
     |   println(x)
     |   x += 1
     | }
0
1
2
3
4
5
6
7
8
9

scala> var x = 0
x: Int = 0

scala> fruit (x < 10) {
     |   println(x)
     |   x += 1
     | }
0
1
2
3
4
5
6
7
8
9

scala>