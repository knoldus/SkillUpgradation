/*Some interesting things that you can try :
In Scala REPL, type 3 : followed by a tab key and see what methods can be applied*/

// This will auto complete the available methods for Int class.


// In scala you can multiply a String with a number tell  the output.

"scalageek" * 3

// Output
// res0: String = scalageekscalageekscalageek

/*Scala Docs are a good way to see what the class is doing and get the description, try to go through the documentation 
to find out how to generate a random number and then convert it to Base36 value and try to do it.
*/

val random = scala.util.Random
java.lang.Long.toString(random.nextLong(),36)

/*Explore String functions like , take , drop, takeRight, dropRight and find out the advantages or disadvantages of using 
them over substring() function in String*/

"scalageek" take 6

"scalageek" drop 3

"scalageek" takeRight 5

"scalageek" dropRight 3


// For all these problems try to use Val

// Problem 1 : Write a program using string interpolation and a list.
// For example:  if the list is List(10,20,30,40) output should be 
// 0 = 10
// 1 = 20
// 2 = 30

val list1 = List(10,20,30,40,50)
list1.indices.foreach(i => println(s"$i = "+list1(i)))

// Problem 2 Write a program to find the maximum element from list.
// For example: List(1,5,2,9,7)
// Output should be 9

val list2 = List(2,8,4,6,1)
println("Max : "+list2.max)

// Problem 3  Write  a program to get the nth Fibonacci number.
// For example: Fibonacci series (0,1,1,2,3,5,8.....)
// if n is 3 then it should return 2
// if n is 4 then it should return 3

def fabo (a:Int, b:Int, c:Int):Int = if(c==0) a else if(c==1) b else fabo(b,a+b,c-1)
val position = 10
println("Fabo no at "+position+" : "+fabo(0,1,position))

// Problem 4 Write a program to sum of the digits of the product of numbers from 1 to n.
// For example: For, n = 5
// 1*2*3*4*5 = 120
// 1+2+0 = 3 

val number : Int = 5
val product : Int = List.range(1,number+1).reduce((a,b) => a*b)
def sum(product : Int):Int = {
  if (product == 0) 0 else product%10+sum(product/10)
}
println("Sum of product digits for "+number+" digits : "+sum(product))
