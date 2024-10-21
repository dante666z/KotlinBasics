package dev.zurielzarate.firsttest.sintaxis

fun main() {
    val mapOfPokemons = mutableMapOf<String, String>("pikachu" to "electric", "bulbasaur" to "grass", "squirtle" to "water")

    println(mapOfPokemons["pikachu"])

    // Dos maneras diferentes de asignar valores
    mapOfPokemons.put("charmander", "fire")
    mapOfPokemons["Mew"] = "psychic"

    println(mapOfPokemons)
}