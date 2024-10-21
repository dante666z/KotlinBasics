package dev.zurielzarate.firsttest.sintaxis

fun main() {
    val friends = listOf<String>("Monica", "Ross", "Chandler", "Rachel", "Phoebe", "Joey")
    val ages = listOf<Int>(20, 23, 30)
   /* println(friends[1])
    println(ages[1])
    print(friends.first())*/
//    println(friends.first())
//    println(friends.last())
//    println(friends.size)
//

    // GET
//    println(friends[0])
//    println(friends.get(0))

    // SET
//    friends.set(0, "Juan") //  No se puede editar una lista
     var newFriends = mutableListOf<String>("Jose", "Maria", "Peter")

    newFriends.set(0, "Zuriel")
    println(newFriends[0])

    newFriends.add("Mariela")
    println(newFriends)


//    for (friend in friends) {
//        println(friend)
//    }


}