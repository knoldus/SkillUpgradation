//Problem-1:
val list = List(10,20,30,40)

list.zipWithIndex.foreach{
  case (item, index) =>
    println(s"$index => $item")
}

//problem-2:
val list1=List(1,5,2,9,7)
val max = list1.max
println(max)

//problem-3:
def fibonacci(n:Int)=
{
  def fib(n:Int,prev:Int=0,next:Int=1):Int= n match
  {
    case 0 => prev
    case 1 => next
    case _ => fib(n-1,next,(next+prev))

  }

  fib(n)
}

println(fibonacci(4))

//problem-4:

def factorial(n: Int): Int =
{
  def factorialAcc(num: Int, n: Int): Int =
  {
    if (n <= 1)
      num
    else
      factorialAcc(n * num, n - 1)
  }
  factorialAcc(1, n)
}
val fact= factorial(5)
println(fact)
val sum = fact.toString.map(_.asDigit).toList.sum
println(sum)



