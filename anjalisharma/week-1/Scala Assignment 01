/*Some interesting things that you can try :
In Scala REPL, type 3 : followed by a tab key and see what methods can be applied

  In scala you can multiply a String with a number tell  the output.

Scala Docs are a good way to see what the class is doing and get the description, try to go through the documentation
to find out how to generate a random number and then convert it to Base36 value and try to do it.

  Explore String functions like , take , drop, takeRight, dropRight and find out the advantages or disadvantages of using
  them over substring() function in String




For all these problems try to use Val
*/
//=========================================================================

//Problem 1 : Write a program using string interpolation and a list.
//For example:  if the list is List(10,20,30,40) output should be
//  0 = 10
//1 = 20
//2 = 30

def printValuePerIndex(list: List[Int]): Unit = {
  val arr: Array[Int] = list.toArray
  for (a <- arr) {
    println(s"${arr.indexOf(a)} = $a")
  }
}

//===========================================================================


//Problem 2 Write a program to find the maximum element from list.
//  For example: List(1,5,2,9,7)
//Output should be 9

def getMax(list: List[Int]): Int = {
  def getMaxRec(list: List[Int], max: Int): Int =
    list match {
      case Nil          => max
      case head :: tail => getMaxRec(tail, if (head > max) head else max)
    }
  getMaxRec(list, list.head)
}

//===========================================================================

//Problem 3  Write  a program to get the nth Fibonacci number.
//For example: Fibonacci series (0,1,1,2,3,5,8.....)
//if n is 3 then it should return 2
//if n is 4 then it should return 3

def getFibonacci(n: Int): Int = {
  def getFibonacciRec(n: Int, firstNumber: Int, secondNumber: Int): Int =
    n match {
      case 0 => firstNumber
      case _ =>
        getFibonacciRec(n - 1, secondNumber, firstNumber + secondNumber)
    }
  getFibonacciRec(n, 0, 1)
}


//===========================================================================


//Problem 4 Write a program to sum of the digits of the product of numbers from 1 to n.
//  For example: For, n = 5
//1*2*3*4*5 = 120
//1+2+0 = 3

def getProduct(n: Int): Int = {
  def getProductRec(n: Int, product: Int): Int = n match {
    case 0 => product
    case _ => getProductRec(n - 1, n * product)
  }
  getProductRec(n, 1)
}

def sumOfDigits(n: Int): Int = {
  val product = getProduct(n)
  def sumOfDigitsRec(product: Int, sum: Int): Int =
    product match {
      case 0 => sum
      case _ => sumOfDigitsRec(product / 10, sum + (product % 10))
    }
  sumOfDigitsRec(product, 0)
}
val result = sumOfDigits(5)
