/*
* Algebraic data type
* */

package main.kotlin.advance.other

/*
* Seal will close the hierarchy on this file
* */
sealed class Result()

class Success(val message: String) : Result()
class Failure(val statusCode: Int) : Result()

fun getPage(url: String): Result {
    if (url != "") {
        return Success("Everything is fine")
    } else {
        return Failure(404)
    }
}

fun main(args: Array<String>) {
    val x = if (args.count() > 0) {
        println("Last line")
        20
    } else {

    }

    println(x)
}