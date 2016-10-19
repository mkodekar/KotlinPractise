/**
 * Created by rkodekar on 10/20/16.
 */
fun main(args: Array<String>) {
    val n = arrayOf("Rehan", "Santosh", "pritesh")
    fugitives(*n)
}

fun fugitives(vararg escapees: String) {
    names2(*escapees)
}

fun names2(vararg names2 : String) {
    println("Size of the array is ${names2.size}" )
    println(names2[0])
    val nns: Array<out String> = names2
    println(nns[1])
}

