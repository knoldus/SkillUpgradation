//Problem 1 : Write a program using string interpolation and a list.
//For example:  if the list is List(10,20,30,40) output should be
//  0 = 10
//1 = 20
//2 = 30

def printList(list: List[Int]): Unit = {
  list.foreach( elem =>
    println(s"${list.indexOf(elem)} = $elem"))
}
printList(List(10, 20, 30, 40))

//Problem 2 Write a program to find the maximum element from list.
//  For example: List(1,5,2,9,7)
//Output should be 9

def maxInList(list: List[Int]): Int = {
  list.reduce((elem1, elem2) =>
    if(elem1 > elem2) elem1 else elem2
  )
}
maxInList(List(1,5,2,9,7))

//Problem 3  Write  a program to get the nth Fibonacci number.
//For example: Fibonacci series (0,1,1,2,3,5,8.....)
//if n is 3 then it should return 2
//if n is 4 then it should return 3

def nthFib(num: Int): Int = {
  def nthFibHelper(a: Int, b: Int, count: Int): Int = {
    (a,b,count) match {
      case (v1, v2, cnt) if cnt==num => v1 + v2
      case (v1, v2, cnt) => nthFibHelper(v2, v1 + v2, cnt + 1)
    }
  }
  nthFibHelper(0,1,2)
}

nthFib(6)

//Problem 4 Write a program to sum of the digits of the product of numbers from 1 to n.
//  For example: For, n = 5
//1*2*3*4*5 = 120
//1+2+0 = 3

def sumCalculator(num: Int): Int = {

  def productCalculator(num: Int, productSoFar: Int): Int = {
    (num, productSoFar) match {
      case (1, prod) => prod
      case (num, prod) => productCalculator(num-1, prod * num)
    }
  }
  val product = productCalculator(num, 1)
  product.toString.toList
    .map(_.asDigit)
    .foldLeft(0)(_ + _)
}

sumCalculator(9)
