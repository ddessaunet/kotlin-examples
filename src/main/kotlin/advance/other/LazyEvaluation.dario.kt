package main.kotlin.advance.other

fun main(args: Array<String>) {

    val numbers = 1..1000000

    val byFive = numbers.filter {
//        print(it)
        it % 5 == 0
    }.take(30)

    val byFiveLazy = numbers.asSequence().filter {
        println(it)
        it % 5 == 0
    }.take(30)

//    println(byFive)
//    println(byFiveLazy)
//    println(byFiveLazy.toList())

    val byTwo = generateSequence(1) { it + 1 }.filter { it % 5 == 0 }.take(30)

    println(byTwo.toList())
}