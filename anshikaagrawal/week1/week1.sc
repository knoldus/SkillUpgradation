import scala.annotation.tailrec

/*Problem 1 : Write a program using string interpolation and a list.
For example:  if the list is List(10,20,30,40) output should be
0 = 10
1 = 20
2 = 30*/

def indexList[A](list:List[A]): Unit = {
  if(list.isEmpty)
    println("List is empty")
  else
    list.foreach(element => println(s"${list.indexOf(element)} = $element\n"))
}

indexList(List(10,20,30,40))

/*
Problem 2 Write a program to find the maximum element from list.
  For example: List(1,5,2,9,7)
Output should be 9*/

def maximum(list: List[Int]):Any = {
    if(list.isEmpty)
        println("List is empty")
    else{
        @tailrec
        def findMax(currentMax:Int = list.head, nextList:List[Int] = list.tail): Int ={
            currentMax match {
                case _ if nextList.isEmpty => currentMax
                case _ if (currentMax < nextList.head) || (currentMax == nextList.head) => findMax(nextList.head, nextList.tail)
                case _ => findMax(currentMax, nextList.tail)
            }
        }
        findMax()
    }
}

maximum(List(1,5,2,9,7))

/*
Problem 3  Write  a program to get the nth Fibonacci number.
For example: Fibonacci series (0,1,1,2,3,5,8.....)
if n is 3 then it should return 2
if n is 4 then it should return 3*/

def nthFibonacci(n:Int):Int = {
    @tailrec
    def findElement(currentIndex : Int, prev : Int = 0, next : Int = 1) : Int =
    {
        currentIndex match {
            case 0 => prev
            case 1 => next
            case _ => findElement(currentIndex -1, next, prev + next)
        }
    }
    findElement(n)
}

nthFibonacci(4)


/*
Problem 4 Write a program to sum of the digits of the product of numbers from 1 to n.
For example: For, n = 5
1*2*3*4*5 = 120
1+2+0 = 3*/

def FindProductSum(number:Int): Int = {
    @tailrec
    def product(number:Int,multiply:Int=1):Int={
        number match{
            case 0 => multiply
            case 1 => multiply
            case _ => product(number-1,multiply*number)
        }
    }
    @tailrec
    def sum(digit:Int=0,currentSum:Int=0,productOutput:Int=product(number)):Int= {
        if(productOutput > 0)
            sum(productOutput % 10, currentSum + digit, productOutput / 10)
        else
            currentSum+ digit
    }
    sum()
}

FindProductSum(5)
