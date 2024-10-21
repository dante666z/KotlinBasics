package dev.zurielzarate.firsttest.sintaxis

sealed class CivilStatus {
    object Married : CivilStatus()
    object Single : CivilStatus()
    object Divorced : CivilStatus()
    object Widowed : CivilStatus()
    object Comprometed : CivilStatus()
}