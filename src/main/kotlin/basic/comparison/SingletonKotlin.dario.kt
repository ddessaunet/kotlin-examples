package basic.comparison

object SingletonKotlin {
    val property: String = "I am a singleton"
}

fun main(args: Array<String>) {
    println(SingletonKotlin)
    println(SingletonKotlin)
    println(SingletonKotlin)
}