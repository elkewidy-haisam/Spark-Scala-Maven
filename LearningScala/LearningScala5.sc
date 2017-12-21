Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> val greetStrings = new Array[String](3)
greetStrings: Array[String] = Array(null, null, null)

scala> greetStrings(0) = "Hello"

scala> greetStrings(1) = ", "

scala> greetStrings(2) = "world!\n"

scala> for (1 <- 0 to 2)
     |    print(greetStinrgs(i))
<console>:13: error: not found: value greetStinrgs
          print(greetStinrgs(i))
                ^
<console>:13: error: not found: value i
          print(greetStinrgs(i))
                             ^

scala> for (i <- 0 to 2)
     |
Display all 443 possibilities? (y or n)
     | println(greetStrings(i))
Hello
,
world!


scala> for (i <- 0 to 2)
     | print(greetStrings(i))
Hello, world!

scala> 3.0 + 4.0
res6: Double = 7.0

scala> 3.0. + (4.0)
res7: Double = 7.0

scala> "hello".charAt(2)
res8: Char = l

scala> "hello".charAt(1)
res9: Char = e

scala> "hello" charAt 1
res10: Char = e

scala> greetStrings.apply(1)
res11: String = ", "

scala> greetStrings.update(1)
<console>:13: error: not enough arguments for method update: (i: Int, x: String)Unit.
Unspecified value parameter x.
       greetStrings.update(1)
                          ^

scala> greetStrings(1) = ", "

scala> greetStrings.update(1, " crazy ")

scala> greetStrings
res15: Array[String] =
Array(Hello, " crazy ", "world!
")

scala> val numNames = Array("zero", "one", "two")
numNames: Array[String] = Array(zero, one, two)

scala> val numNames = Array.apply("zero", "one", "two")
numNames: Array[String] = Array(zero, one, two)

scala> val numNames: Array[Int] = Array.apply("zero", "one", "two")
<console>:11: error: type mismatch;
 found   : String("zero")
 required: Int
       val numNames: Array[Int] = Array.apply("zero", "one", "two")
                                              ^
<console>:11: error: type mismatch;
 found   : String("one")
 required: Int
       val numNames: Array[Int] = Array.apply("zero", "one", "two")
                                                      ^
<console>:11: error: type mismatch;
 found   : String("two")
 required: Int
       val numNames: Array[Int] = Array.apply("zero", "one", "two")
                                                             ^

scala> List(1,2,3)
res16: List[Int] = List(1, 2, 3)

scala> List.apply(1,2,3)
res17: List[Int] = List(1, 2, 3)

scala> val oneTwo = List(1, 2)
oneTwo: List[Int] = List(1, 2)

scala> val threeFour = List(3,4)
threeFour: List[Int] = List(3, 4)

scala> oneTwo ::: threeFour
res18: List[Int] = List(1, 2, 3, 4)

scala> val oneTwoThreeFour = oneTwo ::: threeFour
oneTwoThreeFour: List[Int] = List(1, 2, 3, 4)

scala> oneTwo
res19: List[Int] = List(1, 2)

scala> threFour
<console>:12: error: not found: value threFour
       threFour
       ^

scala> threeFour
res21: List[Int] = List(3, 4)

scala> val twoThree = List(2,3)
twoThree: List[Int] = List(2, 3)

scala> 1 :: twoThree
res22: List[Int] = List(1, 2, 3)

scala> (1).::(twoThree)
<console>:13: error: value :: is not a member of Int
       (1).::(twoThree)
           ^

scala> twoThree.::(1)
res24: List[Int] = List(1, 2, 3)

scala> val nums = List(1,2,3)
nums: List[Int] = List(1, 2, 3)

scala> val nums = 1 :: 2 :: 3 :: Nil
nums: List[Int] = List(1, 2, 3)

scala> twoThree
res25: List[Int] = List(2, 3)

scala> val oneTwoThree = 1 :: twoThree
oneTwoThree: List[Int] = List(1, 2, 3)

scala> val zeroTwoThree = 0 :: twoThree
zeroTwoThree: List[Int] = List(0, 2, 3)

scala> println(" == means calling a .equals() method on an item")
 == means calling a .equals() method on an item

scala> val anotherOneTwoThree = 1 :: twoThree
anotherOneTwoThree: List[Int] = List(1, 2, 3)

scala> oneTwoThree == anotherOneTwoThree
res27: Boolean = true

scala> oneTwoThree eq anotherOneTwoThree
res28: Boolean = false

scala> oneTwoThree == zeroTwoThree
res29: Boolean = false

scala> oneTwoThree.tail = zeroTwoThree.tail
<console>:13: error: value tail_= is not a member of List[Int]
       oneTwoThree.tail = zeroTwoThree.tail
                   ^

scala> val zeroTwoThree = 0 :: twoThree
zeroTwoThree: List[Int] = List(0, 2, 3)

scala> oneTwoThree.tail = zeroTwoThree.tail
<console>:13: error: value tail_= is not a member of List[Int]
       oneTwoThree.tail = zeroTwoThree.tail
                   ^

scala> oneTwoThree.tail == zeroTwoThree.tail
res30: Boolean = true

scala> oneTwoThree.tail == zeroTwoThree.tail
res31: Boolean = true

scala> oneTwoThree.tail
res32: List[Int] = List(2, 3)

scala> oneTwoThree.tail eq zeroTwoThree.tail
res33: Boolean = true

scala> Nil
res34: scala.collection.immutable.Nil.type = List()

scala> Array(1,2,3).toList
res35: List[Int] = List(1, 2, 3)

scala> List('a', 'b', 'c').toArray
res36: Array[Char] = Array(a, b, c)

scala> Array(1,2,3).toArray
res37: Array[Int] = Array(1, 2, 3)

scala> List(1,2,3).toList
res38: List[Int] = List(1, 2, 3)

scala> List(1,2,3).toVector
res39: Vector[Int] = Vector(1, 2, 3)

scala> List(1,2,3).to[Vector]
res40: Vector[Int] = Vector(1, 2, 3)

scala> 1 :: Nil
res41: List[Int] = List(1)

scala> true :: 1 :: Nil
res42: List[AnyVal] = List(true, 1)

scala> "string" :: true :: 1 :: Nil
res43: List[Any] = List(string, true, 1)

scala> ("string", true, 1)
res44: (String, Boolean, Int) = (string,true,1)

scala> val myTup = ("string", true, 1)
myTup: (String, Boolean, Int) = (string,true,1)

scala> myTup._1
res45: String = string

scala> myTup._2
res46: Boolean = true

scala> if myTup._2) println("It's true")
<console>:1: error: '(' expected but identifier found.
       if myTup._2) println("It's true")
          ^

scala> if (myTup._2) println("It's true")
It's true

scala> if (myTup._1) println("It's true")
<console>:13: error: type mismatch;
 found   : String
 required: Boolean
       if (myTup._1) println("It's true")
                 ^

scala> myTup._3
res49: Int = 1

scala> myTup._4
<console>:13: error: value _4 is not a member of (String, Boolean, Int)
       myTup._4
             ^

scala> val (a,b,c) = myTup
a: String = string
b: Boolean = true
c: Int = 1

scala> val (a,b,_) = myTup
a: String = string
b: Boolean = true

scala> val tup6: Tuple6[Char, Char, String, Int, Int, String] = ('u', 'r', "the", 1, 4, "me")
tup6: (Char, Char, String, Int, Int, String) = (u,r,the,1,4,me)

scala> Set(1,2,3)
res51: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

scala> import scala.collection.mutable
import scala.collection.mutable

scala> mutable.set(1,2,3)
<console>:13: error: object set is not a member of package scala.collection.mutable
       mutable.set(1,2,3)
               ^

scala> mutable.Set(1,2,3)
res53: scala.collection.mutable.Set[Int] = Set(1, 2, 3)

scala> scala.collection.Set
res54: collection.Set.type = scala.collection.Set$@59720cf7

scala> val x1: scala.colletion.Set = Set(1,2,3)
<console>:12: error: object colletion is not a member of package scala
       val x1: scala.colletion.Set = Set(1,2,3)
                     ^

scala> val x1: scala.collection.Set[Int] = Set(1,2,3)
x1: scala.collection.Set[Int] = Set(1, 2, 3)

scala> val x1: scala.collection.Set[Int] = mutable.Set(1,2,3)
x1: scala.collection.Set[Int] = Set(1, 2, 3)

scala> println("use only immutable collections until you're sure that you need mutable ones; they come with risks")
use only immutable collections until you're sure that you need mutable ones; they come with risks

scala> var jetSet = Set("Boeing", "Airbus")
jetSet: scala.collection.immutable.Set[String] = Set(Boeing, Airbus)

scala> jetSet += "Lear"

scala> jetSet
res57: scala.collection.immutable.Set[String] = Set(Boeing, Airbus, Lear)

scala> jetSet.+=("Cessna")

scala> jetSet
res59: scala.collection.immutable.Set[String] = Set(Boeing, Airbus, Lear, Cessna)

scala> jetSet = jetSet + "Saab"
jetSet: scala.collection.immutable.Set[String] = Set(Airbus, Lear, Saab, Boeing, Cessna)

scala> jetSet.
&              copyToArray    genericBuilder       mkString            span           toSet
&~             copyToBuffer   groupBy              nonEmpty            splitAt        toStream
+              count          grouped              par                 stringPrefix   toString
++             diff           hasDefiniteSize      partition           subsetOf       toTraversable
++:            drop           hashCode             product             subsets        toVector
-              dropRight      head                 reduce              sum            transpose
--             dropWhile      headOption           reduceLeft          tail           union
/:             empty          init                 reduceLeftOption    tails          unzip
:\             equals         inits                reduceOption        take           unzip3
WithFilter     exists         intersect            reduceRight         takeRight      view
addString      filter         isEmpty              reduceRightOption   takeWhile      withFilter
aggregate      filterNot      isTraversableAgain   repr                to             zip
andThen        find           iterator             sameElements        toArray        zipAll
apply          flatMap        last                 scan                toBuffer       zipWithIndex
canEqual       flatten        lastOption           scanLeft            toIndexedSeq   |
collect        fold           map                  scanRight           toIterable
collectFirst   foldLeft       max                  seq                 toIterator
companion      foldRight      maxBy                size                toList
compose        forall         min                  slice               toMap
contains       foreach        minBy                sliding             toSeq

scala> val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet: scala.collection.mutable.Set[String] = Set(Poltergeist, Hitch)

scala> movieSet.
&            clone          foldLeft             maxBy               seq               toIterator
&~           collect        foldRight            min                 size              toList
+            collectFirst   forall               minBy               sizeHint          toMap
++           companion      foreach              mkString            sizeHintBounded   toSeq
++:          compose        genericBuilder       nonEmpty            slice             toSet
++=          contains       groupBy              par                 sliding           toStream
+=           copyToArray    grouped              partition           span              toString
-            copyToBuffer   hasDefiniteSize      product             splitAt           toTraversable
--           count          hashCode             reduce              stringPrefix      toVector
--=          diff           head                 reduceLeft          subsetOf          transpose
-=           drop           headOption           reduceLeftOption    subsets           union
/:           dropRight      init                 reduceOption        sum               unzip
:\           dropWhile      inits                reduceRight         tail              unzip3
<<           empty          intersect            reduceRightOption   tails             update
WithFilter   equals         isEmpty              remove              take              view
add          exists         isTraversableAgain   repr                takeRight         withFilter
addString    filter         iterator             result              takeWhile         zip
aggregate    filterNot      last                 retain              to                zipAll
andThen      find           lastOption           sameElements        toArray           zipWithIndex
apply        flatMap        map                  scan                toBuffer          |
canEqual     flatten        mapResult            scanLeft            toIndexedSeq
clear        fold           max                  scanRight           toIterable

scala> movieSet +="Shrek"
res60: movieSet.type = Set(Poltergeist, Shrek, Hitch)

scala> val jetSet = Set("Boeing", "Airbus")
jetSet: scala.collection.immutable.Set[String] = Set(Boeing, Airbus)

scala> jetSet += "Lear"
<console>:14: error: value += is not a member of scala.collection.immutable.Set[String]
  Expression does not convert to assignment because receiver is not assignable.
       jetSet += "Lear"
              ^

scala> import scala.collection.immutable.HashSet
import scala.collection.immutable.HashSet

scala> val hashSet = HashSet(1,2,3)
hashSet: scala.collection.immutable.HashSet[Int] = Set(1, 2, 3)

scala> import scala.collection.mutable
import scala.collection.mutable

scala> Set(1,2,3)
res62: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

scala> mutable.Set(1,2,3)
res63: scala.collection.mutable.Set[Int] = Set(1, 2, 3)

scala> val treasureMap = Map.empty[Int, String]
treasureMap: scala.collection.immutable.Map[Int,String] = Map()

scala> val treasureMap = mutable.Map.empty[Int, String]
treasureMap: scala.collection.mutable.Map[Int,String] = Map()

scala> treasureMap += (1 -> "Go to island.")
res64: treasureMap.type = Map(1 -> Go to island.)

scala> treasureMap += (2 -> "Find big X.")
res65: treasureMap.type = Map(2 -> Find big X., 1 -> Go to island.)

scala> treasureMap += (3 -> "Dig!")
res66: treasureMap.type = Map(2 -> Find big X., 1 -> Go to island., 3 -> Dig!)

scala> println(treasureMap(2))
Find big X.

scala> println(treasureMap.apply(2))
Find big X.

scala> treasureMap(2) = "Find the X."

scala> treasureMap.update(2, "Find the X.")

scala> treasureMap
res71: scala.collection.mutable.Map[Int,String] = Map(2 -> Find the X., 1 -> Go to island., 3 -> Dig!)

scala> 1 -> "Go to island."
res72: (Int, String) = (1,Go to island.)

scala> (1).
     | something I guess
<console>:17: error: value something is not a member of Int
possible cause: maybe a semicolon is missing before `value something'?
       something I guess
       ^
<console>:17: error: not found: value guess
       something I guess
                   ^

scala> (1).
!=   <    >>>         doubleValue   isNaN           isValidShort   shortValue       toDouble        toShort
%    <<   ^           floatValue    isNegInfinity   isWhole        signum           toFloat         unary_+
&    <=   abs         floor         isPosInfinity   longValue      to               toHexString     unary_-
*    ==   byteValue   getClass      isValidByte     max            toBinaryString   toInt           unary_~
+    >    ceil        intValue      isValidChar     min            toByte           toLong          underlying
-    >=   compare     isInfinite    isValidInt      round          toChar           toOctalString   until
/    >>   compareTo   isInfinity    isValidLong     self           toDegrees        toRadians       |

scala> any2ArrowAssoc(1)
<console>:16: warning: method any2ArrowAssoc in trait DeprecatedPredef is deprecated (since 2.11.0): use `ArrowAssoc`
       any2ArrowAssoc(1)
       ^
res74: ArrowAssoc[Int] = scala.Predef$ArrowAssoc@1

scala> any2ArrowAssoc(1).->("yo")
<console>:16: warning: method any2ArrowAssoc in trait DeprecatedPredef is deprecated (since 2.11.0): use `ArrowAssoc`
       any2ArrowAssoc(1).->("yo")
       ^
res75: (Int, String) = (1,yo)

scala> ArrowAssoc(1).->("yo")
res76: (Int, String) = (1,yo)

scala> "hello".reverse
res77: String = olleh

scala> 1 -> "yo"
res78: (Int, String) = (1,yo)

scala> "yo" -> 1
res79: (String, Int) = (yo,1)

scala> val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 - "V")
<console>:15: error: overloaded method value - with alternatives:
  (x: Double)Double <and>
  (x: Float)Float <and>
  (x: Long)Long <and>
  (x: Int)Int <and>
  (x: Char)Int <and>
  (x: Short)Int <and>
  (x: Byte)Int
 cannot be applied to (String)
       val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 - "V")
                                                                            ^

scala> val rn2 = Map((1, "I"), (2, "II"))
rn2: scala.collection.immutable.Map[Int,String] = Map(1 -> I, 2 -> II)

scala> val romanNumeral = Map((1, "I"), (2, "II"), (3, "III"), (4, "IV"), (5, "V"))
romanNumeral: scala.collection.immutable.Map[Int,String] = Map(5 -> V, 1 -> I, 2 -> II, 3 -> III, 4 -> IV)

scala> def printArgs(args: Array[String]): Unit = {
     | var i = 0
     | while (i < args.length) {
     |    println(args(i))
     |    i += 1
     |   }
     | }
printArgs: (args: Array[String])Unit

scala> printArgs(Array("hello", "there"))
hello
there

scala> def printArgs(args: Array[String]): Unit = {
     |     for(arg <- args) println(arg)
     | }
printArgs: (args: Array[String])Unit

scala> printArgs(Array("hello", "there"))
hello
there

scala> val args = Array("hello", "world")
args: Array[String] = Array(hello, world)

scala> for (arg <- args) println(arg)
hello
world

scala> args.foreach(arg => println(arg))
hello
world

scala> def formatArgs(args: Array[String]): String = args.mkString("\n")
formatArgs: (args: Array[String])String

scala> formatArgs(args)
res84: String =
hello
world

scala> res81

scala> res84
res86: String =
hello
world

scala> res84 = "hello\nworld"
<console>:16: error: reassignment to val
       res84 = "hello\nworld"
             ^

scala> res84 == "hello\nworld"
res87: Boolean = true

scala> mkdir ScalaDemo
<console>:16: error: not found: value mkdir
       mkdir ScalaDemo
       ^
<console>:16: warning: postfix operator ScalaDemo should be enabled
by making the implicit value scala.language.postfixOps visible.
This can be achieved by adding the import clause 'import scala.language.postfixOps'
or by setting the compiler option -language:postfixOps.
See the Scaladoc for value scala.language.postfixOps for a discussion
why the feature should be explicitly enabled.
       mkdir ScalaDemo
             ^

scala> Set-Alias vi Notepad
<console>:16: error: value - is not a member of object scala.collection.immutable.Set
       Set-Alias vi Notepad
          ^
<console>:16: error: not found: value Alias
       Set-Alias vi Notepad
           ^
<console>:16: error: not found: value Notepad
       Set-Alias vi Notepad
                    ^

scala> Set-Alias vi notepad
<console>:16: error: value - is not a member of object scala.collection.immutable.Set
       Set-Alias vi notepad
          ^
<console>:16: error: not found: value Alias
       Set-Alias vi notepad
           ^
<console>:16: error: not found: value notepad
       Set-Alias vi notepad
                    ^

scala> ls
<console>:16: error: not found: value ls
       ls
       ^

scala> vi readlines.scala
<console>:1: error: ';' expected but '.' found.
       vi readlines.scala
                   ^

scala> :quit
PS C:\Users\Admin> ls


    Directory: C:\Users\Admin


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----        9/16/2017   8:16 PM                .android
d-----        8/26/2017  11:21 AM                .AndroidStudio2.3
d-----        11/7/2017   4:37 PM                .config
d-----       12/15/2017  10:19 AM                .docker
d-----        6/26/2017   2:32 PM                .eclipse
d-----        8/26/2017   6:50 PM                .gradle
d-----        12/8/2017  10:04 AM                .groovy
d-----       12/13/2017  11:44 AM                .ivy2
d-----         7/3/2017  12:07 PM                .m2
d-----        12/8/2017   3:47 PM                .nbi
d-----       11/24/2017   3:15 PM                .oracle_jre_usage
d-----       12/12/2017   6:55 PM                .p2
d-----       12/13/2017  11:44 AM                .sbt
d-----       12/15/2017   3:36 PM                .scalac
d-----        12/7/2017   3:51 PM                .scalaide
d-----        12/4/2017   4:42 PM                .sonarlint
d-----        11/7/2017   4:24 PM                .tooling
d-----        12/4/2017   3:49 PM                .VirtualBox
d-----       10/12/2017  10:35 AM                .vscode
d-----       12/13/2017   9:03 AM                .webclipse
d-r---       12/16/2017   8:49 PM                3D Objects
d-----        8/26/2017   6:49 PM                AndroidStudioProjects
d-----       10/14/2017  10:19 PM                AngularCourseProjectOne
d-----       10/17/2017   8:07 AM                Build-an-Apartment-Udacity
d-----        9/26/2017  11:16 AM                caliber
d-----        9/15/2017  10:54 AM                caliber.wiki
d-----       10/15/2017   1:52 PM                cmp-databinding-assignment-solution
d-----       10/15/2017   1:23 PM                cmp-databinding-assignment-start
d-----       10/12/2017  12:11 PM                Color Me Surprised
d-r---       12/16/2017   8:49 PM                Contacts
d-r---       12/20/2017  10:37 AM                Desktop
d-r---       12/16/2017   8:49 PM                Documents
d-r---       12/19/2017   2:41 PM                Downloads
d-----       11/23/2017   4:49 PM                eclipse
d-r---       12/16/2017   8:49 PM                Favorites
d-----        12/8/2017   9:49 AM                Humanity
d-----        12/4/2017   4:42 PM                Infosys
d-----        12/8/2017   4:52 PM                javaee-stripe
d-r---       12/16/2017   8:49 PM                Links
d-r---       12/16/2017   8:49 PM                Music
d-----       11/19/2017  11:00 PM                New Unity Project
d-----        11/7/2017   3:45 PM                node_modules
d-r---        12/5/2017   2:40 PM                OneDrive
d-r---       12/16/2017   8:49 PM                Pictures
d-----       12/15/2017   3:28 PM                project
d-r---       12/16/2017   8:49 PM                Saved Games
d-r---       12/16/2017   8:49 PM                Searches
d-----       10/30/2017   1:44 PM                SeleniumDemos
d-----       12/12/2017  10:55 AM                Spark-Scala-Maven
d-----       12/12/2017  10:56 AM                SparkScala2
d-----        12/4/2017   3:28 PM                Tech Mahindra
d-----        10/4/2017   9:03 PM                TicketService
d-r---       12/16/2017   8:49 PM                Videos
d-----        9/25/2017   1:10 PM                vrnd-a-maze-by-Haisam-Elkewidy-v5.0.0
d-----        10/4/2017  10:24 AM                whiteboard
d-----       10/30/2017   1:50 PM                workspace
d-----        11/7/2017  11:05 AM                ~
-a----       12/15/2017   2:14 PM           9162 .bash_history
-a----       12/20/2017  10:36 AM            210 .gitconfig
-a----       12/20/2017  11:36 AM           6439 .scala_history
-a----       12/15/2017   2:14 PM          14186 .viminfo
-a----       11/14/2017   8:57 AM            825 .webclipse.properties
-a----        9/15/2017   2:52 PM             83 Caliber.sql
-a----        9/15/2017   2:52 PM              0 Caliber~2.sql
-a----         8/2/2017  12:10 PM              0 cd
-a----        8/30/2017   2:37 PM             62 Chinook.sql
-a----       12/15/2017   3:22 PM             23 helloarg.scala
-a----         8/2/2017  12:10 PM              0 java-jar
-a----        7/12/2017   1:43 PM             72 mercurial.ini
-a----        8/23/2017   7:02 PM           4874 Positivity.sql
-a----        8/22/2017  11:57 PM            705 RevatureProject_ERS.sql
-a----        9/25/2017   1:09 PM      125777761 vrnd-a-maze-starter-project-v5.0.0.zip


PS C:\Users\Admin> mkdir ScalaDemo


    Directory: C:\Users\Admin


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----       12/20/2017  11:36 AM                ScalaDemo


PS C:\Users\Admin> cd ScalaDemo
PS C:\Users\Admin\ScalaDemo> vi readlines.scala
vi : The term 'vi' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the
spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ vi readlines.scala
+ ~~
    + CategoryInfo          : ObjectNotFound: (vi:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\Admin\ScalaDemo> Set-Alias vi notepad
PS C:\Users\Admin\ScalaDemo> vi readlines.scala
PS C:\Users\Admin\ScalaDemo> Set-Alias vi notepad++
PS C:\Users\Admin\ScalaDemo> vi readlines.scala
vi : The term 'notepad++' is not recognized as the name of a cmdlet, function, script file, or operable program.
Check the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ vi readlines.scala
+ ~~
    + CategoryInfo          : ObjectNotFound: (notepad++:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\Admin\ScalaDemo> vi readlines.scala
vi : The term 'notepad++' is not recognized as the name of a cmdlet, function, script file, or operable program.
Check the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ vi readlines.scala
+ ~~
    + CategoryInfo          : ObjectNotFound: (notepad++:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\Admin\ScalaDemo> alias notepad="/c/Program\ Files\ \(x86\)/Notepad++/notepad++.exe"
alias : This command cannot find a matching alias because an alias with the name 'notepad=/c/Program\ Files\
\(x86\)/Notepad++/notepad++.exe' does not exist.
At line:1 char:1
+ alias notepad="/c/Program\ Files\ \(x86\)/Notepad++/notepad++.exe"
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : ObjectNotFound: (notepad=/c/Prog...+/notepad++.exe:String) [Get-Alias], ItemNotFoundE
   xception
    + FullyQualifiedErrorId : ItemNotFoundException,Microsoft.PowerShell.Commands.GetAliasCommand

PS C:\Users\Admin\ScalaDemo> Set-Alias vi notepad
PS C:\Users\Admin\ScalaDemo> vi readlines.scala
PS C:\Users\Admin\ScalaDemo> scala readlines.scala readlines.scala
22: import scala.io.Source
0:
21: if (args.length >0) {
48:     for (line <- Source.fromFile(args(0)).getLines)
37:       println(line.length + ": " + line)
1: }
0:
51: else Console.err.println("Please enter a filename")
PS C:\Users\Admin\ScalaDemo> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala>