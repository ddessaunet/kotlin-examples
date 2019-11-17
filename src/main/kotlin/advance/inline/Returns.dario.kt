package main.kotlin.advance.inline

fun main(args: Array<String>) {
//    containingFunction()
//    containingFunction2()
//    containingFunction3()
//    containingFunction4()
    containingFunction5()
}

/*
* Non-local return
*
* In Kotlin, we can only use a normal, unqualified return to exit a named function or
* an anonymous function. This means that to exit a lambda, we have to use a label, and a bare
* return is forbidden inside a lambda, because a lambda cannot make the enclosing function return
*
* */
fun containingFunction() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) return
    }
    println("Hello")
}

inline fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction2() {
    val numbers = 1..100
    numbers.myForEach {
        if (it % 5 == 0) return
    }
    println("Hello")
}

fun containingFunction3() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) return@forEach
    }
    println("Hello")
}

fun containingFunction4() {
    val numbers = 1..100
    numbers.forEach customLabel@{
        if (it % 5 == 0) return@customLabel
    }
    println("Hello")
}

fun containingFunction5() {
    val numbers = 1..100
    numbers.forEach(fun (value) {
        if (value % 5 == 0) return
    })
    println("Hello")
}