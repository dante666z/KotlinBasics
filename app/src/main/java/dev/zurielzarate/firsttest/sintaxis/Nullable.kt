package dev.zurielzarate.firsttest.sintaxis

fun main() {
    var name = "Jose"
    var course: String? = null

    println(course)

    course = "Kotlin"

    if(course == null) {
        println("$name is not studying")
    }else {
        println("$name is studying $course")
    }

    var num1: Int? = null // 10
    var result: Int = num1!! + 5

    println(result)
}