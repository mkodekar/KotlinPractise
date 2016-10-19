/**
 * Created by rkodekar on 10/20/16.
 */
fun main(args: Array<String>) {
    greet("Rehan", "Kodekar")
    call("Rehan Kodekar", "Bhendi Bazar", 25)
}

fun greet(firstname: String, lastnmae: String) {
    println("Good morning   $firstname $lastnmae")
}

fun call(name: String, location: String, age: Int) {
    println("Hello $name , you live at $location and your age is $age")
}