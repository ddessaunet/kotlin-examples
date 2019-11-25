package basic.extention

fun main(args: Array<String>) {
    "Dario".sayHi()
}

fun String.sayHi() {
    println("$this dice Hola!")
}