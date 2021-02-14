// Problem 1 : Write a program using string interpolation and a list.
  // For example:  if the list is List(10,20,30,40) output should be
  // 0 = 10
  // 1 = 20
  // 2 = 30
  def indexOfListElements(list: List[Int]): Unit = {
    list.zipWithIndex.foreach {
      case (element, index) => println(index + "=" + element)
    }
  }

  indexOfListElements(List(10, 20, 30))

  // Problem 2 Write a program to find the maximum element from list.
  // For example: List(1,5,2,9,7)
  // Output should be 9

  def maxInList(list: List[Int]) = {
    if (list.isEmpty) throw new NoSuchElementException
    list.reduceLeft((current, next) => if (current > next) current else next)
  }

  println(maxInList(List(1, 5, 2, 9, 7)))

  // Problem 3  Write  a program to get the nth Fibonacci number.
  // For example: Fibonacci series (0,1,1,2,3,5,8.....)
  // if n is 3 then it should return 2
  // if n is 4 then it should return 3
  def nthFibonacciTerm(number : Long) : BigInt = {

    @scala.annotation.tailrec
    def fib_tail_recursion(num: Long, a:Long, b:Long): BigInt = num match {
      case 0 => a
      case _ => fib_tail_recursion( num-1, b, a+b )
    }
    fib_tail_recursion(number, 0, 1)
  }

  println(nthFibonacciTerm(50))

  //Problem 4 Write a program to sum of the digits of the product of numbers from 1 to n.
  //  For example: For, n = 5
  //1*2*3*4*5 = 120
  //1+2+0 = 3
  def sumOfDigitsOfProduct(num: Long): BigInt = {

    @scala.annotation.tailrec
    def productOfNumbers(number: Long, product: BigInt): BigInt = {
      number match {
        case 1 => product
        case _ => productOfNumbers(number-1, product * number)
      }
    }
    if(num == 0)
      0
    else {
      val product = productOfNumbers(num, 1)
      product.toString.toList.map(_.asDigit).sum
    }
  }
  println(sumOfDigitsOfProduct(100))
