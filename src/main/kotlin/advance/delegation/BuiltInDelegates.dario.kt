package main.kotlin.advance.delegation

import kotlin.properties.Delegates

class Veto {
    var value: String by Delegates.vetoable("String") {
        props, old, new -> new.startsWith("S")
    }
}

fun vetoExample() {
    val veto = Veto()
    println(veto.value)
    veto.value = "Change"
    println(veto.value)
    veto.value = "Strange"
    println(veto.value)
}

fun main(args: Array<String>) {

    vetoExample()
}