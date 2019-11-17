/*
* Useful for APIs when you face migrations
* and also take advantage of IDE capabilities.
*
* */

package main.kotlin.advance.typealiases

typealias AwesomeCustomer = Customer

@Deprecated("Customer is now AwesomeCustomer", ReplaceWith("AwesomeCustomer"))

class Customer {

}

fun main(args: Array<String>) {

    val customer = Customer()
}

