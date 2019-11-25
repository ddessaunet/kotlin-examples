package basic.comparison

import comparison.CustomerJava

class KotlinNulls {

    fun validateCustomer(customer: CustomerKotlin) {
        if (customer.name.startsWith("A")) {
            throw Exception("Name are not allow to begin with A")
        }
    }

    fun validateJavaCustumer(customer: CustomerJava?) {
        if (customer?.name?.startsWith("A") == true) {
            throw Exception("Name are not allow to begin with A")
        }
    }
}

fun main(args: Array<String>) {

    KotlinNulls().validateJavaCustumer(null);
}