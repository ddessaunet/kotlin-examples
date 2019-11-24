package basic.comparison

fun main(args: Array<String>) {
    val overloadedMethodsKotlin = OverloadedMethodsKotlin()

    overloadedMethodsKotlin.printMessage("Hola")
    overloadedMethodsKotlin.printMessage("Hola","¡","mundo!")
    overloadedMethodsKotlin.printMessage(prefix = "¡", message = "Hola", sufix = "mundo!")
}

class OverloadedMethodsKotlin {

    fun printMessage(message: String, prefix: String = "", sufix: String = "") {
        println("$prefix $message $sufix")
    }
}

