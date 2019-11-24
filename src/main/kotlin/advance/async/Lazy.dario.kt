package advance.async

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) = runBlocking {

    val time = measureTimeMillis {
        val one = async(Dispatchers.Default/*, CoroutineStart.LAZY*/) {
            function1()
        }
        val two = async(Dispatchers.Default/*, CoroutineStart.LAZY*/) {
            function2()
        }
        println("Result is ${one.await() + two.await()}")
    }
    println("Total time: $time")
}