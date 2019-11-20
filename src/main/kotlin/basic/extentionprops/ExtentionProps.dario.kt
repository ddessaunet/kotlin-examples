package main.kotlin.basic.extentionprops

import java.math.BigDecimal

fun main(args: Array<String>) {

    val bd = 10.BD

}

private val Int.BD: BigDecimal
    get() {
        return BigDecimal(this)
    }