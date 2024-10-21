package dev.zurielzarate.firsttest.sintaxis

fun main() {
    val jose = Usuario("Jose", 32, "prueba@gmail.com", "HOCRND01")
    val erick = Usuario("Erick", 32, "erick@gmail.com", "HOCRND01")
    val jennifer = Usuario("Jennifer", 32, "jennifer@gmail.com", "HOCRND01")

    jose.addFriend(jennifer)
    jennifer.addFriend(erick)
    erick.addFriend(jennifer)
    jose.addFriend(erick)
    jennifer.addFriend(jose)

    jose.getFriends()
    jennifer.getFriends()
    erick.getFriends()


//    println(jose.name)
//    println(jose.age)
//    jose.getEmail("user")
//    jose.getDNI("admin")

}