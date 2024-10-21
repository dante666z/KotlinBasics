package dev.zurielzarate.firsttest.sintaxis

fun main() {
    val jose = Person("Jose", "galdamez", CivilStatus.Single)
    val jennifer = Person("Jennifer", "galdamez", CivilStatus.Comprometed)
    val pedro = Person("Pedro", "galdamez", CivilStatus.Single)

    if(jose.civiStatus == pedro.civiStatus) {
        println("Tienen el mismo estado civil")
    } else {
        println("No tienen el mismo estado civil")

    }

}