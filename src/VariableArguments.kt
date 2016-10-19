/**
 * Created by rkodekar on 10/20/16.
 */
fun main(args: Array<String>) {
    names("Rehan", "Santosh", "Pritesh")
    anothername("Rehan", "Santosh", "Pritesh", age = 25)
}

fun names(vararg names: String) {
    for (n in names) {
        println(n)
    }
}

fun anothername(vararg names: String, age: Int) {

    for (n in names) {
        println("$n is $age old")
    }
}