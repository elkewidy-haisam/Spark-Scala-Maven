Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load LongLines.scala
warning: File `LongLines.scala' does not exist.

scala> :quit
PS C:\Users\Admin> Set-Alias vi notepad
PS C:\Users\Admin> vi LongLines.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load LongLines.scala
Loading LongLines.scala...
import scala.io.Source
defined object LongLines

scala> LongLines.processFile("LongLines.scala", 50)
LongLines.scala: def processFile(filename: String, width: Int): Unit = {
LongLines.scala: private def processLine(filename: String, width: Int, line: String): Unit = {

scala> :quit
PS C:\Users\Admin> vi LongLines.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> LongLines.
     |
     |
You typed two blank lines.  Starting a new command.

scala> :load LongLines.scala
Loading LongLines.scala...
import scala.io.Source
defined object LongLines

scala> LongLines.processFile
   def processFile(filename: String,width: Int): Unit

scala> LongLines.
     |
     |
You typed two blank lines.  Starting a new command.

scala> :quit
PS C:\Users\Admin> vi LongLines.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load LongLines
warning: File `LongLines' does not exist.

scala> println("scope can be narrowed down to exactly what you are creating. You don't have to repeat variable names in methods already nested inside other methods/functions")
scope can be narrowed down to exactly what you are creating. You don't have to repeat variable names in methods already nested inside other methods/functions

scala> :LongLines.scala
:LongLines.scala: no such command.  Type :help for help.

scala> :load LongLines.scala
Loading LongLines.scala...
import scala.io.Source
LongLines.scala:16: error: not found: value processLineFun
                val processLineFun(line: String): Unit = {
                    ^
LongLines.scala:24: error: not found: value processLineFun
                processLineFun(filename, width, line)
                ^

scala> :load LongLines.scala
Loading LongLines.scala...
import scala.io.Source
defined object LongLines

scala> LongLines.processFile("LongLines", 50)
LongLines: def processFile(filename: String, width: Int): Unit = {
LongLines: val source = Source.fromFile(filename + extension)

scala> (x: Int) => x + 1
res2: Int => Int = $$Lambda$1166/1760715967@6baee63b

scala> val incr = (x: Int) => x + 1
incr: Int => Int = $$Lambda$1167/814071547@62264d4f

scala> incr(1)
res3: Int = 2

scala> valincr = (x: Int) => {
     |    println("We are here!")
     |    x + 100
     | }
<console>:14: error: not found: value valincr
       valincr = (x: Int) => {
       ^
<console>:18: error: not found: value valincr
       val $ires0 = valincr
                    ^

scala> val incr = (x: Int) => {
     |   println("We are here!")
     |   x + 100
     | }
incr: Int => Int = $$Lambda$1177/1550093880@6bc8d8bd

scala> incr(2)
We are here!
res4: Int = 102

scala> val someNums = List(-9.-7.-5.-3.-1, 0, 1, 2, 3, 5, 6, 9)
<console>:1: error: ')' expected but integer literal found.
       val someNums = List(-9.-7.-5.-3.-1, 0, 1, 2, 3, 5, 6, 9)
                               ^

scala> val someNums = List(-9. -7. -5, -3, 1, 3, 5, 7, 9)
<console>:1: error: ')' expected but integer literal found.
       val someNums = List(-9. -7. -5, -3, 1, 3, 5, 7, 9)
                                ^

scala> val someNums = List(-9. -7, -5, -3, 1, 3, 5, 7, 9)
<console>:1: error: ')' expected but integer literal found.
       val someNums = List(-9. -7, -5, -3, 1, 3, 5, 7, 9)
                                ^

scala> val someNums = List(9, 7, 5, 3, 1, 3, 5, 7, 9)
someNums: List[Int] = List(9, 7, 5, 3, 1, 3, 5, 7, 9)

scala> someNums.foreach(x: Int) => println(x))
<console>:1: error: ';' expected but '=>' found.
       someNums.foreach(x: Int) => println(x))
                                ^

scala> someNums.foreach((x: Int) => println(x))
9
7
5
3
1
3
5
7
9

scala> someNums.filter((x: Int) => x > 0)
res6: List[Int] = List(9, 7, 5, 3, 1, 3, 5, 7, 9)

scala> someNums.filter((x) => x < 0)
res7: List[Int] = List()

scala> someNums.filter(x => x < 0)
res8: List[Int] = List()

scala> someNums.filter(_ < 0)
res9: List[Int] = List()

scala> someNums.filter(_ > 0)
res10: List[Int] = List(9, 7, 5, 3, 1, 3, 5, 7, 9)

scala> println("underscore is considered a blank placeholder, it will eventually be filled with something")
underscore is considered a blank placeholder, it will eventually be filled with something

scala> someNums.filter((_ : Int) < 0)
res12: List[Int] = List()

scala> someNums.filter(( _ : Int) > 0)
res13: List[Int] = List(9, 7, 5, 3, 1, 3, 5, 7, 9)

scala> val addem = (x: Int, y: Int) => x + y
addem: (Int, Int) => Int = $$Lambda$1195/697272373@60bd3a8b

scala> addem(1, 2)
res14: Int = 3

scala> val addem = _ + _
<console>:14: error: missing parameter type for expanded function ((x$1: <error>, x$2) => x$1.$plus(x$2))
       val addem = _ + _
                   ^
<console>:14: error: missing parameter type for expanded function ((x$1: <error>, x$2: <error>) => x$1.$plus(x$2))
       val addem = _ + _
                       ^

scala> println("you can give types to placeholders. You have to, otherwise the Scala Interpreter will not understand what you are trying to do.")
you can give types to placeholders. You have to, otherwise the Scala Interpreter will not understand what you are trying to do.

scala> val addem = (_ : Int) + (_ : Int)
addem: (Int, Int) => Int = $$Lambda$1207/470254417@758836f6

scala> addem(2, 3)
res16: Int = 5

scala> object Summer {
     |    def su(a: Int, b: Int, c: Int) = a + b + c
     | }
defined object Summer

scala> Summer.sum(1, 2, 3)
<console>:16: error: value sum is not a member of object Summer
       Summer.sum(1, 2, 3)
              ^

scala> object Summer {
     |    def sum(a: Int, b: Int, c: Int) = a + b + c
     | }
defined object Summer

scala> Summer.sum(1, 2, 3)
res18: Int = 6

scala> val addem = (a: Int, b: Int, c: Int) => Summer.sum(a, b, c)
addem: (Int, Int, Int) => Int = $$Lambda$1219/649991639@157a0109

scala> addem(1, 2, 3)
res19: Int = 6

scala> println("converting function literal into a function value")
converting function literal into a function value

scala> val addem = Summer.sum(_, _, _)
addem: (Int, Int, Int) => Int = $$Lambda$1225/204045842@19d506c

scala> addem(1, 2, 3)
res21: Int = 6

scala> val addem = Summer.sum _
addem: (Int, Int, Int) => Int = $$Lambda$1229/1873710036@456bff44

scala> addem(1, 2, 3)
res22: Int = 6

scala> val addem = Summer.sum(1, _, 3)
<console>:15: error: missing parameter type for expanded function ((x$1: <error>) => Summer.sum(1, x$1, 3))
       val addem = Summer.sum(1, _, 3)
                                 ^

scala> val addem = Summer.sum(1, (_ : Int), 3)
addem: Int => Int = $$Lambda$1230/643495655@754ecc69

scala> val addem = (b: Int) => Summer.sum(1, b, 3)
addem: Int => Int = $$Lambda$1231/153097013@461e3e5

scala> val addem = Summer.sum(1, (_ : Int), 3)
addem: Int => Int = $$Lambda$1232/1477562194@10ecd658

scala> val addem = (b: Int) => Summer.sum(1, b, 3)
addem: Int => Int = $$Lambda$1233/1711902658@64f6183e

scala> addem(2)
res23: Int = 6

scala> addem(20)
res24: Int = 24

scala> val addem = Summer.sum(100, _ : Int, _ : Int)
addem: (Int, Int) => Int = $$Lambda$1234/1506456959@46aa0289

scala> addem(3, 4)
res25: Int = 107

scala> println("partially applied functions: you are only adding the variables you know and leaving the others as placeholders (or underscores)")
partially applied functions: you are only adding the variables you know and leaving the others as placeholders (or underscores)

scala> Summer.sum
<console>:16: error: missing argument list for method sum in object Summer
Unapplied methods are only converted to functions when a function type is expected.
You can make this conversion explicit by writing `sum _` or `sum(_,_,_)` instead of `sum`.
       Summer.sum
              ^

scala> Summer.sum(1, 2, 3)
res28: Int = 6

scala> Summer.sum _
res29: (Int, Int, Int) => Int = $$Lambda$1237/1824116478@2b254e2e

scala> Summer.sum(100, _ : Int, _ : Int)
res30: (Int, Int) => Int = $$Lambda$1238/531277793@c20848b

scala> someNums.foreach(println)
9
7
5
3
1
3
5
7
9

scala> someNums foreach println
9
7
5
3
1
3
5
7
9

scala> println("either option works")
either option works

scala> val addMore = (x: Int) => x + more
<console>:14: error: not found: value more
       val addMore = (x: Int) => x + more
                                     ^

scala> var more = 1
more: Int = 1

scala> val addMore = (x: Int) => x + more
addMore: Int => Int = $$Lambda$1252/216880753@1f0d5dec

scala> println("function is called a closure, because it uses stuff that isn't actually passed into it")
function is called a closure, because it uses stuff that isn't actually passed into it

scala> more = 100
more: Int = 100

scala> addMore(25)
res35: Int = 125

scala> println("watch out for how you change your var values")
watch out for how you change your var values

scala> def makeMoreFun(howMuchMore: Int) = { (x: Int) => x + howMuchMore }
makeMoreFun: (howMuchMore: Int)Int => Int

scala> val add1 = makeMoreFun(1)
add1: Int => Int = $$Lambda$1256/2123086977@4eccdaec

scala> val add100 = makeMoreFun(100)
add100: Int => Int = $$Lambda$1256/2123086977@79f4a9d1

scala> def echo(arg: String): Unit = { println(arg) }
echo: (arg: String)Unit

scala> echo("echo")
echo

scala> def echo(arg: Array[String]): Unit = { println(arg) }
echo: (arg: Array[String])Unit

scala> echo("echo")
<console>:16: error: type mismatch;
 found   : String("echo")
 required: Array[String]
       echo("echo")
            ^

scala> def echo(args: Array[String]): Unit = {
     |   for (arg <- args) println(arg)
     | }
echo: (args: Array[String])Unit

scala> echo(Array("hello", "gentle", "viewer")
     | )
hello
gentle
viewer

scala> def echo(args: String*): Unit = {
     |   for (arg <- args) println(arg)
     | }
echo: (args: String*)Unit

(i-search)`':