
object Assignment2 extends App {

  //problem 1: Count the frequency of the character in the string & print it the same order.
  def characterFrequency(string: String): Unit = {

    val mapping = string.toList.filter(_.isLetter).groupBy(letter => letter)
      .map(keyLetter => keyLetter._1 -> keyLetter._2.size)
    for (letter <- string.toSeq.distinct) {
      println(letter + "->" + mapping.getOrElse(letter, 0))
    }
  }
  characterFrequency("datalakehouse")


  // Problem 2: Remove duplicate character from the string & print the remaining string in the same order.
  def removeDuplicateCharacter(string: String): Unit = {
    println(string.toList.distinct.mkString(""))
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
