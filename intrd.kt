
//val limits the scope to current block, by default variables are non nullable
//val name: String = "hello"

//can also be written as :
//val name = "hello"

//var has a full all file support
//val name: String = "hello"

//to make it nullable do:
//val name: String? = null

//switch case in kotlin:
//val a = "ayy"
//when(a){
//    "ay" -> println("its ay")
//    "ayy" -> println("its ayy")
//    else -> println("defaulted") //default case
//}

//assigning variable using if statement:
//val p = 5
//val q = 4
//val max = if (p > q) p else q
//println("max is = $max")

//fun greeting(){
//    println("hello")
//}

//non nullable string function:
//fun greeting(): String{
//    return "hello"
//}
//above function is equivalent to:
//fun greeting() = "hello"

//a single line function:
//fun sayHello(itemToGreet: String) = println("hello $itemToGreet")

//simple unindexed for loop
//val things = arrayOf("a", "b", "d")
//for (thing in things){ println(thing) }

//things.forEach { item: String -> println(item)} //a forEach loop

//things.forEachIndexed{index, item -> println("$item is at $index")} //a forEachIndex loop

//    val map = mapOf(1 to "a", 2 to "b", 3 to "c")  //a Map (key value pairs)
//    map.forEach{key, value -> println("$key -> $value")}  //prints key value pairs

//all collectors are by default immutable, to make them mutable do:
//    val things = mutableListOf("a", "b", "d")
//    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//    map.put(4, "k")

//vararg is a keyword which means we can provide variable number of arguments to a function
//fun sayHello(vararg itemsToGreet: String){
//itemsToGreet.forEach{item -> println(item)}

//to pass parameters in any order:
//fun greet(greeting: String, name: String) = println("$greeting $name")
//greet(name = "basha", greeting = "hi")  //do this in your function call

//to set default parameters:
//fun greet(greeting: String = "hi", name: String = "basha") = println("$greeting $name")
//greet(name = "basha")  //greeting parameter will be defaulted to "hi"

//to create an object of class named Person:
//val person = Person()

//constructors are made in within the class name
//class Person(_firstName: String, _lastName: String){}

//you can initialize the constructor:
//class Person(val firstName: String, val lastName: String){}

//you can provide default values to this constructor:
//class Person(val firstName: String = "jaikant", val lastName: String = "sheekrey"){}

//ELVIS OPERATOR - used to check if a variable is null or not:
//val valueCheck = value :? "null detected"
fun main() {
    val j = 5
    println(j)
}