package basic.comparison

fun higherOrder(f: (Int, Int) -> Int): Int {
    return f(1, 2)
}

fun higherOrderNoParams(f: () -> Unit) {
    f()
}

fun main(args: Array<String>) {

    val result = higherOrder( {x, y -> x + y} )
    val result1 = higherOrder { x, y -> x + y }

    println(result)
    higherOrderNoParams { print("Nothing") }

    val numbers = 1..100

//    SImilar to Groovy
    numbers.filter { it < 100 }.forEach { println(it) }

}