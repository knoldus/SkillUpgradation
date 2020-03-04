
val str: String = "scientists"
/*
Question 1
Count the frequency of the character in the string & print it the same order.
*/
str.map(character=>(character,str.count(c=>character==c))).distinct

/*
Question 2
Remove duplicate character from the string & print the remaining string in the same order.
*/
str.distinct

/*
Question 3
Remove vowels from the string & print the remaining string in the same order.
*/
val s=str.replaceAll("[^b-df-hj-np-tv-z]","")

/*
Question 4
Extract all the alphanumeric words with the constant "alphanumeric" from a given string. for example, if the given string is "I am no1 programmar at 2nd street", the output should be: "I am alphanumeric programmar at alphanumeric street"
*/
val alphaNumeric = "I am no1 programmar at 2nd street"
alphaNumeric.replaceAll("[a-zA-Z]*[0-9]+[a-zA-Z]*","alphanumeric")