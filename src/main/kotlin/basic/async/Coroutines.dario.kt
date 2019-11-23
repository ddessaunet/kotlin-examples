package main.kotlin.basic.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    coroutines()
}

fun coroutines() = runBlocking {
    val jobs = List(1000000) {
        launch {
            delay(1000L)
            print(".")
        }
    }

    jobs.forEach { it.join() }

}