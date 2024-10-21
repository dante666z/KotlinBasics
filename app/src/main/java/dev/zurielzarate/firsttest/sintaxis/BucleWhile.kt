package dev.zurielzarate.firsttest.sintaxis

fun main() {
    val listOfFriends = listOf<String>("Monica", "Ross", "Chandler", "Rachel", "Joey", "Phoebe")

    var index = 0

    while (index < listOfFriends.size) {
        println("Index: $index " + listOfFriends[index])
//        index++
        index += 1

    }

}