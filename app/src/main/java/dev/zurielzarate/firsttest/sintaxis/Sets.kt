package dev.zurielzarate.firsttest.sintaxis

fun main() {
    val lisOfPokemons = mutableListOf<String>("Pikachu", "Bulbasaur", "Charmander")
    lisOfPokemons.add("Squirtle")
    lisOfPokemons.add("Mew")
    lisOfPokemons.add("Pikachu")

    println("Lista de pokemons")
    println(lisOfPokemons)

    val setOfPokemons = mutableSetOf<String>("Pikachu", "Bulbasaur", "Charmander")
    setOfPokemons.add("Squirtle")
    setOfPokemons.add("Mew")
    setOfPokemons.add("Pikachu")

    println("Set de pokemons")
//    println(setOfPokemons[]) Error, el set contiene valores no ordenados o no indexados

}