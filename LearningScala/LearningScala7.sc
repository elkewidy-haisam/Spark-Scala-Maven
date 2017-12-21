Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> var filename = "default.txt"
filename: String = default.txt

scala> val args = Array.empty[String]
args: Array[String] = Array()

scala> if (!args.isEmpty) {
     | filename = args(0)
     | }

scala> val filename = if(!args.isEmpty) args(0) else "somedefault.txt"
filename: String = somedefault.txt

scala> def gcdLoop(x: Long, y: Long): Long = {
     |   var a = x
     |   var b = y
     |   while(a != 0) {
     |      val temp = a
     |
Display all 449 possibilities? (y or n)
     |       a = b % a
     |       b = temp
     |     }
     |     b
     | }
gcdLoop: (x: Long, y: Long)Long

scala> gcdLoop(12, 8)
res1: Long = 4

scala> val linesList = List("hello", "old", "bean", "")
linesList: List[String] = List(hello, old, bean, "")

scala> val linesIter= linesList.iterator
linesIter: Iterator[String] = non-empty iterator

scala> def readLine(): String = linesIter.next()
readLine: ()String

scala> println("hello")
hello

scala> val x = println("hello")
hello
x: Unit = ()

scala> val x = while(false) { }
x: Unit = ()

scala> println("Unit is represented by () ")
Unit is represented by ()

scala> var line = ""
line: String = ""

scala> while((line = readLin()) != "") println(line)
<console>:13: error: not found: value readLin
       while((line = readLin()) != "") println(line)
                     ^

scala> while((line = readLine()) != "") println(line)
<console>:14: warning: comparing values of types Unit and String using `!=' will always yield true
       while((line = readLine()) != "") println(line)
                                 ^
hello
old
bean

java.util.NoSuchElementException: next on empty iterator
  at scala.collection.Iterator$$anon$2.next(Iterator.scala:38)
  at scala.collection.Iterator$$anon$2.next(Iterator.scala:36)
  at scala.collection.LinearSeqLike$$anon$1.next(LinearSeqLike.scala:47)
  at .readLine(<console>:12)
  ... 28 elided

scala> val x = ((line = "hi")
     |
     |
You typed two blank lines.  Starting a new command.

scala> val x = (line = "hi")
x: Unit = ()

scala> val linesIter = linesList.iterator
linesIter: Iterator[String] = non-empty iterator

scala> def readLine(): String = linesIter.next()
readLine: ()String

scala> var line = ""
line: String = ""

scala> while({line = readLine(); line} != "")
     |
     |
You typed two blank lines.  Starting a new command.

scala> while({line = readLine(); line} != "") println(line)
hello
old
bean

scala> println("A recursive method")
A recursive method

scala> def gcd(x: Long, y: Long) = if(y == 0) x else gcd(y, x % y)
<console>:12: error: recursive method gcd needs result type
       def gcd(x: Long, y: Long) = if(y == 0) x else gcd(y, x % y)
                                                     ^

scala> def gcd(x: Long, y: Long): Long = if (y == 0) x else gcd(y, x % y)
gcd: (x: Long, y: Long)Long

scala> gcd(12, 8)
res8: Long = 4

scala> import scala.annotation.tailrec
import scala.annotation.tailrec

scala> @tailrec def gcd(x: Long, y: Long): Long = if (y == 0) x else gcd(y, x % y)
gcd: (x: Long, y: Long)Long

scala> import java.io._
import java.io._

scala> val filesHere = (new java.io.File(".")).listfiles
<console>:15: error: value listfiles is not a member of java.io.File
       val filesHere = (new java.io.File(".")).listfiles
                                               ^

scala> val filesHere = (new java.io.File(".")).listFiles
filesHere: Array[java.io.File] = Array(.\.android, .\.AndroidStudio2.3, .\.bash_history, .\.config, .\.docker, .\.eclipse, .\.gitconfig, .\.gradle, .\.groovy, .\.ivy2, .\.m2, .\.nbi, .\.oracle_jre_usage, .\.p2, .\.sbt, .\.scalac, .\.scalaide, .\.scala_history, .\.sonarlint, .\.tooling, .\.viminfo, .\.VirtualBox, .\.vscode, .\.webclipse, .\.webclipse.properties, .\3D Objects, .\AndroidStudioProjects, .\AngularCourseProjectOne, .\AppData, .\Application Data, .\Build-an-Apartment-Udacity, .\caliber, .\Caliber.sql, .\caliber.wiki, .\Caliber~2.sql, .\cd, .\CheckSumAccumulator.scala, .\Chinook.sql, .\cmp-databinding-assignment-solution, .\cmp-databinding-assignment-start, .\Color Me Surprised, .\Contacts, .\Cookies, .\Desktop, .\Documents, .\Downloads, .\eclipse, .\Favorites, .\helloarg.scala...

scala> for (file <- filesHere) println(file)
.\.android
.\.AndroidStudio2.3
.\.bash_history
.\.config
.\.docker
.\.eclipse
.\.gitconfig
.\.gradle
.\.groovy
.\.ivy2
.\.m2
.\.nbi
.\.oracle_jre_usage
.\.p2
.\.sbt
.\.scalac
.\.scalaide
.\.scala_history
.\.sonarlint
.\.tooling
.\.viminfo
.\.VirtualBox
.\.vscode
.\.webclipse
.\.webclipse.properties
.\3D Objects
.\AndroidStudioProjects
.\AngularCourseProjectOne
.\AppData
.\Application Data
.\Build-an-Apartment-Udacity
.\caliber
.\Caliber.sql
.\caliber.wiki
.\Caliber~2.sql
.\cd
.\CheckSumAccumulator.scala
.\Chinook.sql
.\cmp-databinding-assignment-solution
.\cmp-databinding-assignment-start
.\Color Me Surprised
.\Contacts
.\Cookies
.\Desktop
.\Documents
.\Downloads
.\eclipse
.\Favorites
.\helloarg.scala
.\Humanity
.\Infosys
.\IntelGraphicsProfiles
.\java-jar
.\javaee-stripe
.\Links
.\Local Settings
.\mercurial.ini
.\MicrosoftEdgeBackups
.\Music
.\My Documents
.\NetHood
.\New Unity Project
.\node_modules
.\NTUSER.DAT
.\ntuser.dat.LOG1
.\ntuser.dat.LOG2
.\NTUSER.DAT{e0fff88f-d926-11e7-84aa-f8a9634799b9}.TM.blf
.\NTUSER.DAT{e0fff88f-d926-11e7-84aa-f8a9634799b9}.TMContainer00000000000000000001.regtrans-ms
.\NTUSER.DAT{e0fff88f-d926-11e7-84aa-f8a9634799b9}.TMContainer00000000000000000002.regtrans-ms
.\ntuser.ini
.\OneDrive
.\Pictures
.\Positivity.sql
.\PrintHood
.\project
.\Recent
.\RevatureProject_ERS.sql
.\Saved Games
.\ScalaDemo
.\ScalaFiles
.\Searches
.\SeleniumDemos
.\SendTo
.\Spark-Scala-Maven
.\SparkScala2
.\Start Menu
.\Tech Mahindra
.\Templates
.\TicketService
.\Videos
.\vrnd-a-maze-by-Haisam-Elkewidy-v5.0.0
.\vrnd-a-maze-starter-project-v5.0.0.zip
.\whiteboard
.\workspace
.\~

scala> val x = for (file <- filesHere) println(file)
.\.android
.\.AndroidStudio2.3
.\.bash_history
.\.config
.\.docker
.\.eclipse
.\.gitconfig
.\.gradle
.\.groovy
.\.ivy2
.\.m2
.\.nbi
.\.oracle_jre_usage
.\.p2
.\.sbt
.\.scalac
.\.scalaide
.\.scala_history
.\.sonarlint
.\.tooling
.\.viminfo
.\.VirtualBox
.\.vscode
.\.webclipse
.\.webclipse.properties
.\3D Objects
.\AndroidStudioProjects
.\AngularCourseProjectOne
.\AppData
.\Application Data
.\Build-an-Apartment-Udacity
.\caliber
.\Caliber.sql
.\caliber.wiki
.\Caliber~2.sql
.\cd
.\CheckSumAccumulator.scala
.\Chinook.sql
.\cmp-databinding-assignment-solution
.\cmp-databinding-assignment-start
.\Color Me Surprised
.\Contacts
.\Cookies
.\Desktop
.\Documents
.\Downloads
.\eclipse
.\Favorites
.\helloarg.scala
.\Humanity
.\Infosys
.\IntelGraphicsProfiles
.\java-jar
.\javaee-stripe
.\Links
.\Local Settings
.\mercurial.ini
.\MicrosoftEdgeBackups
.\Music
.\My Documents
.\NetHood
.\New Unity Project
.\node_modules
.\NTUSER.DAT
.\ntuser.dat.LOG1
.\ntuser.dat.LOG2
.\NTUSER.DAT{e0fff88f-d926-11e7-84aa-f8a9634799b9}.TM.blf
.\NTUSER.DAT{e0fff88f-d926-11e7-84aa-f8a9634799b9}.TMContainer00000000000000000001.regtrans-ms
.\NTUSER.DAT{e0fff88f-d926-11e7-84aa-f8a9634799b9}.TMContainer00000000000000000002.regtrans-ms
.\ntuser.ini
.\OneDrive
.\Pictures
.\Positivity.sql
.\PrintHood
.\project
.\Recent
.\RevatureProject_ERS.sql
.\Saved Games
.\ScalaDemo
.\ScalaFiles
.\Searches
.\SeleniumDemos
.\SendTo
.\Spark-Scala-Maven
.\SparkScala2
.\Start Menu
.\Tech Mahindra
.\Templates
.\TicketService
.\Videos
.\vrnd-a-maze-by-Haisam-Elkewidy-v5.0.0
.\vrnd-a-maze-starter-project-v5.0.0.zip
.\whiteboard
.\workspace
.\~
x: Unit = ()

scala> val x = for (file <- filesHere) yield file.getName
x: Array[String] = Array(.android, .AndroidStudio2.3, .bash_history, .config, .docker, .eclipse, .gitconfig, .gradle, .groovy, .ivy2, .m2, .nbi, .oracle_jre_usage, .p2, .sbt, .scalac, .scalaide, .scala_history, .sonarlint, .tooling, .viminfo, .VirtualBox, .vscode, .webclipse, .webclipse.properties, 3D Objects, AndroidStudioProjects, AngularCourseProjectOne, AppData, Application Data, Build-an-Apartment-Udacity, caliber, Caliber.sql, caliber.wiki, Caliber~2.sql, cd, CheckSumAccumulator.scala, Chinook.sql, cmp-databinding-assignment-solution, cmp-databinding-assignment-start, Color Me Surprised, Contacts, Cookies, Desktop, Documents, Downloads, eclipse, Favorites, helloarg.scala, Humanity, Infosys, IntelGraphicsProfiles, java-jar, javaee-stripe, Links, Local Settings, mercurial.ini, Micro...

scala> for (i <- 1 to 4) yield i * i
res10: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 4, 9, 16)

scala> 1 to 4
res11: scala.collection.immutable.Range.Inclusive = Range 1 to 4

scala> (1).to(4)
res12: scala.collection.immutable.Range.Inclusive = Range 1 to 4

scala> 1 to 20 by 4
res13: scala.collection.immutable.Range = inexact Range 1 to 20 by 4

scala> 1 to 20 by 4
res14: scala.collection.immutable.Range = inexact Range 1 to 20 by 4

scala> 20 to 1 by -2
res15: scala.collection.immutable.Range = inexact Range 20 to 1 by -2

scala> 1 until 4
res16: scala.collection.immutable.Range = Range 1 until 4

scala> 1 to 4
res17: scala.collection.immutable.Range.Inclusive = Range 1 to 4

scala> for ( 1 <- 0 to filesHere.length - 1) yield filesHere(i)
<console>:17: error: not found: value i
       for ( 1 <- 0 to filesHere.length - 1) yield filesHere(i)
                                                             ^

scala> :quit
PS C:\Users\Admin> touch hello.txt
touch : The term 'touch' is not recognized as the name of a cmdlet, function, script file, or operable program. Check
the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ touch hello.txt
+ ~~~~~
    + CategoryInfo          : ObjectNotFound: (touch:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\Admin> vi hello.txt
vi : The term 'vi' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the
spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ vi hello.txt
+ ~~
    + CategoryInfo          : ObjectNotFound: (vi:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\Admin> Set-Alias vi notepad
PS C:\Users\Admin> vi hello.txt
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> import java.io._
import java.io._

scala> val filesHere = (new File(".")).listFiles
filesHere: Array[java.io.File] = Array(.\.android, .\.AndroidStudio2.3, .\.bash_history, .\.config, .\.docker, .\.eclipse, .\.gitconfig, .\.gradle, .\.groovy, .\.ivy2, .\.m2, .\.nbi, .\.oracle_jre_usage, .\.p2, .\.sbt, .\.scalac, .\.scalaide, .\.scala_history, .\.sonarlint, .\.tooling, .\.viminfo, .\.VirtualBox, .\.vscode, .\.webclipse, .\.webclipse.properties, .\3D Objects, .\AndroidStudioProjects, .\AngularCourseProjectOne, .\AppData, .\Application Data, .\Build-an-Apartment-Udacity, .\caliber, .\Caliber.sql, .\caliber.wiki, .\Caliber~2.sql, .\cd, .\CheckSumAccumulator.scala, .\Chinook.sql, .\cmp-databinding-assignment-solution, .\cmp-databinding-assignment-start, .\Color Me Surprised, .\Contacts, .\Cookies, .\Desktop, .\Documents, .\Downloads, .\eclipse, .\Favorites, .\hello.txt, .\h...

scala> for (file <- filesHere if file.getName.endsWith(".scala")) yield file.getName
res0: Array[String] = Array(CheckSumAccumulator.scala, helloarg.scala)

scala> for (file <- filesHere
     | if file.isFile
     | if file.getName.endsWith(".scala")
     | ) yield file.getName
res1: Array[String] = Array(CheckSumAccumulator.scala, helloarg.scala)

scala> def fileLines(file: File) = scala.io.Source.fromFile(file).getLines.toList
fileLines: (file: java.io.File)List[String]

scala> def grep(pattern: String) =
     | for(
     |
     |
You typed two blank lines.  Starting a new command.

scala> val filesHere = (new File(".")).listfiles
<console>:14: error: value listfiles is not a member of java.io.File
       val filesHere = (new File(".")).listfiles
                                       ^

scala> val filesHere = (new File(".")).listfiles
<console>:14: error: value listfiles is not a member of java.io.File
       val filesHere = (new File(".")).listfiles
                                       ^

scala> val filesHere = (new File(".")).listFiles
filesHere: Array[java.io.File] = Array(.\.android, .\.AndroidStudio2.3, .\.bash_history, .\.config, .\.docker, .\.eclipse, .\.gitconfig, .\.gradle, .\.groovy, .\.ivy2, .\.m2, .\.nbi, .\.oracle_jre_usage, .\.p2, .\.sbt, .\.scalac, .\.scalaide, .\.scala_history, .\.sonarlint, .\.tooling, .\.viminfo, .\.VirtualBox, .\.vscode, .\.webclipse, .\.webclipse.properties, .\3D Objects, .\AndroidStudioProjects, .\AngularCourseProjectOne, .\AppData, .\Application Data, .\Build-an-Apartment-Udacity, .\caliber, .\Caliber.sql, .\caliber.wiki, .\Caliber~2.sql, .\cd, .\CheckSumAccumulator.scala, .\Chinook.sql, .\cmp-databinding-assignment-solution, .\cmp-databinding-assignment-start, .\Color Me Surprised, .\Contacts, .\Cookies, .\Desktop, .\Documents, .\Downloads, .\eclipse, .\Favorites, .\hello.txt, .\h...

scala> def grep(pattern: String) =
     | for (
     |   file <- filesHere
     |   if file.getName.endsWith(".scala");
     |   line <- fileLines(file)
     |   if line.trim.matches(pattern)
     | ) yield (file + ": " + line.trim)
grep: (pattern: String)Array[String]

scala> grep(".*gcd.*")
res2: Array[String] = Array()

scala> grep(".*gcd.*")
res3: Array[String] = Array()

scala> (10, "hi")
res4: (Int, String) = (10,hi)

scala> {10, "hi"}
<console>:1: error: ';' expected but ',' found.
       {10, "hi"}
          ^

scala> grep(".*for.*")
res5: Array[String] = Array(.\CheckSumAccumulator.scala: for (c <- s) acc.add(c.toByte))

scala> val x = for (i <- 1 to 10) yield i
x: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> val x = for (i <- 1 to 10) yield {
     | println("calculating " + i)
     | }
calculating 1
calculating 2
calculating 3
calculating 4
calculating 5
calculating 6
calculating 7
calculating 8
calculating 9
calculating 10
x: scala.collection.immutable.IndexedSeq[Unit] = Vector((), (), (), (), (), (), (), (), (), ())

scala> val x = for (i <- 1 to 10) {
     | println("calculating " + i)
     | yield i
<console>:3: error: ';' expected but 'yield' found.
       yield i
       ^

scala> val forline Lengths =
<console>:1: error: illegal start of simple pattern
       val forline Lengths =
                           ^

scala> val forlineLengths =
     | for {
     |    file <- filesHere
     |    if file.getName.endsWith(".scala")
     |    line <- fileLines(file)
     |    trimmed = line.trim
     |    if trimmed.matches(".*for.*")
     | } yield trimmed.length
forlineLengths: Array[Int] = Array(30)

scala> def half(n: Int): Int =
     |     if (n % 2 == 0) n/2 else throw IllegalArgumentException("not even")
<console>:15: error: object java.lang.IllegalArgumentException is not a value
           if (n % 2 == 0) n/2 else throw IllegalArgumentException("not even")
                                          ^

scala>     if (n % 2 == 0) n/2 else throw new IllegalArgumentException("not even")
<console>:15: error: not found: value n
           if (n % 2 == 0) n/2 else throw new IllegalArgumentException("not even")
               ^
<console>:15: error: not found: value n
           if (n % 2 == 0) n/2 else throw new IllegalArgumentException("not even")
                           ^

scala> def half(n: Int): Int =
     |    if (n % 2 == 0) n/2 else throw new IllegalArgumentException("not even")
half: (n: Int)Int

scala> half(4)
res7: Int = 2

scala> half(5)
java.lang.IllegalArgumentException: not even
  at .half(<console>:15)
  ... 28 elided

scala> require(5 == 6, "Well, 5 isn't 6 you wally")
java.lang.IllegalArgumentException: requirement failed: Well, 5 isn't 6 you wally
  at scala.Predef$.require(Predef.scala:277)
  ... 28 elided

scala> def half(n: Int): Int = {
     |     require(n % 2 == 0, "must be even")
     |     n / 2
     | }
half: (n: Int)Int

scala> Set-Alias vi notepad
<console>:15: error: value - is not a member of object scala.collection.immutable.Set
       Set-Alias vi notepad
          ^
<console>:15: error: not found: value Alias
       Set-Alias vi notepad
           ^
<console>:15: error: not found: value notepad
       Set-Alias vi notepad
                    ^

scala> :quit
PS C:\Users\Admin> Set-Alias vi notepad
PS C:\Users\Admin> vi TryCatch.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :quit
PS C:\Users\Admin> vi TryCatch.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> def urlFor(path: String): URL =
     |  try new URL(path)
<console>:11: error: not found: type URL
       def urlFor(path: String): URL =
                                 ^
<console>:12: error: not found: type URL
        try new URL(path)
                ^
<console>:12: warning: A try without a catch or finally is equivalent to putting its body in a block; no exceptions are handled.
        try new URL(path)
        ^

scala> def URLFor(path: String): URL =
     |  try new URL(path)
<console>:11: error: not found: type URL
       def URLFor(path: String): URL =
                                 ^
<console>:12: error: not found: type URL
        try new URL(path)
                ^
<console>:12: warning: A try without a catch or finally is equivalent to putting its body in a block; no exceptions are handled.
        try new URL(path)
        ^

scala> :quit
PS C:\Users\Admin> Set-Alias vi notepad
PS C:\Users\Admin> vi URL.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :paste
// Entering paste mode (ctrl-D to finish)


// Nothing pasted, nothing gained.


scala> :paste
// Entering paste mode (ctrl-D to finish)

import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String): URL =
   try new URL(path)
   catch {
     case e: MalformedURLException =>
       new URL("http://www.scala-lang.org")

   }


// Exiting paste mode, now interpreting.

import java.net.URL
import java.net.MalformedURLException
urlFor: (path: String)java.net.URL

scala> urlFor("http://cnn.com")
res0: java.net.URL = http://cnn.com

scala> urlFor("xyzzy")
res1: java.net.URL = http://www.scala-lang.org

scala> def matchThis(s: String): Unit = {
     | s match {
     |   case "salt" => println("pepper")
     |   case "pepper" => println("chips")
     |   case "eggs" => println("bacon")
     |   case_ => println("huh?")
     | }
     | }
<console>:18: error: missing parameter type
         case_ => println("huh?")
         ^

scala>   case _ => println("huh?")
<console>:1: error: illegal start of definition
         case _ => println("huh?")
         ^

scala> :quit
PS C:\Users\Admin> Set-Alias vi notepad
PS C:\Users\Admin> vi Match.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :paste
// Entering paste mode (ctrl-D to finish)

def matchThis(s: String): Unit = {
    s match {
        case "salt" => println("pepper")
        case "fish" => println("chips")
        case "eggs" => println("bacon")
        case _ => println("huh?")
    }
}


// Exiting paste mode, now interpreting.

matchThis: (s: String)Unit

scala> val firstArg = "chips"
firstArg: String = chips

scala> val friend =
     |      firstArg match {
     |          case "salt" => "pepper"
     |          case "chips" => "salsa"
     |          case "eggs" => "bacon"
     |          case _ => "huh?"
     |      }
friend: String = salsa

scala>