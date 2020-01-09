/** Some interesting things that you can try :
 * In Scala REPL, type 3 : followed by a tab key and see what methods can be applied
 * *
 * In scala you can multiply a String with a number tell  the output.
 * *
 * Scala Docs are a good way to see what the class is doing and get the description, try to go through the documentation
 * to find out how to generate a random number and then convert it to Base36 value and try to do it.
 * *
 * Explore String functions like , take , drop, takeRight, dropRight and find out the advantages or disadvantages of using
 * them over substring() function in String
 * *
 *
 *
 *
 * For all these problems try to use Val
 */

//=====================================================================//

/** Problem 1 : Write a program using string interpolation and a list.
 * For example:  if the list is List(10,20,30,40) output should be
 * 0 = 10
 * 1 = 20
 * 2 = 30
 */

def listPrinter[A](list: List[A]): Unit =
  list.zipWithIndex.foreach(x => println(s"${x._1} = ${x._2}"))

listPrinter(List(1, 2, 3))

/** Problem 2 Write a program to find the maximum element from list.
 * For example: List (1, 5, 2, 9, 7)
 * Output should be 9
 */

def maximum(list: List[Int]) =
  list
    .sortWith((x: Int, y: Int) => x < y)
    .takeRight(1)(0)

println(s"Maximum: ${maximum(List(1, 5, 2, 9, 7))}")

/** Problem 3 Write a program to get the nth Fibonacci number.
 * For example: Fibonacci series (0, 1, 1, 2, 3, 5, 8.....)
 * if n is 3 then it should return 2
 * if n is 4 then it should return 3
 */

def fibonacci(number: Int): Int =
  number match {
    case 0 | 1 => number
    case _ => fibonacci(number - 1) + fibonacci(number - 2)
  }

println(s"${fibonacci(4)}")

/** Problem 4 Write a program to sum of the digits of the product of numbers from 1 to n.
 * For example: For, n = 5
 * 1 * 2 * 3 * 4 * 5 = 120
 * 1 + 2 + 0 = 3
 */

def sumCalculator(number: Int): Int =
  if (number == 0) number else number % 10 + sumCalculator(number / 10)

sumCalculator(number = (
  (1 to 4)
    .toList
    .foldLeft(1)((x: Int, y: Int) => x * y)))
