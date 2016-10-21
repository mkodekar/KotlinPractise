package mypractices.dataclasses

/**
 * Created by rkodekar on 10/22/16.
 */
class MainWorkspaceClass {

    fun main(args: Array<String>) {

        val people: People = People(1, "Rehan", "mkodekar@zoho.com")
        val people1: People = People(1, "Rehan", "mkodekar@zoho.com")

        println(people)

        if (people == people1) {
            println("Both are fucking same")
        }

    }
}