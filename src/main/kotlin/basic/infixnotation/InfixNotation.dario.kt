package main.kotlin.basic.infixnotation

infix fun String.isSameAs(value: String) = this == value

fun main(args: Array<String>) {

    "This".isSameAs("This")
    "This" isSameAs "This"
}