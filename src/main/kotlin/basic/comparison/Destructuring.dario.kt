package basic.comparison

fun returnPair(): Pair<String, String> {
    return Pair("Dario", "Alejandro")
}

fun main(args: Array<String>) {
    val pair = returnPair()

    println(pair.first)
    println(pair.second)

    val (firstName, middleName) = returnPair()

    println(firstName)
    println(middleName)

    val (_, email) = Email("Dario", "ddessaunet@fi.uba.ar")

    println(email)
}