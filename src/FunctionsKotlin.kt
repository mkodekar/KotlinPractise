/**
 * Created by rkodekar on 10/20/16.
 */
fun main(args: Array<String>) {
    val total = add(2, 3)
    showMessage(total.toString() +  " to string call")
    showInteger(total)
}

fun add(a: Int, b: Int) = a + b
fun showMessage(msg: String) = println(msg)
fun showInteger(msg: Int) = println(msg)