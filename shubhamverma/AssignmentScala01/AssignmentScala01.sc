// Problem 1 : Write a program using string interpolation and a list.
// For example:  if the list is List(10,20,30,40) output should be 
// 0 = 10
// 1 = 20
// 2 = 30

def indexes(list: List[Int]): String = {
    list.zipWithIndex.map{
      case (element, index: Int) => s"$element = $index"}.mkString("\n")
  }

// Problem 2 Write a program to find the maximum element from list.
// For example: List(1,5,2,9,7)
// Output should be 9

list.sorted.lastOption

def findMax(list: List[Int]): Int =  if(list.isEmpty) 0 else list.foldLeft(0)((current, next) => if (current > next) current else next)


// Problem 3  Write  a program to get the nth Fibonacci number.
// For example: Fibonacci series (0,1,1,2,3,5,8.....)
// if n is 3 then it should return 2
// if n is 4 then it should return 3

def getFibo(n: Int) = (1 to n).toList.foldLeft((1, 0)){
	case ((ele, previous), a) => (ele + previous, ele)
}

// Problem 4 Write a program to sum of the digits of the product of numbers from 1 to n.
// For example: For, n = 5
// 1*2*3*4*5 = 120
// 1+2+0 = 3 

//product of numbers from 1 to n

(1 to n).toList.foldLeft(1)((product, elem) => product * element)


def getDigitsSum(number: Int): Int = {
	def helper(number: Int, sum: Int = 0): Int = {
		if(number == 0) sum else {
			val num = number % 10
			val next = number / 10
			helper(next, num + sum)
		} 
	}
	if(number == 0) 0 else helper(number)
}


