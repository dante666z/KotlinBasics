package dev.zurielzarate.firsttest.sintaxis

fun main() {
    val name = "Joseles"
    val role = "admin"
    val age = 17

    if (age > 50) {
        println("$name es un adulto mayor")
    } else if(age > 30) {
        println("$name es un adulto.")
    } else if(age > 18) {
        println("$name es un adulto joven.")
    } else {
        println("$name es menor de edad.")
    }

    if (role == "user") {
        println("$name Tienes acceso a tu perfil.")
    }
    if (role == "admin") {
        println("$name Tienes acceso a todos los contenidos.")
    }
    if(role == "guest") {
        println("$name Solo ando viendo.")
    }

}