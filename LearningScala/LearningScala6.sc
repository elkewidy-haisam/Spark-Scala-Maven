Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :quit
PS C:\Users\Admin> Set-Alias vi notepad
PS C:\Users\Admin> vi CheckSumAccumulator.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load CheckSumAccumulator.class
warning: File `CheckSumAccumulator.class' does not exist.

scala> :quit
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load CheckSumAccumulator.scala
Loading CheckSumAccumulator.scala...
defined class CheckSumAccumulator

scala> val ca1 = new CheckSumAccumulator
ca1: CheckSumAccumulator = CheckSumAccumulator@7e8f23ad

scala> ca1.add(1)

scala> val ca2 = new CheckSumAccumulator
ca2: CheckSumAccumulator = CheckSumAccumulator@d978ab9

scala> ca2.add(2)

scala> ca1.add(3)

scala> ca1.checksum()
res3: Int = -4

scala> ca2.checksum()
res4: Int = -2

scala> :quit
PS C:\Users\Admin> vi CheckSumAccumulator.class
PS C:\Users\Admin> vi CheckSumAccumulator.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :quit
PS C:\Users\Admin> vi CheckSumAccumulator.scala
PS C:\Users\Admin> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :paste
// Entering paste mode (ctrl-D to finish)

class CheckSumAccumulator {

private var sum = 0

def add(b: Byte): Unit = { sum += b }

def checksum(): Int = ~(sum & 0xFF) + 1

}

import scala.collection.mutable

object CheckSumAccumulator {

private val cache = mutable.Map[String, Int]()

def calculate(s: String): Int =
if (cache.contains(s))
cache(s)
else {
val acc = new CheckSumAccumulator

for (c <- s) acc.add(c.toByte)

val cs = acc.checksum()
cache += (s -> cs)
cs


}


// Exiting paste mode, now interpreting.

     | <script>:15: error: Missing closing brace `}' assumed here
private val cache = mutable.Map[String, Int]()
^
<script>:15: error: expected start of definition
private val cache = mutable.Map[String, Int]()
        ^
<script>:17: error: expected class or object definition
def calculate(s: String): Int =
^
<script>:19: error: expected class or object definition
cache(s)
^

scala> :paste
// Entering paste mode (ctrl-D to finish)


// Nothing pasted, nothing gained.


scala> :paste
// Entering paste mode (ctrl-D to finish)

class CheckSumAccumulator {

private var sum = 0

def add(b: Byte): Unit = { sum += b }

def checksum(): Int = ~(sum & 0xFF) + 1

}

import scala.collection.mutable

object CheckSumAccumulator {

private val cache = mutable.Map[String, Int]()

def calculate(s: String): Int =
if (cache.contains(s))
cache(s)
else {
val acc = new CheckSumAccumulator

for (c <- s) acc.add(c.toByte)

val cs = acc.checksum()
cache += (s -> cs)
cs

}


// Exiting paste mode, now interpreting.

The pasted code is incomplete!

<pastie>:2: error: Missing closing brace `}' assumed here
class CheckSumAccumulator {
^

scala> :paste
// Entering paste mode (ctrl-D to finish)

class CheckSumAccumulator {

private var sum = 0

def add(b: Byte): Unit = { sum += b }

def checksum(): Int = ~(sum & 0xFF) + 1

}

import scala.collection.mutable

object CheckSumAccumulator {

private val cache = mutable.Map[String, Int]()

def calculate(s: String): Int =
if (cache.contains(s))
cache(s)
else {
val acc = new CheckSumAccumulator

for (c <- s) acc.add(c.toByte)

val cs = acc.checksum()
cache += (s -> cs)
cs

}

}

:paste

// Exiting paste mode, now interpreting.

<pastie>:33: error: ';' expected but ':' found.
:paste
^

scala> :paste
// Entering paste mode (ctrl-D to finish)

class CheckSumAccumulator {

private var sum = 0

def add(b: Byte): Unit = { sum += b }

def checksum(): Int = ~(sum & 0xFF) + 1

}

import scala.collection.mutable

object CheckSumAccumulator {

private val cache = mutable.Map[String, Int]()

def calculate(s: String): Int =
if (cache.contains(s))
cache(s)
else {
val acc = new CheckSumAccumulator

for (c <- s) acc.add(c.toByte)

val cs = acc.checksum()
cache += (s -> cs)
cs

}

}


// Exiting paste mode, now interpreting.

defined class CheckSumAccumulator
import scala.collection.mutable
defined object CheckSumAccumulator

scala> CheckSumAccumulator.calculate("hello")
res0: Int = -20

scala> :quit
PS C:\Users\Admin> vi Summer.scala
PS C:\Users\Admin> vi Summer.scala
PS C:\Users\Admin> scalac *.scala
helloarg.scala:1: error: expected class or object definition
println("hello, world")
^
one error found
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
d-r---       12/20/2017  11:50 AM                Downloads
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
d-----       12/20/2017  11:36 AM                ScalaDemo
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
-a----       12/20/2017   1:47 PM            210 .gitconfig
-a----       12/20/2017   1:48 PM           8385 .scala_history
-a----       12/15/2017   2:14 PM          14186 .viminfo
-a----       11/14/2017   8:57 AM            825 .webclipse.properties
-a----        9/15/2017   2:52 PM             83 Caliber.sql
-a----        9/15/2017   2:52 PM              0 Caliber~2.sql
-a----         8/2/2017  12:10 PM              0 cd
-a----       12/20/2017   1:47 PM            497 CheckSumAccumulator.scala
-a----        8/30/2017   2:37 PM             62 Chinook.sql
-a----       12/15/2017   3:22 PM             23 helloarg.scala
-a----         8/2/2017  12:10 PM              0 java-jar
-a----        7/12/2017   1:43 PM             72 mercurial.ini
-a----        8/23/2017   7:02 PM           4874 Positivity.sql
-a----        8/22/2017  11:57 PM            705 RevatureProject_ERS.sql
-a----       12/20/2017   1:53 PM            136 Summer.scala
-a----        9/25/2017   1:09 PM      125777761 vrnd-a-maze-starter-project-v5.0.0.zip


PS C:\Users\Admin> cd ScalaFiles
PS C:\Users\Admin\ScalaFiles> ls


    Directory: C:\Users\Admin\ScalaFiles


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
-a----       12/20/2017   1:47 PM            497 CheckSumAccumulator.scala
-a----       12/20/2017   1:53 PM            136 Summer.scala


PS C:\Users\Admin\ScalaFiles> scalac *.scala
PS C:\Users\Admin\ScalaFiles> ls


    Directory: C:\Users\Admin\ScalaFiles


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
-a----       12/20/2017   1:55 PM           3589 CheckSumAccumulator$.class
-a----       12/20/2017   1:55 PM           1585 CheckSumAccumulator.class
-a----       12/20/2017   1:47 PM            497 CheckSumAccumulator.scala
-a----       12/20/2017   1:55 PM           4398 Summer$.class
-a----       12/20/2017   1:55 PM            759 Summer$delayedInit$body.class
-a----       12/20/2017   1:55 PM            760 Summer.class
-a----       12/20/2017   1:53 PM            136 Summer.scala


PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :q
PS C:\Users\Admin\ScalaFiles> scala Summer Summer of love
Summer: -121
of: -213
love: -182
PS C:\Users\Admin\ScalaFiles> rm *.class
PS C:\Users\Admin\ScalaFiles> ls


    Directory: C:\Users\Admin\ScalaFiles


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
-a----       12/20/2017   1:47 PM            497 CheckSumAccumulator.scala
-a----       12/20/2017   1:53 PM            136 Summer.scala


PS C:\Users\Admin\ScalaFiles> fsc *.scala
PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> class Rational(n: Int, d: Int)
defined class Rational

scala> new Rational
<console>:13: error: not enough arguments for constructor Rational: (n: Int, d: Int)Rational.
Unspecified value parameters n, d.
       new Rational
       ^

scala> new Rational(1, 2)
res1: Rational = Rational@6736f40f

scala> class Rational(n: Int, d: Int) {
     |
#::                               NoSuchFieldError                  VerifyError
+:                                NoSuchFieldException              VirtualMachineError
:+                                NoSuchMethodError                 Void
::                                NoSuchMethodException             _root_
<:<                               None                              annotation
=:=                               NotImplementedError               any2ArrowAssoc
???                               NotNull                           any2Ensuring
AbstractMethodError               Nothing                           any2stringadd
Any                               Null                              any2stringfmt
AnyRef                            NullPointerException              arrayToCharSequence
AnyVal                            Number                            assert
AnyValCompanion                   NumberFormatException             assume
App                               Numeric                           augmentString
Appendable                        Object                            beans
ArithmeticException               OptManifest                       boolean2Boolean
Array                             Option                            booleanArrayOps
ArrayCharSequence                 Ordered                           booleanWrapper
ArrayIndexOutOfBoundsException    Ordering                          byte2Byte
ArrayStoreException               OutOfMemoryError                  byteArrayOps
ArrowAssoc                        Override                          byteWrapper
AssertionError                    Package                           char2Character
AutoCloseable                     Pair                              charArrayOps
BigDecimal                        PartialFunction                   charWrapper
BigInt                            PartialOrdering                   classManifest
Boolean                           PartiallyOrdered                  classOf
Boolean2boolean                   Predef                            collection
BootstrapMethodError              Process                           com
BufferedIterator                  ProcessBuilder                    compat
Byte                              Product                           concurrent
Byte2byte                         Product1                          conforms
Char                              Product10                         d
CharSequence                      Product11                         deprecated
Character                         Product12                         deprecatedInheritance
Character2char                    Product13                         deprecatedName
CheckSumAccumulator               Product14                         deprecatedOverriding
Class                             Product15                         double2Double
ClassCastException                Product16                         doubleArrayOps
ClassCircularityError             Product17                         doubleWrapper
ClassFormatError                  Product18                         exceptionWrapper
ClassLoader                       Product19                         fallbackStringCanBuildFrom
ClassManifest                     Product2                          float2Float
ClassNotFoundException            Product20                         floatArrayOps
ClassValue                        Product21                         floatWrapper
CloneNotSupportedException        Product22                         genericArrayOps
Cloneable                         Product3                          genericWrapArray
Comparable                        Product4                          identity
Compiler                          Product5                          implicitly
Console                           Product6                          inline
DelayedInit                       Product7                          instrument
Deprecated                        Product8                          int2Integer
DeprecatedConsole                 Product9                          intArrayOps
DeprecatedPredef                  Proxy                             intWrapper
Double                            Range                             invoke
Double2double                     Rational                          io
DummyImplicit                     Readable                          java
Dynamic                           ReflectiveOperationException      javafx
Either                            Responder                         javax
Ensuring                          RichException                     jdk
Enum                              Right                             jline
EnumConstantNotPresentException   Runnable                          language
Enumeration                       Runtime                           languageFeature
Equals                            RuntimeException                  locally
Equiv                             RuntimePermission                 long2Long
Error                             SafeVarargs                       longArrayOps
Exception                         ScalaReflectionException          longWrapper
ExceptionInInitializerError       SecurityException                 management
FallbackArrayBuilding             SecurityManager                   manifest
Float                             Seq                               math
Float2float                       SeqCharSequence                   n
Fractional                        SerialVersionUID                  native
Function                          Serializable                      netscape
Function0                         Set                               noinline
Function1                         Short                             optManifest
Function10                        Short2short                       oracle
Function11                        Singleton                         org
Function12                        Some                              package
Function13                        Specializable                     print
Function14                        StackOverflowError                printf
Function15                        StackTraceElement                 println
Function16                        Stream                            readBoolean
Function17                        StrictMath                        readByte
Function18                        String                            readChar
Function19                        StringBuffer                      readDouble
Function2                         StringBuilder                     readFloat
Function20                        StringCanBuildFrom                readInt
Function21                        StringContext                     readLine
Function22                        StringFormat                      readLong
Function3                         StringIndexOutOfBoundsException   readShort
Function4                         Summer                            readf
Function5                         SuppressWarnings                  readf1
Function6                         Symbol                            readf2
Function7                         System                            readf3
Function8                         Thread                            ref
Function9                         ThreadDeath                       refArrayOps
FunctionalInterface               ThreadGroup                       reflect
IllegalAccessError                ThreadLocal                       remote
IllegalAccessException            Throwable                         require
IllegalArgumentException          Traversable                       res1
IllegalMonitorStateException      TraversableOnce                   runtime
IllegalStateException             Triple                            scala
IllegalThreadStateException       Tuple1                            seqToCharSequence
Immutable                         Tuple10                           short2Short
IncompatibleClassChangeError      Tuple11                           shortArrayOps
IndexOutOfBoundsException         Tuple12                           shortWrapper
IndexedSeq                        Tuple13                           specialized
InheritableThreadLocal            Tuple14                           sun
InstantiationError                Tuple15                           swing
InstantiationException            Tuple16                           sys
Int                               Tuple17                           text
Integer                           Tuple18                           throws
Integer2int                       Tuple19                           tools
Integral                          Tuple2                            transient
InternalError                     Tuple20                           tuple2ToZippedOps
InterruptedException              Tuple21                           tuple3ToZippedOps
Iterable                          Tuple22                           unaugmentString
Iterator                          Tuple3                            unchecked
Left                              Tuple4                            unitArrayOps
LinkageError                      Tuple5                            unwrapString
List                              Tuple6                            util
Long                              Tuple7                            volatile
Long2long                         Tuple8                            wrapBooleanArray
LowPriorityImplicits              Tuple9                            wrapByteArray
Manifest                          TypeNotPresentException           wrapCharArray
Map                               UninitializedError                wrapDoubleArray
MatchError                        UninitializedFieldError           wrapFloatArray
Math                              UniquenessCache                   wrapIntArray
Mutable                           Unit                              wrapLongArray
NegativeArraySizeException        UnknownError                      wrapRefArray
Nil                               UnsatisfiedLinkError              wrapShortArray
NoClassDefFoundError              UnsupportedClassVersionError      wrapString
NoManifest                        UnsupportedOperationException     wrapUnitArray
NoSuchElementException            Vector                            xml
     |
     |
     |
You typed two blank lines.  Starting a new command.

scala> class Rational(n: Int, d: Int) {
     |    println("Debug: Created " + n + "/" + d)
     | }
defined class Rational

scala> new Rational(1, 2)
Debug: Created 1/2
res2: Rational = Rational@79b4cff

scala> :quit
PS C:\Users\Admin\ScalaFiles> vi Rational.scala
PS C:\Users\Admin\ScalaFiles> new Rational(1,2)
new : The term 'new' is not recognized as the name of a cmdlet, function, script file, or operable program. Check
the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ new Rational(1,2)
+ ~~~
    + CategoryInfo          : ObjectNotFound: (new:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> new Rational(1/2)
<console>:12: error: not found: type Rational
       new Rational(1/2)
           ^

scala> :quit
PS C:\Users\Admin\ScalaFiles> vi Rational.scala
PS C:\Users\Admin\ScalaFiles> new Rational(1, 2)
new : The term 'new' is not recognized as the name of a cmdlet, function, script file, or operable program. Check
the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ new Rational(1, 2)
+ ~~~
    + CategoryInfo          : ObjectNotFound: (new:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\Admin\ScalaFiles> new Rational(1, 0)
new : The term 'new' is not recognized as the name of a cmdlet, function, script file, or operable program. Check
the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ new Rational(1, 0)
+ ~~~
    + CategoryInfo          : ObjectNotFound: (new:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\Admin\ScalaFiles> vi Rational.scala
PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :quit
PS C:\Users\Admin\ScalaFiles>
PS C:\Users\Admin\ScalaFiles> vi Rational.scala
PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load Rational.scala
Loading Rational.scala...
defined class Rational

scala> new Rational(1, 2)
res0: Rational = 1/2

scala> new Rational(1, 0)
java.lang.IllegalArgumentException: requirement failed: zero denominator
  at scala.Predef$.require(Predef.scala:277)
  ... 29 elided

scala> val oneHalf = new Rational(1, 2)
oneHalf: Rational = 1/2

scala> val one Third = new Rational(1, 3)
<console>:1: error: illegal start of simple pattern
       val one Third = new Rational(1, 3)
                     ^

scala> val oneThird = new Rational(1, 3)
oneThird: Rational = 1/3

scala> oneHalf.add(oneThird)
res2: Rational = 5/6

scala> oneHalf add OneThird
<console>:13: error: not found: value OneThird
       oneHalf add OneThird
                   ^

scala> oneHalf add oneThird
res4: Rational = 5/6

scala> :quit
PS C:\Users\Admin\ScalaFiles> vi Rational.scala
PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :quit
PS C:\Users\Admin\ScalaFiles> vi Rational.scala
PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load Rational.scala
Loading Rational.scala...
Rational.scala:17: error: value denom is not a member of Rational
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
                              ^
Rational.scala:17: error: value numer is not a member of Rational
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
                                           ^
Rational.scala:17: error: value denom is not a member of Rational
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
                                                                       ^

scala> :quit
PS C:\Users\Admin\ScalaFiles> vi Rational.scala
PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> :load Rational.scala
Loading Rational.scala...
defined class Rational

scala> new Rational(23)
res0: Rational = 23/1

scala> oneHalf add oneThird
<console>:12: error: not found: value oneHalf
       oneHalf add oneThird
       ^
<console>:12: error: not found: value oneThird
       oneHalf add oneThird
                   ^

scala> val oneHalf = new Rational(1/2)
oneHalf: Rational = 0/1

scala> val oneThird = new Rational(1/3)
oneThird: Rational = 0/1

scala> val oneHalf = new Rational(1, 2)
oneHalf: Rational = 1/2

scala> val oneThird = new Rational(1, 3)
oneThird: Rational = 1/3

scala> oneHalf + oneThird
<console>:14: error: type mismatch;
 found   : Rational
 required: String
       oneHalf + oneThird
                 ^

scala> oneHalf add oneThird
res3: Rational = 5/6

scala> val oneHalf = new Rational(1, 2)
oneHalf: Rational = 1/2

scala> val twoNinths = new Rational(2, 9)
twoNinths: Rational = 2/9

scala> oneHalf add twoNinths
res4: Rational = 13/18

scala> :quit
PS C:\Users\Admin\ScalaFiles> vi Rational.scala
PS C:\Users\Admin\ScalaFiles> oneHalf + twoNinths
oneHalf : The term 'oneHalf' is not recognized as the name of a cmdlet, function, script file, or operable program.
Check the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ oneHalf + twoNinths
+ ~~~~~~~
    + CategoryInfo          : ObjectNotFound: (oneHalf:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala> oneHalf + twoNinths
<console>:12: error: not found: value oneHalf
       oneHalf + twoNinths
       ^
<console>:12: error: not found: value twoNinths
       oneHalf + twoNinths
                 ^

scala> :load Rational.scala
Loading Rational.scala...
defined class Rational

scala> val oneHalf = new Rational(1, 2)
oneHalf: Rational = 1/2

scala> val twoThird = new Rational(2, 3)
twoThird: Rational = 2/3

scala> oneHalf + twoThird
res1: Rational = 7/6

scala> :quit
PS C:\Users\Admin\ScalaFiles> vi Rational.scala
PS C:\Users\Admin\ScalaFiles> scala
Welcome to Scala 2.12.4 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.

scala>