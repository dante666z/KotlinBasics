package dev.zurielzarate.firsttest.sintaxis

fun main() {

//    val friends = listOf<String>("Monica", "Ross", "Chandler", "Joey", "Rachel", "Phoebe")
//
//    friends.forEach{ name ->
//        println(name)
//    }

    myLambda("Carlos"){ fullname ->
        println("Hola $fullname")
    }

}

fun myLambda(name: String, saludar: (fullname: String) -> Unit) {
    println("Estoy entrando a la función lambda")
    saludar("$name Joeles")
    println("Estoy saliendo de la función lambda")
}