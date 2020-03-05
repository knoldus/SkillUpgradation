import scala.collection.mutable

object Assignment2 extends App {

  //problem 1: Count the frequency of the character in the string & print it the same order.
  def characterFrequency(string: String): Unit = {

    val lhs: mutable.LinkedHashSet[Char] = new mutable.LinkedHashSet()
    val mapping = string.toList.filter(_.isLetter).groupBy(letter => letter)
      .map(keyLetter => keyLetter._1 -> keyLetter._2.size)
    for (letterIndex <- 0 until string.length) {
      lhs.add(string.charAt(letterIndex))
    }
    for (letter <- lhs) {
      println(letter + "->" + mapping.getOrElse(letter, 0))
    }
  }
  characterFrequency("datalakehouse")


  // Problem 2: Remove duplicate character from the string & print the remaining string in the same order.
  def removeDuplicateCharacter(string: String): Unit = {

    val lhs: mutable.LinkedHashSet[Char] = new mutable.LinkedHashSet()
    for (letterIndex <- 0 until string.length) {
      lhs.add(string.charAt(letterIndex))
    }
    for (letter <- lhs) {
      println(letter)
    }

  }
  removeDuplicateCharacter("datalakehouse")

  // Problem-3 Remove vowels from the string & print the remaining string in the same order.
  def removeVowels(string: String): Unit = {
    println(string.replaceAll("[aeiouAEIOU]", ""))
  }
  removeVowels("datalakehouse")

  // Problem-4 Extract all the alphanumeric words with the constant "alphanumeric" from a given string.
  def extractAlphanumeric(string: String): Unit = {

    println(string.replaceAll("[a-zA-Z]*[0-9]+[a-zA-Z]*","alphanumeric"))
  }
  extractAlphanumeric("I am no1 programmar at 2nd street")

}
