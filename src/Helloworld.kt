/**
 * Created by rkodekar on 10/20/16.
 */

fun main(args: Array<String>) {
    val firstname: String = "Rehan"
    val lastname: String = "Kodekar"
//    val name: String? = firstname + " " + lastname
    println("$firstname $lastname")
    greet(englishGreeting())
    greet(hindiGreeting())
}

fun greet(msg: String) {
    println(msg)
}

fun englishGreeting() : String = "Hello world"

fun hindiGreeting() : String = "Namaste"
