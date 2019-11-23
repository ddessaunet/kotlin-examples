package main.kotlin.basic.threads

import kotlin.concurrent.thread

fun threads() {
    val jobs = 1..1000000
    jobs.forEach {
        thread {
            Thread.sleep(1000L)
            println(".")
        }
    }
}

fun main(args: Array<String>) {
    threads()
}